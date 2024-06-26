package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTesting {

    WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void launchBrowser(String browser) {
        switch(browser.toLowerCase()) {

            case"chrome":
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;

            case"edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            case"firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            default:
                driver = null;
                break;
        }



    }

    @Test
    public void verifyTitle() {

        driver.get("https://www.google.com/");
        String title = driver.getTitle();

        Assert.assertEquals(title, "Google");
    }

    @AfterMethod
    public void browserClose(){
        driver.quit();
        System.out.println("end of test");

    }
}
