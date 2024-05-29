package Image_Handle;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageSourceURLExample {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//img[contains(@class,'fb_logo')]"));
        String logo = element.getAttribute("src");
        System.out.println(logo);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
