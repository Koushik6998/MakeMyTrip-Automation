package PageObject;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Optional;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
public class SelectTheDriver {
	WebDriver driver;
	@BeforeTest
	@Parameters("name")
	public void setUp(@Optional("chrome") String browser) {
		//We give the browser
		if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\thimmisetty.ganesh\\Downloads\\edgedriver_win64\\edgedriver.exe");
			driver = new EdgeDriver();
		}//We give the browser
		else if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\thimmisetty.ganesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}//We give the browser
		else if(browser.equalsIgnoreCase("firefox")){
			System.out.println("please select the valid browser");
		}
		}
		@Test
	public void testweb() {
			driver.get("https://www.makemytrip.com/");
	}

	}


