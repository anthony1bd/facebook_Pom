package test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateAccountPageTest extends BaseTest {
	
	@Test
	public void createaccountpagetest() throws InterruptedException {
		getHomePage();
		hp.clickButtoncna();
		getCreateAccountPage();
		cap.typeFirstName("Ant");
		cap.typeLastName("Rod");
		cap.typeEmailAddress("email@gmail.com");
		cap.select_Month("Jun");
		cap.select_Day("12");
	}
	
	
	/*@DataProvider (name = "info")
	public Object[][]datafeeder() throws IOException{
		Object[][] tab;
				// set the file location
				String filePath = "Excelfile/name.xls";
				// use file inputStream
				FileInputStream fis = new FileInputStream(filePath);
				//select the workbook type.
				Workbook wb = new HSSFWorkbook(fis);
				//select the sheet
				sh = wb.getSheet("Sheet1");
				//get rows and column
				int totalRows = sh.getPhysicalNumberOfRows();
				int totalCols = sh.getRow(0).getPhysicalNumberOfCells();
				//deduct -1 bcoz of Header Row.
				tab = new Object[totalRows-1][totalCols];
				
				//for row iteration
				for (int row = 1; row<totalRows; row++) {
					//for column iteration
					for(int col = 0; col<totalCols; col++) {
						tab[row-1][col] = getCellData(row, col);
						
					}
				}
		return tab;
	}
	
	public static String getCellData(int row, int col) {
			// get complete cell value
				Cell cell = sh.getRow(row).getCell(col);
				String cellData = cell.getStringCellValue().trim();
				
		return cellData;
	}
	*/

}
