package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream exclObj=new FileInputStream("./testdata/logindata.xlsx");
		Workbook wb=WorkbookFactory.create(exclObj);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(1);
		Cell c = r.getCell(0);
		String username = c.toString();
		System.out.println(username);
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		System.out.println(username+"==="+pwd);
		
		
	
		
		
	}

}
