package suite;

import org.junit.BeforeClass;

/**
 * Created by barocko on 8/15/2016.
 */
public class BaseTest {

    {
        com.codeborne.selenide.Configuration.browser = System.getProperty("driver.browser");
    }
}
