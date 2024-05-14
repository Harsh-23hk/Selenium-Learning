package ScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Capture_ScreenShot {
    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        //step1: convert the driver to take the screenshot

       /* TakesScreenshot screenshot = (TakesScreenshot) driver;

        //step2: call getScreenshotAs method to take the screenshot

        File src = screenshot.getScreenshotAs(OutputType.FILE);

        //step3: copy the screenshot to desired location using "Apache commons io "

        File dest = new File("C:\\Users\\Harsh\\Pictures\\Screenshots\\fb.png");

        FileUtils.copyFile(src,dest);*/


        /*capture the section of the webpage*/

        WebElement section = driver.findElement(By.xpath("//div[contains(@class,'_6luv')]"));

//        section references to the webElement and get the screenshot -> WebElement.getScreenshotAs(OutputType.FILE)
//        WebElement extends TakesScreenshot, SearchContext;

        File src = section.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\Users\\Harsh\\Pictures\\Screenshots\\fb.png");
        FileUtils.copyFile(src,dest);


          // Screenshot of a particular WebElement
        WebElement link =driver.findElement(By.xpath("//a[contains(@id,'u_0_')]"));
        src = link.getScreenshotAs(OutputType.FILE);
        dest = new File("C:\\Users\\Harsh\\Pictures\\Screenshots\\link.png");
        FileUtils.copyFile(src,dest);








    }

}
