package testruner.hillel;

import java.util.logging.Logger;

public class TestSuite {

    private static final Logger logger = Logger.getLogger(TestSuite.class.getName());

    @Test(priority = 1)
    public void testMethod1() {
        logger.info("Executing Test Method 1");
    }

    @Test(priority = 3)
    public void testMethod2() {
        logger.info("Executing Test Method 2");
    }

    @Test(priority = 2)
    public void testMethod3() {
        logger.info("Executing Test Method 3");
    }

    @Test
    public void testMethod4() {
        logger.info("Executing Test Method 4");
    }

    @BeforeSuite
    public void beforeSuiteMethod() {
        logger.info("Executing Before Suite Method");
    }

    @AfterSuite
    public void afterSuiteMethod() {
        logger.info("Executing After Suite Method");
    }
}
