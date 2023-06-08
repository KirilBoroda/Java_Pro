package testruner.hillel;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;


public class TestRunner {
    private static final Logger logger = Logger.getLogger(TestRunner.class.getName());

    public static void start(Class<?> testClass) {
        if (testClass == null) {
            throw new IllegalArgumentException("testClass cannot be null");
        }

        try {
            Object testInstance = testClass.getDeclaredConstructor().newInstance();
            Method[] methods = testClass.getDeclaredMethods();
            Map<Integer, List<Method>> methodMap = new TreeMap<>();

            Method beforeSuiteMethod = null;
            Method afterSuiteMethod = null;

            for (Method method : methods) {
                if (method.isAnnotationPresent(Test.class)) {
                    int priority = method.getAnnotation(Test.class).priority();
                    methodMap.computeIfAbsent(priority, k -> new ArrayList<>()).add(method);
                }
                if (method.isAnnotationPresent(BeforeSuite.class)) {
                    if (beforeSuiteMethod == null) {
                        beforeSuiteMethod = method;
                    } else {
                        throw new RuntimeException("Multiple @BeforeSuite methods found in the Test Suite.");
                    }
                }
                if (method.isAnnotationPresent(AfterSuite.class)) {
                    if (afterSuiteMethod == null) {
                        afterSuiteMethod = method;
                    } else {
                        throw new RuntimeException("Multiple @AfterSuite methods found in the Test Suite.");
                    }
                }
            }

            if (beforeSuiteMethod != null) {
                beforeSuiteMethod.invoke(testInstance);
            }

            for (List<Method> methodList : methodMap.values()) {
                for (Method testMethod : methodList) {
                    testMethod.invoke(testInstance);
                }
            }

            if (afterSuiteMethod != null) {
                afterSuiteMethod.invoke(testInstance);
            }

        } catch (Exception e) {
            logger.log(Level.SEVERE, "An exception occurred: " + e.getMessage(), e);
        }
    }
}
