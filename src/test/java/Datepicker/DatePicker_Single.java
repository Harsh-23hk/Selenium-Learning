package Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePicker_Single {
    public static void main(String[] args) {

        String expectedDate = "2";
        String Month = "July";
        String Year = "2024";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://jqueryui.com/datepicker/");

        driver.switchTo().frame(0);
        WebElement datepicker = driver.findElement(By.id("datepicker"));

        datepicker.click();

        //span[@class='ui-datepicker-month']
        //ui-datepicker-year

        while (true) {
            String calMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String calYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();


            if (calMonth.equals(Month) && calYear.equals(Year)) {

                List<WebElement> dates = driver.findElements(By.xpath("//table/tbody/tr/td"));
                for (WebElement day : dates) {
                    String cDates = day.getText();
                    if (cDates.equals(expectedDate)) {
                        day.click();
                        break;
                    }
                }
                break;
            } else {
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }


    }
}
