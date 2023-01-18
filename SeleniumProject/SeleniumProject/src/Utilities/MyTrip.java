package Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObject.MyTripHomePage;
import PageObject.SearchpageFactory;
public class MyTrip {
	private WebDriver driver;
public static String baseUrl ="https://www.makemytrip.com/";
@BeforeMethod
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\thimmisetty.ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
     //To get the URLr
		driver.get(baseUrl);
		driver.manage().window().maximize();		
}@Test
	  public void testWeb() throws Exception {
		//We have to call the SearchpageFactory object and we have to pass the driver 
		SearchpageFactory obj=new SearchpageFactory(driver);
		//We have to give the sendkeys to from
			obj.From("Chennai");
			//We have to give the sendkeys  To
			obj.To("Benguluru");
			//In this we have to click all fields 
			obj.Fields();
			//We have to call the MyTripHomePage object and we have to pass the driver  
		MyTripHomePage obj1=new MyTripHomePage(driver);
		//In this we create list of web elements and print that  		
		 obj1.Details();		
	}
	@AfterTest
	public void tearDown() throws Exception {
		// driver.close();
	}
}
