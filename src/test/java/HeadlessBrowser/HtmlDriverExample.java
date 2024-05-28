package HeadlessBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlDriverExample {
    public static void main(String[] args) {

        HtmlUnitDriver driver = new HtmlUnitDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("india gate");
       search.submit();

        System.out.println(driver.getTitle());
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
