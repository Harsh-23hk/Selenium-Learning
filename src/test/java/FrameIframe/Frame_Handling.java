package FrameIframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Frame_Handling {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");


        /*
        driver.switchTo().frame("packageListFrame");
        System.out.println(driver.findElement(By.linkText("org.openqa.selenium")).getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        System.out.println(driver.findElement(By.linkText("WebDriver")).getText());

        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");
        System.out.println(driver.findElement(By.linkText("WebDriver")).getText());*/

/*
        driver.get("https://www.rediff.com/");

        driver.switchTo().frame("moneyiframe");

        //not able to find the element in frame so, it will throw an exception here
         String label =driver.findElement(By.id("nseindex")).getText();
        System.out.println(label);*/



        driver.get("https://docs.oracle.com/javase/8/docs/api/");
        //first frame
        driver.switchTo().frame(0);

        System.out.println(driver.findElement(By.linkText("java.lang")).getText());
        driver.findElement(By.linkText("java.lang")).click();

        //switch to the main webpage
        driver.switchTo().defaultContent();


        //second frame
        WebElement frame=driver.findElement(By.name("packageFrame"));
        driver.switchTo().frame(frame);
        driver.findElement(By.linkText("Appendable")).click();



        driver.switchTo().defaultContent();

       List <WebElement>frame_list = driver.findElements(By.tagName("frame"));
       int no_of_frame =frame_list.size();
        System.out.println(no_of_frame);







    }
}
