package Uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Key;

public class Upload_file {

    public static void main(String[] args) throws AWTException {

        //when type = 'file' is given
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();

        File file = new File("C:\\Users\\Harsh\\Downloads\\profile.png");

        /*WebElement input = driver.findElement(By.xpath("//input[@id='uploadFile']"));
         input.sendKeys(file.getAbsolutePath());*/

        // when type = 'file' is not given

        WebElement input = driver.findElement(By.xpath("//input[@id='uploadFile']"));

        Actions action = new Actions(driver);
        action.moveToElement(input).click().perform();
        Robot robot = new Robot();
        robot.delay(2000);

        StringSelection selection = new StringSelection("C:\\Users\\Harsh\\Downloads\\profile.png");

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);

    }
}
