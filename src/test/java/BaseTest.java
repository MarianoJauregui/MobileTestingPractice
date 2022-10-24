import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.lang.invoke.MethodHandles;
import java.net.MalformedURLException;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// adb shell dumpsys window | grep -E 'mCurrentFocus'

public class BaseTest {
    protected AppiumDriver driver;
    protected static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    /*
    @Parameters({"platformName", "automationName", "platformVersion", "deviceName", "app", "packageActivity"})
    @BeforeMethod(alwaysRun = true)
    public void setUp(@Optional("Android") String platformName, @Optional("UiAutomator2") String automationName,
                      @Optional("12.0") String platformVersion,
                      @Optional("Android Emulator")  String deviceName,
                      @Optional("com.google.android.deskclock")  String app,
                      @Optional("com.android.deskclock.DeskClock") String packageActivity) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        LOGGER.info("Setting capabilities...");
        capabilities.setCapability("platformName", platformName);
        capabilities.setCapability("automationName",automationName);
        capabilities.setCapability("platformVersion", platformVersion);
        capabilities.setCapability("deviceName", deviceName);


        //capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk");

        if (packageActivity.equals("")) {
            capabilities.setCapability("app", System.getProperty("user.dir") + app);
        } else {
            capabilities.setCapability("appPackage", app);
            capabilities.setCapability("appActivity", packageActivity);
        }


        LOGGER.info("Creating drivers");
        if(platformName.equals("")){
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        }

    }
*/

    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "13");
        caps.setCapability("deviceName", "Android Emulator");
        caps.setCapability("app","com.android.deskclock");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
    LOGGER.info("Closing drivers.");
        driver.quit();

    }

}
