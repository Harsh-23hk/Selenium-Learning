package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_handling {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.calculator.net");


        JavascriptExecutor js = (JavascriptExecutor) driver;
       // js.executeScript("window.scrollBy(0, 500)");



        //visiblity of an element
        WebElement rl= driver.findElement(By.linkText("BMI Calculator"));
   //     js.executeScript("arguments[0].scrollIntoView();",rl);


        //scroll to bottom of the page
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");


    }
}
