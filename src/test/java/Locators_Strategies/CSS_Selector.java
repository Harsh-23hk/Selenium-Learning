package Locators_Strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {

    public static void main(String[] args) {
        // launch Chrome browser
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsh\\IdeaProjects\\Selenium Learning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.saucedemo.com");

         // css selector tag#id
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        // css selector tag[attribute = value]
        driver.findElement(By.cssSelector("input[type='password']")).sendKeys("secret_sauce");

        // css selector tag.class
        driver.findElement(By.cssSelector("input.btn_action")).click();


        String current_window_handle = driver.getWindowHandle();
        driver.switchTo().window(current_window_handle);


       // driver.findElement(By.cssSelector("button.btn_primary")).click ();

        //tag[attribute* = value] -> contains
        // tag[attribute = value] -> exact match
        // tag[attribute^ = value] -> starts with
        // tag[attribute$ = value] -> ends with

        driver.findElement(By.cssSelector("button[name*=bolt-t")).click();
        driver.findElement(By.cssSelector("button[name$= bike-light ]")).click();




    }
}
