package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT3 {
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
	File src=new File("./Testdata.xls.xlsx");

	XSSFWorkbook wb=new XSSFWorkbook(src);
	int row=wb.getSheet("LoginDetails").getPhysicalNumberOfRows();
	System.out.println(row);
	for(int r=0;r<row;r++)
	{
		System.out.println(wb.getSheet("LoginDetails").getRow(r).getCell(0).getStringCellValue());
	}
	}
	
}
