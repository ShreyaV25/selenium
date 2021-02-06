import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("D:\\SHREYA\\EclipseWorkSpace\\Selenium\\Data\\write.xlsx");
	
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet sh = wb.getSheet("Sheet1");
		
		//Sheet sh = wb.createSheet("VALIDLOGIN");
		Sheet sh = wb.getSheet("VALIDLOGIN");
		
		Cell cl = sh.createRow(0).createCell(0);
		cl.setCellValue("usename");
		sh.getRow(0).createCell(1).setCellValue("password");
		
		sh.createRow(1).createCell(0).setCellValue("ADMIN");
		sh.getRow(1).createCell(1).setCellValue("MANAGER");
		FileOutputStream fio = new FileOutputStream("D:\\SHREYA\\EclipseWorkSpace\\Selenium\\Data\\write.xlsx");
		wb.write(fio);
		System.out.println("done");
		wb.close();
	}
}
