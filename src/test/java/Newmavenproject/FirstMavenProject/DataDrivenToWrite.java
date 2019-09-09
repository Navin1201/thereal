package Newmavenproject.FirstMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenToWrite {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\Navin.xlsx");
	FileInputStream file = new FileInputStream(f);
Workbook w = new XSSFWorkbook(file);
Sheet s = w.getSheet("Sheet1");
Row r = s.getRow(0);
Cell c = r.getCell(2);
String s1 = c.getStringCellValue();
if(s1.equals("KumARAN")) {
	c.setCellValue("Kokki");
}
FileOutputStream o = new FileOutputStream(f);
w.write(o);
System.out.println("Updated Successfully");

}
}
