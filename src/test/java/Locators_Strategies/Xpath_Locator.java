package Locators_Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh\\IdeaProjects\\Selenium Learning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://www.saucedemo.com");

          //xpath
        driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id='password'][@name='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).submit();

        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);

        //x[ath with 'and'  and  'or'
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light' and @name='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//*[@id='add-to-cart-sauce-labs-backpack' or @class='btn btn_primary btn_small btn_inventory ']")).click();








    }
}
