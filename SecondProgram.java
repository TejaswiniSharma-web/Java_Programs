package day1;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SecondProgram extends First_Program {
    @Test
    public void testCase(){
    driver.get("https://www.amazon.in/");
    driver.manage().window().fullscreen();
        Actions act=new Actions(driver);

    }

}
