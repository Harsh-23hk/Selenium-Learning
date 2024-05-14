package Tooltips;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Tooltips {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

       String element = driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");

        String actual = "Sign up for Facebook";


        if(element.equals(actual)) {
            System.out.println("Pass");
        }   else {
            System.out.println("Fail");
        }

        driver.close();










    }
}
