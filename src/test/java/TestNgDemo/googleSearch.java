package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class googleSearch {



    @Test(testName = "selenium")
    @Parameters({"search"})
    public void googleSearch(String keyword)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
       WebElement search= driver.findElement(By.id("APjFqb"));
        search.sendKeys(keyword);

        Assert.assertEquals(keyword,search.getAttribute("value"));

        driver.close();
    }
}
