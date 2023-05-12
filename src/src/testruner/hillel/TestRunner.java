package testruner.hillel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestRunner {

    public static void start(Class<?> testClass) throws Exception {
        Method[] methods = testClass.getDeclaredMethods();
        List<Method> testMethods = new ArrayList<>();
        Method beforeSuiteMethod = null;
        Method afterSuiteMethod = null;

        for (Method method : methods) {
            if (method.isAnnotationPresent(Annotation.class)) {
                testMethods.add(method);
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

        Collections.sort(testMethods, Comparator.comparingInt(m -> m.getAnnotation(Annotation.class).priority()));

        if (beforeSuiteMethod != null) {
            beforeSuiteMethod.invoke(testClass.newInstance());
        }

        for (Method testMethod : testMethods) {
            testMethod.invoke(testClass.newInstance());
        }

        if (afterSuiteMethod != null) {
            afterSuiteMethod.invoke(testClass.newInstance());
        }
    }
}

