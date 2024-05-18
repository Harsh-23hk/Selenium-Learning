package Datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Date_double {

    public static void main(String[] args) {

        String expectedDay = "18";
        String expectedMonthYear = "May 2024";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.goibibo.com/");


         driver.findElement(By.xpath("//*/span[@class='logSprite icClose']")).click();
         driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();

        WebElement datepicker= driver.findElement(By.xpath("//span[@class='sc-12foipm-8 eXKWBG fswDownArrow']"));
        datepicker.click();



        while (true) {
            String calendarMonthYear = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();

            if(calendarMonthYear.equals(expectedMonthYear)) {
              List<WebElement> calendarDay =  driver.findElements(By.xpath("//div[@class='DayPicker-Day']"));
              for(WebElement dayList:calendarDay){
                  String day =dayList.getText();
                  if (day.equals(expectedDay)){
                      dayList.click();
                      break;
                  }

              }
                break;
            }
            else{
                //driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
                driver.findElement(By.xpath("//span[contains(@class,'DayPicker-NavButton--next')]")).click();

            }

        }


    }
}
