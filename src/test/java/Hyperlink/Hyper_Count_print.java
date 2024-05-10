package Hyperlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Hyper_Count_print {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.calculator.net/");

        List<WebElement>list= driver.findElements(By.tagName("a"));

        System.out.println(list.size());
        for (WebElement el:list){
            System.out.println(el.getText());
        }


    }
}
