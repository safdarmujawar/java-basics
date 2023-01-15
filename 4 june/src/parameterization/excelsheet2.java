package parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class excelsheet2 {

	public static void main(String[] args) throws  IOException {
		
		
		String path= "D:\\test data\\Worksheet.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
	//String data = WorkbookFactory.create(File).getSheet("Sheet2").getRow(2).getCell(0).getStringCellValue();
		
	    Sheet data= WorkbookFactory.create(File).getSheet("sheet2");
	    
	    int lastrownumber= data.getLastRowNum();
	    
	    System.out.println(lastrownumber);
	    
	    for(int i=0; i<=data.getLastRowNum();i++) {
	    	
	    	for(int j=0;j<data.getRow(i).getLastCellNum();j++) {
	    		
	    		String values= data.getRow(i).getCell(j).getStringCellValue();
	    		
	    		System.out.print(values + " // ");
	    		
	    		
	    }
		
		System.out.println();
	}

}
}
