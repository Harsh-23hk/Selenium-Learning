package Form;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LoginFormInSingleStep {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://saucedemo.com/");
       /* driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();*/

        Actions actions = new Actions(driver);
        Action seriesOfActions = actions
                .moveToElement(driver.findElement(By.id("user-name")))
                .click()
                .sendKeys("standard_user", Keys.TAB)
                .sendKeys("secret_sauce", Keys.ENTER).build();

        seriesOfActions.perform();

        driver.quit();

    }
}
