package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Update {
public static void main(String[] args) throws IOException {
	File loc = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\navin12.xlsx");
	FileInputStream f = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook();
	Sheet s = w.getSheet("Sheet1");
	Row r = s.getRow(4);
	Cell c = r.getCell(3);
	 String s1 = c.getStringCellValue();
	if(s1.equals("Kumar")) {
		c.setCellValue("BIGIL");
	}
	FileOutputStream o = new FileOutputStream(loc);
	w.write(o);
	System.out.println("updated successfully");
    }
    }
