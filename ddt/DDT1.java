package ddt;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DDT1 {
	public static void main(String[] args) throws InvalidFormatException, IOException
	{
	
	//load the file
	File src=new File("./Testdata.xls.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(src);
int total=wb.getNumberOfSheets();
System.out.println("total number of sheets  "+total);

XSSFSheet sheet=wb.getSheet("LoginDetails");
int rows=sheet.getPhysicalNumberOfRows();
System.out.println("Number of rows  "+rows);

XSSFRow row=sheet.getRow(0);
XSSFCell c1=row.getCell(0);

System.out.println(c1);
String value=c1.getStringCellValue();
System.out.println(value);
wb.close();//to avoid data leakage


}
}
