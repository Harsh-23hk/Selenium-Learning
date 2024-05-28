package DataDrivenTesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class DataProviderWithExcel {

    WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://www.Google.com/");
    }

    @AfterTest
    public void driverClose() {
        driver.quit();
    }

    //data provider accept 2D array
    @DataProvider(name = "searchData")
    public Object[][] searchData() throws IOException {
//        Object[][] searchKeyword = new Object[2][1];
//        searchKeyword[0][0] = "Delhi";
//        searchKeyword[1][0] = "Agra";
        String fileName = "D:\\Login.xlsx";
        Object[][] searchData = getSearchData(fileName, "Sheet2");

        return searchData; // 2 rows and 1columns
    }


    public String[][] getSearchData(String fileName, String sheetName) throws IOException {
        String[][] data = null;
        FileInputStream fis = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);
        int totalRow = sheet.getLastRowNum() + 1;// index start with 0(row 0,1,2) so + 1 to get total row count means(rows 0,1,2,3)
        int totalCell = sheet.getRow(0).getLastCellNum();

        System.out.println("Total Row : " + totalRow); //3
        System.out.println("Total Cell : " + totalCell);//1

        data = new String[totalRow - 1][totalCell];// totalRow - 1 means 1st row is skipped  // (totalRow(3) - 1)3 - 1 = 2

//        for (int currentRow = 1; currentRow < totalRow; currentRow++) {
//            for (int currentCell = 0; currentCell < totalCell; currentCell++) {
//
//                data[currentRow-1][currentCell] = sheet.getRow(currentRow).getCell(currentCell).toString();
//            }
//
//        }

        //currentRow = 0 means 1st row is skipped so 1 is added in for loop to skip 1st row from excel sheet
        for (int currentRow = 1; currentRow < totalRow; currentRow++) {
            Row row = sheet.getRow(currentRow);
            for (int currentCell = 0; currentCell < totalCell; currentCell++) {
                data[currentRow - 1][currentCell] = row.getCell(currentCell).toString();
            }
        }


        workbook.close();
        fis.close();

        return data;
    }

    @Test(dataProvider = "searchData")
    public void searchKeyword(String keyword) {
        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys(keyword, Keys.ENTER);
    }


}
