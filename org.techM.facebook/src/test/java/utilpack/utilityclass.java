package utilpack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import basedpackage.baseclass;

public class utilityclass extends baseclass{
public static void screenshotget() {
File src	=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
	File dest =new File("D:\\software testing\\automation\\SeleniumDemo1\\screenshot"+timestamp()+".jpg");
	
	
}

private static String timestamp() {
	// TODO Auto-generated method stub
	return new SimpleDateFormat("YYYY-MM-DD HH-MM-SS").format(new Date ());
}
	
	public static void excelsheet() throws IllegalStateException, IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Mahesh\\OneDrive\\Desktop\\Book1.xlsx");
		Workbook work = WorkbookFactory.create(file);
		Sheet s =work.getSheet("sheet1");
		
		for(int i=0;i<s.getLastRowNum()-1;i++) {
			Row r= s.getRow(i);
			for(int j=0;j<r.getLastCellNum()-1;j++) {
				Cell cell = r.getCell(j);
				System.out.println(cell+"||");
				
			}
			
			
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
