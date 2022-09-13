
import io.appium.java_client.AppiumBy;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.AppiumBy.*;

public class FirstAndroidTest extends AndroidDemoSetUp {


    @Test
    public void clickAppButton(){
        driver.findElement(accessibilityId("App")).click();

        }


}
