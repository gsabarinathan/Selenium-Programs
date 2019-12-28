package week4.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {public static void main(String[] args) throws InterruptedException {
	 
	System.setProperty("webdriver.chrome.driver","D:\\Sabari\\Test Leaf\\Maven\\MavenProject\\drivers\\Chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
	driver.findElementById("password").sendKeys("crmsfa");
	driver.findElementByClassName("decorativeSubmit").click();
	driver.findElementByLinkText("CRM/SFA").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//a[text()='Leads']").click();
	driver.findElementByXPath("//a[text()='Find Leads']").click();	
	driver.findElementByLinkText("Phone").click();
	
	WebElement phonecode = driver.findElementByName("phoneCountryCode");
	phonecode.clear();
	phonecode.sendKeys("12",Keys.TAB);
	
	WebElement areacode = driver.findElementByName("phoneAreaCode");
	areacode.clear();
	areacode.sendKeys("123",Keys.TAB);
	
	WebElement phonenumber = driver.findElementByName("phoneNumber");
	phonenumber.clear();
	phonenumber.sendKeys("9600040797",Keys.TAB);
	
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	
	Thread.sleep(3000);
	String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	System.out.println(leadId);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
	
	driver.findElementByXPath("//a[text()='Delete']").click();
	
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	driver.findElementByName("id").sendKeys(leadId);
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	String result = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
	System.out.println(result);
	if(result.equals("No records to display")) 
	{
		System.out.println("The First rescord is successfully deleted");
	}
	else {
		System.out.println("The deletion process is failed");
	}
}
}
