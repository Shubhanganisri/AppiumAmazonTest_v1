package Test.AmazonTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static XSSFSheet getDataSheet() throws IOException
	{
		//creating a new file instance  
		File file = new File(System.getProperty("user.dir") +"/Resources/Loginsheet.xlsx");  
		//obtaining bytes from the file  
	    FileInputStream fis = new FileInputStream(file);   
	    //creating Workbook instance that refers to .xlsx file  
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    //creating a Sheet object to retrieve object
	    XSSFSheet sheet = wb.getSheetAt(0);      
	    return sheet;
	}
}
