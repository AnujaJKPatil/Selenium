package commonUtils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtil {

	public String getDataFromExcel(String sheetName, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream("src\\test\\resources\\Data.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet(sheetName);
		Row r = s.getRow(rowNum);			
		Cell c = r.getCell(cellNum);
		String value = c.getStringCellValue();
		return value;
		
		
	}
}
