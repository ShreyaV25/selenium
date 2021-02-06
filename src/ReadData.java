import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData 
{
	public static void main(String[] args) throws Exception 
	{
		//String path = "D:\\SHREYA\\EclipseWorkSpace\\Selenium\\login.xlsx";//path of excel file
		
		//File fis = new File(path);
		
		FileInputStream fis = new FileInputStream("D:\\SHREYA\\EclipseWorkSpace\\Selenium\\login.xlsx");//path of excel file
		
		Workbook wb = WorkbookFactory.create(fis);//loading excel file
		
		Sheet sh = wb.getSheet("Sheet1");//loaded sheet also
		int rowcount = sh.getPhysicalNumberOfRows();//how many ROW
		Row firstRow = sh.getRow(0);
		for (int row = 0; row < rowcount; row++) 
		{
			for (int col = 0; col < firstRow.getLastCellNum(); col++) 
			{
				Cell cl = sh.getRow(row).getCell(col);
				System.out.print(cl+"    ");
			}
			System.out.println();
		}
	}
}
