package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Katalon_Handle_Drop {


    public static void main(String[] args) {

        WebDriver webDriver = new ChromeDriver();
      webDriver.navigate().to("https://Katalon-demo-cura.herokuapp.com/");
        webDriver.findElement(By.xpath("//*[@id='btn-make-appointment']")).click();
        WebElement username = webDriver.findElement(By.id("txt-username"));
        WebElement password = webDriver.findElement(By.id("txt-password"));
        WebElement submit = webDriver.findElement(By.id("btn-login"));
        username.sendKeys("John Doe");
        password.sendKeys("ThisIsNotAPassword");
        submit.click();

     /*     WebElement dropdownFacility = webDriver.findElement(By.id("combo_facility"));
        WebElement radiobutton = webDriver.findElement((By.xpath("//input[@id='radio_program_medicaid']")));
        WebElement visitdate = webDriver.findElement(By.xpath("//input[@id='txt_visit_date']"));

        WebElement bookappointment = webDriver.findElement(By.id("btn-book-appointment"));


        Select select = new Select(dropdownFacility);
        select.selectByIndex(2);

        radiobutton.click();

        visitdate.sendKeys("25/05/2023");


        bookappointment.click();id

*/

        WebElement dropdownFacility = webDriver.findElement(By.id("combo_facility"));
        Select select = new Select(dropdownFacility);
        select.selectByIndex(1);

    }
}
