package week4.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLead {
@Test	
//public static void main(String[] args) throws InterruptedException//
public void editlead() throws InterruptedException
{
	 
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
	driver.findElementByXPath("(//div[@class='x-form-element']/input)[14]").sendKeys("Renault");		
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	Thread.sleep(3000);
	String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
	System.out.println(leadId);
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
	
	String title = driver.findElementByXPath("//div[text()='View Lead']").getText();
	if (title.contains("View Lead")) {
		System.out.println("Page title is "+title+" : Matching");
	} else {
		System.out.println("Page title is "+title+" : Mismatching");
	}
	//driver.findElementByClassName("subMenuButton").click();
	driver.findElementByLinkText("Edit").click();
	WebElement comName = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']");
	comName.clear();
	comName.sendKeys("RENAULT NISSAN");
	driver.findElementByXPath("//input[@value='Update']").click();
	String companyName = driver.findElementById("viewLead_companyName_sp").getText();
	if (companyName.contains("RENAULT NISSAN")) {
		System.out.println("Company name is "+companyName+" : Matching");
		//driver.close();
	} else {
		System.out.println("Company name is "+companyName+" : Mismatching");
	}
	Thread.sleep(1000);
	driver.close();
}
}