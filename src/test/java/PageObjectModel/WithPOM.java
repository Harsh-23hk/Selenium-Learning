package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithPOM {
    WebDriver driver;

    WithPOM(WebDriver driver) {
        this.driver = driver;
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");

    public void enterUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
    }
    public void enterPassword(String password) {
        driver.findElement(this.password).sendKeys(password);
    }
    public void clickLogin() {
        driver.findElement(this.login).click();
    }
    public void closeBrowser() {
        driver.quit();
    }


}


