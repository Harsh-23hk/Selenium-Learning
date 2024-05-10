package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Rightclick {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions action = new Actions(driver);
        action.contextClick(element).perform();

    }
}
