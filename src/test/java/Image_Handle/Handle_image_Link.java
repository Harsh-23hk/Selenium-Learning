package Image_Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_image_Link {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.opencart.com/index.php?route=common/home");

        driver.findElement(By.xpath("//img[contains(@title,'OpenCart')]")).click();

        if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution")){

            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.close();
        driver.quit();





    }
}
