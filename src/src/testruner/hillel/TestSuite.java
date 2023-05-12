package testruner.hillel;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestSuite {

    @Annotation(priority = 1)
    public void testMethod1() {
        System.out.println("Executing Test Method 1");
    }

    @Annotation(priority = 3)
    public void testMethod2() {
        System.out.println("Executing Test Method 2");
    }

    @Annotation(priority = 2)
    public void testMethod3() {
        System.out.println("Executing Test Method 3");
    }

    @Annotation
    public void testMethod4() {
        System.out.println("Executing Test Method 4");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        System.out.println("Executing Before Suite Method");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        System.out.println("Executing After Suite Method");
    }
}

