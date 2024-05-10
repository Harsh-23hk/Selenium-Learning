package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.get("https://demoqa.com/buttons");
        WebElement button=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));


        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform();

        WebElement text = driver.findElement(By.xpath("//p[@id='doubleClickMessage']"));
        System.out.println(text.getText());


    }
}
