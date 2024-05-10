package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.get("https://sellglobal.ebay.in/seller-center/");

        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.linkText("Protection"));

        Actions action = new Actions(driver);

        action.moveToElement(element).perform();

    }
}
