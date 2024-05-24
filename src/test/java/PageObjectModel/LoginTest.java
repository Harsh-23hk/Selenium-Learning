package PageObjectModel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();


       // WithPOM withPOM = new WithPOM(driver);
        LoginWithPageFactory  login = new LoginWithPageFactory(driver);
        driver.get("https://www.saucedemo.com/");
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
        login.closeBrowser();
    }
}
