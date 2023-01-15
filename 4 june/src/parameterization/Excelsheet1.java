package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Excelsheet1 {

	public static void main(String[] args) throws  IOException {
		
		
		String path= "D:\\test data\\Worksheet.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		String data = WorkbookFactory.create(File).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);

	}
}
