package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT2 {
	
	//if the cell is empty then we will get -----null pointer exception
	//if we try to get stringvalue in place of numeric---illegal state exception
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
	File src=new File("./Testdata.xls.xlsx");

	XSSFWorkbook wb=new XSSFWorkbook(src);
	System.out.println(wb.getSheet("LoginDetails").getRow(1).getCell(1));
	//illegal state exception
	//System.out.println(wb.getSheet("LoginDetails").getRow(1).getCell(2).getStringCellValue());
	System.out.println(wb.getSheet("LoginDetails").getRow(1).getCell(2).getNumericCellValue());
	//anothersheet
	System.out.println("User sheet details "+wb.getSheet("LoginDetails").getRow(1).getCell(1));
}
}
