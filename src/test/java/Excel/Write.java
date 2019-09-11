package Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {
public static void main(String[] args) throws IOException {
	File loc = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\Navin.xlsx");
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet("Navin1201");
	Row r = s.createRow(0);
	Cell c = r.createCell(8);
	c.setCellValue("Thala Dhoni");
	FileOutputStream file = new FileOutputStream(loc);
	w.write(file);
	System.out.println("Written Successfully");
}
}
