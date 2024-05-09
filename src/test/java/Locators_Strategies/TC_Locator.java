package Locators_Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TC_Locator {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh\\IdeaProjects\\Selenium Learning\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).submit();


        //navigate to inventory

        String current_window_handle = driver.getWindowHandle();
        driver.switchTo().window(current_window_handle);

        List<WebElement> list  = driver.findElements(By.partialLinkText("Sauce"));
        System.out.println(list.size());
        driver.findElement(By.linkText("Sauce Labs Bolt T-Shirt")).click();






    }
}
