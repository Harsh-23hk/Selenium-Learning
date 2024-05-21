package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo2 {

    @Test
    public void verifyLogin(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.saucedemo.com/");
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement login= driver.findElement(By.id("login-button"));
        login.click();
        Assert.assertEquals(driver.getTitle(),"Swag Labs");


        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        driver.quit();
    }

}
