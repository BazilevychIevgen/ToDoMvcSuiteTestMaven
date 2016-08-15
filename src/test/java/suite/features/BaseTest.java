package suite.features;

import com.codeborne.selenide.Configuration;
import org.junit.BeforeClass;

/**
 * Created by barocko on 8/15/2016.
 */
public class BaseTest {

    static{
        Configuration.browser = System.getProperty("driver.browser");
        System.out.println(System.getProperty("driver.browser"));
    }
}
