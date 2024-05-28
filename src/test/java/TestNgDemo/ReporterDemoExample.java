package TestNgDemo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDemoExample {

    @Test
    public void googleSearch() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Reporter.log("Browser Opened");

        driver.get("https://www.google.com/");
        Reporter.log("Navigated to Google");


        driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
        Reporter.log("Searched for selenium");


        driver.quit();
        Reporter.log("Browser Closed");
    }


}
