package Newmavenproject.FirstMavenProject;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
public static void main(String[] args) throws Exception  {
	File file = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\Navin.xlsx");
	FileInputStream input = new FileInputStream(file);
	Workbook w = new XSSFWorkbook(input);
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(0);
	Cell c = r.getCell(1);
	System.out.println(c);	
	System.out.println();
	
	
	for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
		Row r1 = s.getRow(i);
		
		for(int j=0;j<r1.getPhysicalNumberOfCells();j++)
		{
			Cell c1 = r1.getCell(j);
			System.out.println(c1);
		}
	}
	
	
}


}
