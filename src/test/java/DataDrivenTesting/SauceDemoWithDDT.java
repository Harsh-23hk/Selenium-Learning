package DataDrivenTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SauceDemoWithDDT {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



        FileInputStream login = new FileInputStream(new File("D:\\Login.xlsx"));
        XSSFWorkbook workbook = new XSSFWorkbook(login);
        XSSFSheet sheet = workbook.getSheetAt(0);
        int totalRow = sheet.getLastRowNum();
        int totalCell = sheet.getRow(0).getLastCellNum();
        System.out.println(totalRow);
        System.out.println(totalCell);

        for (int currentrow = 1; currentrow < totalRow; currentrow++) {
            driver.get("https://www.saucedemo.com");

            WebElement username = driver.findElement(By.id("user-name"));
            WebElement password = driver.findElement(By.id("password"));


            username.sendKeys(sheet.getRow(currentrow).getCell(0).toString());

            password.sendKeys(sheet.getRow(currentrow).getCell(1).toString());
            driver.findElement(By.id("login-button")).click();


            try{
                Thread.sleep(2000);

            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

        driver.quit();
        workbook.close();

    }
}
