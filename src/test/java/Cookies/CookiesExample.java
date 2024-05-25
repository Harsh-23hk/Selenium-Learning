package Cookies;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class CookiesExample {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Cookie cookie = new Cookie("key1", "value1");
        driver.manage().addCookie(cookie);

        Cookie cookie1 = driver.manage().getCookieNamed("key1");
        System.out.println(cookie1);
    }
}
