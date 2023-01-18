package Write;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteTheExcel {
	public void WriteTheExcel(String sheetName,String data) throws Exception {
		String excelPath="C:\\Users\\thimmisetty.ganesh\\OneDrive - HCL Technologies Ltd\\Desktop\\mytrip.xlsx";
		//Create an object of File class to open xlsx file
		File file=new File(excelPath);
		//Create an object of FileInputStream class to read excel file
		FileInputStream input=new FileInputStream(file) ;
		 //If it is xlsx file then create object of XSSFWorkbook class
		XSSFWorkbook wb=new XSSFWorkbook(input);
		//To get the sheet
		XSSFSheet sheet=wb.getSheetAt(0);
		//To get the row 
		 Row row1= sheet.getRow(0);
		//Get the current count of rows in excel file
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(rowCount);		
		 //Create a new row and append it at last of sheet
		 Row newRow = sheet.createRow(rowCount+1);
		    //Create a loop over the cell of newly created Row
		 for(int j = 0; j < row1.getLastCellNum(); j++){
			//Fill data in row
		       Cell cell = newRow.createCell(j);
		        cell.setCellValue(data);
		        System.out.println(data);
		 }
		FileOutputStream fos=new FileOutputStream(new File(excelPath));
		wb.write(fos);
		wb.close();
		fos.close();
}
}