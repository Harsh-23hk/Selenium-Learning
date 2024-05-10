package Deadlink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Handle_deadlink {

    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://www.deadlinkcity.com/");

         int broke=0;
        List<WebElement> list= driver.findElements(By.tagName("a"));

        for(WebElement link:list){

            String url = link.getAttribute("href");

            URL u = new URL(url);
            HttpURLConnection huk = (HttpURLConnection)u.openConnection();
            huk.setRequestMethod("HEAD");
            huk.connect();


            if(huk.getResponseCode()>=400){
                System.out.println("Dead Link "+url);
                broke++;

            }
            System.out.println(broke);

        }




    }
}
