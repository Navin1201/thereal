package Newmavenproject.FirstMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DatadrivenRead {
public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\Navin\\FirstMavenProject\\testdata\\Navin.xlsx");
	FileInputStream input = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(input);
Sheet s = w.getSheet("Sheet1");

for(int i=0;i<s.getPhysicalNumberOfRows();i++)
{
Row r = s.getRow(i);

for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
	Cell c = r.getCell(j);
	int type = c.getCellType();
	
	if(type==1) {
		String stringCellValue = c.getStringCellValue();
		System.out.println(stringCellValue);
	}
	else if (type==0) {
		if(DateUtil.isCellDateFormatted(c)) {
			Date datecellvalue = c.getDateCellValue();
			SimpleDateFormat simple = new SimpleDateFormat();
			String date = simple.format(datecellvalue);
			System.out.println(date);
			
		}
		else {
			double numericCellValue = c.getNumericCellValue();
			
			long l = (long)numericCellValue;
			
			String li = String.valueOf(l);
			System.out.println(li);
		}
		}
	}
	
	
}
}



}

