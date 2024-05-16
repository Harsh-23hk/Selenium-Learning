package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demoqa.com/books");


        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        //to get domain name
//        String domain = javascriptExecutor.executeScript("return document.domain;").toString();
//        System.out.println(domain);

        //to get URL
//        String url = javascriptExecutor.executeScript("return document.URL;").toString();
//        System.out.println(url);


        //to enter text in search
//        javascriptExecutor.executeScript("document.getElementById('searchBox').value='Addy Osmani';");
//
//        WebElement link = driver.findElement(By.xpath("//a[text()='Learning JavaScript Design Patterns']"));

        //highlighting the link
//        javascriptExecutor.executeScript("arguments[0].style.border='3px solid green';",link);

        //clicking the link
        // javascriptExecutor.executeScript("arguments[0].click();", link);

        //to zoom
        // javascriptExecutor.executeScript("document.body.style.zoom='200%'");

        //driver.close();


        // flashing
        WebElement element = driver.findElement(By.id("searchBox"));
        String bg = element.getCssValue("backgroundColor");
        for (int i = 0; i < 50; i++) {
            javascriptExecutor.executeScript("arguments[0].style.backgroundColor='#33f0ff'", element);
        }

        try {
            Thread.sleep(20);
        }catch (Exception e){
            e.printStackTrace();
        }
        javascriptExecutor.executeScript("arguments[0].style.backgroundColor='"+ bg + "'", element);

        try {
            Thread.sleep(20);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
