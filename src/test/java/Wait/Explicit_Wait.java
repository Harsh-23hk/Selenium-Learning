package Wait;

import com.google.common.base.Stopwatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Explicit_Wait {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.in");
        Stopwatch watch = null;

        //explicit wait is a conditional wait that waits until the specific element is visible.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            watch = Stopwatch.createStarted();
            WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
            el.click();


        } catch (Exception e) {
            watch.stop();
            System.out.println(e);
            System.out.println(watch.elapsed(TimeUnit.SECONDS) + " seconds ");
        }


    }
}
