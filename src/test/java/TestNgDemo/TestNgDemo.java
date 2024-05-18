package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo {

    @Test
    public void verifyPageTitle(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");
        String title = driver.getTitle();
        Assert.assertEquals(title, "Google","Page title is not matching" );
        driver.quit();
    }

}
