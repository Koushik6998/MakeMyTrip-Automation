package PageObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SearchpageFactory {
WebDriver driver;
//click the from
@FindBy(how=How.XPATH,using="//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]") WebElement Clickfrom;
//Give the sendkeys to from
@FindBy(how=How.XPATH,using="//*[@id=\"fromCity\"]") WebElement Sendkeysfrom;
@FindBy(how=How.XPATH,using="//*[@id=\"webklipper-publisher-widget-container-notification-close-div\"]") WebElement Clickpage;

//click the location
@FindBy(how=How.XPATH,using="//*[@id=\"react-autowhatever-1-section-0-item-0\"]") WebElement selectFrom;
//click the to
@FindBy(how=How.XPATH,using="//*[@id=\"toCity\"]") WebElement to;
//Give the sendkeys to To
@FindBy(how=How.XPATH,using="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div") WebElement to1;
//Give the date
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[6]/div") WebElement Calender;
//Click on traveller
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]") WebElement traveller;
//Click on adult
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[1]/li[2]") 
WebElement adult;
//Children
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/div/div[1]/ul/li[3]") 
WebElement children;
//class
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[1]/ul[2]/li[3]")
WebElement Class;
//click on apply
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[5]/div[2]/div[2]/button") 
WebElement apply;
//click search
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a") WebElement search;
//To click Okay Gotit!
@FindBy(how=How.XPATH,using="//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div/div[3]/button") WebElement GotIt;
public void From(String From) throws InterruptedException{
	//We click the from 
	Clickfrom.click();
	//We have to give the sendkeys in from
	Sendkeysfrom.sendKeys(From);
	//We click the suggestion what location we want
	Thread.sleep(5000);
	Clickpage.click();
	Thread.sleep(3000);
	selectFrom.click();
	Thread.sleep(3000);	
}public void To(String To) throws InterruptedException{
	//We the to give the sendkeys in To
	to.sendKeys(To);
	Thread.sleep(2000);
	//We click the suggestion what location we want
	to1.click();
	Thread.sleep(2000);
}public void Fields() throws InterruptedException {
	//Click the Date
	Calender.click();
	Thread.sleep(2000);
	
	//To click the travelers and class
		traveller.click();
		// To choose the number of adults
	adult.click();
	Thread.sleep(2000);
	// To choose the number of Children
	children.click();
	Thread.sleep(2000);
	//To choose the travel class
	Class.click();
	Thread.sleep(5000);
	//To give the timer
	WebDriverWait wait = new WebDriverWait(driver,10);
	//To scroll down to apply
	 JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scroll(0,300)",apply);	
	//To click apply with timer
	wait.until(ExpectedConditions.elementToBeClickable(apply));	
	//To click apply
	apply.click();
	Thread.sleep(2000);
	//To click the search button
	search.click();
	wait.until(ExpectedConditions.elementToBeClickable(GotIt));
	//To click the "okay got it!" button
	GotIt.click();
	
}
//To add the driver in object
	public SearchpageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
}





