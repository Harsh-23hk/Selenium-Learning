package Mouse_Event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        driver.manage().window().maximize();

        WebElement source =driver.findElement(By.xpath("//div[contains(text(),'Rome') and @id='box6']"));

        WebElement target = driver.findElement(By.id("box106"));

        Actions action = new Actions(driver);
        action.dragAndDrop(source,target).perform();


    }
}
