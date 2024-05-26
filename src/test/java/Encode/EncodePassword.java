package Encode;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Base64;

public class EncodePassword {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String pass="admin123";
        byte[]encodePassword= Base64.getEncoder().encode(pass.getBytes());
        System.out.println(new String(encodePassword));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));

        byte[]decodePassword= Base64.getDecoder().decode(encodePassword);
        System.out.println(new String(decodePassword));
        WebElement loginEmail = driver.findElement(By.name("username"));
        loginEmail.sendKeys("Admin");
        WebElement loginPass = driver.findElement(By.name("password"));
        loginPass.sendKeys(new String(decodePassword));

        driver.findElement(By.tagName("button")).submit();


    }
}
