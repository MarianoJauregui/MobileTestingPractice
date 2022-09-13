import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDemoSetUp {
    protected AppiumDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName","UiAutomator2");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("deviceName", "Android Emulator");
        // capabilities.setCapability("appPackage", "");
        // capabilities.setCapability("appActivity", "");

        capabilities.setCapability("app", System.getProperty("user.dir") + "/apps/ApiDemos-debug.apk");

        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
    }

    @AfterSuite
    public void tearDown(){
        if(null != driver) driver.quit();
    }

}
