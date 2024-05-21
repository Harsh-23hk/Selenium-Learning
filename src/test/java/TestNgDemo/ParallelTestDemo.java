package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelTestDemo {

    @Test
   public void verifyTitle() {
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();

       driver.get("https://www.saucedemo.com/");
      Assert.assertEquals(driver.getTitle(),"Swag Labs");

       try {
           Thread.sleep(2000);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
        driver.quit();
   }

   @Test
   public void verifyLogo(){
       ////div[@class='login_logo']
       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();

       driver.get("https://www.saucedemo.com/");
       WebElement logo =driver.findElement(By.xpath("//div[@class='login_logo']"));
      Assert.assertTrue(logo.isDisplayed());

       try {
           Thread.sleep(2000);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
       driver.quit();
   }
}
