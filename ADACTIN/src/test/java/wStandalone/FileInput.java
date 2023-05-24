package wStandalone;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileInput {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("D://detail.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet= workbook.getSheet("Sheet1");
	
	System.out.println(sheet.getSheetName());
	System.out.println(sheet.getLastRowNum()+1);
	
	
	System.out.print("username "+sheet.getRow(1).getCell(1)+" :");
	System.out.println("password "+sheet.getRow(1).getCell(2));
	}

}
