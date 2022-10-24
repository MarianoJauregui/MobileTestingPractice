
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.lang.invoke.MethodHandles;

public class FirstAndroidTest extends BaseTest {
    protected static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());


    @Test
    public void testCalculator(){
        driver.findElement(By.id("pad_btn_b_a")).click(); //7
        driver.findElement(By.id("pad_img_d_d")).click(); // +
        driver.findElement(By.id("pad_btn_c_c")).click(); // 6
        driver.findElement(By.id("pad_img_e_d")).click(); // =


        LOGGER.info((driver.findElement(By.id("lay_normal_body_val")).getText()));
        }


}
