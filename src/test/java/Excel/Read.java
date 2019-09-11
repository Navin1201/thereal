package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
public static void main(String[] args) throws IOException {
	File loc = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\Navin12121.xlsx");
	FileInputStream file = new FileInputStream(loc);
	Workbook w = new XSSFWorkbook(file);
	Sheet s = w.getSheet("Sheet1");
   for (int i=0;i<s.getPhysicalNumberOfRows();i++) {
Row r = s.getRow(i);
for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	Cell c = r.getCell(j);
	System.out.println(c);
}
}
   System.out.println();
	System.out.println("readed successfully");

}
}
