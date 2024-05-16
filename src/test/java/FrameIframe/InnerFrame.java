package FrameIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InnerFrame {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

        //switch to frame 1
        driver.switchTo().frame("frame1");

        // child of the frame1
        driver.switchTo().frame("frame3");

        driver.findElement(By.id("a")).click();

        driver.switchTo().parentFrame();
        driver.findElement(By.tagName("input")).sendKeys("hello");

        //switch to main page
        driver.switchTo().defaultContent();

        driver.switchTo().frame("frame2");

        WebElement drop=driver.findElement(By.id("animals"));

        Select select= new Select(drop);
        select.selectByValue("avatar");

        driver.switchTo().defaultContent();

        driver.close();





    }
}
