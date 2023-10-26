package read_excelfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.testng.annotations.Test;

public class Excel_simple_readexcelfile {

	
	@Test
	public void read_excel_aspercondition() throws IOException {
	 read_excel_file("Smoke_20", "Email");	
	}
	

	
	public void read_excel_file(String testName, String columnName) throws IOException
	{
		String path = "C:\\Users\\Administrator\\Desktop\\Testing.xls";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new HSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("KK");
		//System.out.println(sheet.getRow(5).getCell(3));	
		int lastRow = sheet.getLastRowNum();
		
		//System.out.println("Last row- " + lastRow);
		for (int i = 0; i <= lastRow; i++) {
			Row row = sheet.getRow(i);
			int lastCell = row.getLastCellNum();
			Cell cell = row.getCell(0);
			String value = cell.getStringCellValue();
			//System.out.println(value);
			if(value.equals(testName)){
				Row rownew = sheet.getRow(0);
				for (int j = 0; j < lastCell; j++) {
					Cell cellnew = rownew.getCell(j);
					String valuenew = cell.getStringCellValue();
					if(cellnew.toString().equals(columnName)) {

				System.out.println(sheet.getRow(i).getCell(j));

					}
				}
			}
		}
		
	}

}
