package NewWindow;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewTab {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.facebook.com/");
        System.out.println(driver.getTitle());

        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handle=new ArrayList<>();
        handle.addAll(windowHandles);


        driver.close();

        driver.switchTo().window(handle.get(0));

        System.out.println(driver.getTitle());




    }
}
