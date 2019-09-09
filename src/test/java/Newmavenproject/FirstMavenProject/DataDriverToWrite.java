package Newmavenproject.FirstMavenProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriverToWrite {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\navin1206.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("NavinKumar");
	Row r = s.createRow(1);
	Cell c = r.createCell(7);
	c.setCellValue("Virat Kohli");
	FileOutputStream fi = new FileOutputStream(f);
	w.write(fi);
	System.out.println("Written Successfully");
	
}
}
