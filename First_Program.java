package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First_Program {
WebDriver driver;
@BeforeClass
    public void openBrowser(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();

        }
@AfterClass
    public void closeBrowser(){
driver.close();
}
}

