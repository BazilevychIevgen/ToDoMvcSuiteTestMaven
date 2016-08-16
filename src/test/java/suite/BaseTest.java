package suite;

import com.codeborne.selenide.Configuration;

/**
 * Created by barocko on 8/15/2016.
 */
public class BaseTest {

    static{
        Configuration.browser = System.getProperty("driver.browser");
    }
}
