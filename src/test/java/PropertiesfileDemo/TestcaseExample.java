package PropertiesfileDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestcaseExample {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
          PropConfigFile propConfigFile = new PropConfigFile();
          driver.get(propConfigFile.getUrl());

        System.out.println(driver.getTitle());
        WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));

        username.sendKeys(propConfigFile.getUsername());
        password.sendKeys(propConfigFile.getPass());
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        driver.quit();
    }
}
