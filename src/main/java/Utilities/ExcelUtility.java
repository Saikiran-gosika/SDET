package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	public static Map<String, String> getMapData() throws IOException {

		Map<String, String> testdata = new HashMap<String, String>();

		try {
			FileInputStream fis = new FileInputStream("./Files/Demo.xlsx");

			Workbook w = new XSSFWorkbook(fis);

			Sheet sheet = w.getSheetAt(0);

			int slastrow = sheet.getLastRowNum();

			for (int i = 0; i <= slastrow; i++) {

				Row r = sheet.getRow(i);

				Cell keyCell = r.getCell(0);

				String key = keyCell.getStringCellValue().trim();

				

				Cell ValueCell = r.getCell(1);

				String Value = ValueCell.getStringCellValue().trim();
				
				testdata.put(key, Value);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(testdata);
		return testdata;
	}

}
