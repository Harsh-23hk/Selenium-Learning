package HeadlessBrowser;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class HtmlUnitDriverExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        Htm = new HtmlUnitDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("Selenium", Keys.ENTER);
        System.out.println(driver.getTitle());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
