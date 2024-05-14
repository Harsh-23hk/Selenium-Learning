package WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Handle_WebTable {


    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();

       // driver.get("C:\\Users\\Harsh\\IdeaProjects\\Selenium Learning\\table.html");
        driver.get("https://testautomationpractice.blogspot.com/");

      // String text = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();

        //System.out.println(text);

       List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
       List<WebElement> cols = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
        System.out.println(rows.size());
        System.out.println(cols.size());


       for(int r=2;r<= rows.size();r++){
           for (int c=1;c<=cols.size();c++){
              String data= driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+r+"]/td["+c+"]")).getText();

               System.out.println(data);
           }
       }




    }

}
