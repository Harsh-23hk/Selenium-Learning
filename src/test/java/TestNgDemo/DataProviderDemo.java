package TestNgDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    @DataProvider(name = "searchData")
    public Object[][] dataProvider() {
        Object[][]searchKeyword = new Object[3][2];
        searchKeyword[0][0] = "Delhi";
        searchKeyword[0][1]= "Quutab Minar";
        searchKeyword[1][0]= "Agra";
        searchKeyword[1][1]="Taj Mahal";
        searchKeyword[2][0]= "jaipur";
        searchKeyword[2][1]= "Jal mahal";

        return searchKeyword;
    }

    @Test(dataProvider = "searchData")
    public void testcaseGoogleSearch(String State, String Monuments) {

        //launch
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate
        driver.get("https://www.google.com/");

        //element
        WebElement btn=driver.findElement(By.name("btnK"));
        WebElement search=driver.findElement(By.name("q"));

        //action
        search.sendKeys(State + " " + Monuments );
        btn.submit();


        driver.quit();

    }



}
