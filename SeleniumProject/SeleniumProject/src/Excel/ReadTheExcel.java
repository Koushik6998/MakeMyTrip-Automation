
  package Excel;
  
  import java.io.File; 
  import java.io.FileInputStream; import
  java.io.FileNotFoundException; 
  import java.io.IOException;
  
  import org.apache.poi.xssf.usermodel.XSSFSheet; import
  org.apache.poi.xssf.usermodel.XSSFWorkbook;
  
  public class ReadTheExcel { public static void main(String[] args) throws
  IOException { File file=new File("C:\\Users\\thimmisetty.ganesh\\OneDrive - HCL Technologies Ltd\\Test1.xlsx");
  FileInputStream s=new FileInputStream(file); 
  XSSFWorkbook book=new XSSFWorkbook(s);
   XSSFSheet sheet1=book.getSheetAt(0); sheet1.getLastRowNum();
  System.out.println(sheet1.getLastRowNum());
  sheet1.getRow(1).getCell(0).getStringCellValue();
  System.out.println(sheet1.getRow(1).getCell(0).getStringCellValue()); } }
 