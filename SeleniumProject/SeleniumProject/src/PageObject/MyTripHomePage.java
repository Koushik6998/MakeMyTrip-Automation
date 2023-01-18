package PageObject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Write.WriteTheExcel;
public class MyTripHomePage {
	private WebDriver driver;
	//To give the xpath 
	By Text=By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div/div[1]/div[2]/div/div");	
public void Details() throws Exception  {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//To scroll down to last page 
	js.executeScript("window.scroll(0,4000)");
	//To give the list of elements to get the text of flight details
	List<WebElement> flightPrice1=driver.findElements(Text);
	 //To get the text of flight details
	 for(int i=0;i<flightPrice1.size();i++) {
		 //To print the flight details in console
		  System.out.println(flightPrice1.get(i).getText());
		  //To add the WriteTheExcel object
			WriteTheExcel obj2=new WriteTheExcel();
			//To store the flight details in excel sheet
			obj2.WriteTheExcel("Test",flightPrice1.get(i).getText());
	 }
}
	 //In this we have to give the driver
	 public MyTripHomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);	 
	
	
	
	 
}}
