package Alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Alert {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/alerts");


            // alert
       /* driver.findElement(By.xpath("//button[@id='alertButton']")).click();

        driver.switchTo().alert().accept();*/

        // conformation alert
       /* driver.findElement(By.xpath("//button[@id='confirmButton']")).click();

        driver.switchTo().alert().dismiss();*/

        //prompt

        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        driver.switchTo().alert().sendKeys("Harsh");

        driver.switchTo().alert().accept();



    }

}
