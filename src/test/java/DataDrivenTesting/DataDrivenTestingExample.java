package DataDrivenTesting;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataDrivenTestingExample {

    public static void main(String[] args) throws IOException {


        File file = new File("D:\\DDTMockData.xlsx");

        //create input stream
        FileInputStream inputStream = new FileInputStream(file);

        // create obj of workbook to handel xls file
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        //to access workbook
        XSSFSheet sheet = workbook.getSheetAt(0);

       /* //to access WorkSheet
        int totalRow = sheet.getLastRowNum();

        int totalCell = sheet.getRow(0).getLastCellNum();

        System.out.println(totalRow);
        System.out.println(totalCell);

        for (int currentRow = 1; currentRow <= totalRow; currentRow++) {
            for (int currentCell = 0; currentCell <= totalCell; currentCell++) {
                System.out.print(sheet.getRow(currentRow).getCell(currentCell));

            }
            System.out.println();*/
        Iterator<Row> rows = sheet.iterator();
        while (rows.hasNext()) {
            Row currentRow = rows.next();
            Iterator<Cell> cells = currentRow.iterator();
            while (cells.hasNext()) {
                Cell currentCell = cells.next();
                System.out.print(currentCell);
                System.out.print("\t");
            }
            System.out.println();

        }
        workbook.close();


    }


}
