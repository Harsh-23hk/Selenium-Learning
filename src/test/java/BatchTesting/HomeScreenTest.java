package BatchTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomeScreenTest {

    @Test
    public void launchApplication() {
        System.out.println("Launch Application");
    }

    @Test
    public void verifyTitle() {
        System.out.println("Verify Title");

    }

    @Test
    public void verifyLogo() {
        System.out.println("Verify Logo");
    }
}
