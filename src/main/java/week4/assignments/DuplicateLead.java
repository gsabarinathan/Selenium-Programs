package week4.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {public static void main(String[] args) throws InterruptedException{
	
	//Launch the browser
	System.setProperty("webdriver.chrome.driver","D:\\Sabari\\Test Leaf\\Maven\\MavenProject\\drivers\\Chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//Enter the username
	driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
	//Enter the password
	driver.findElementById("password").sendKeys("crmsfa");
	//Click Login
	driver.findElementByClassName("decorativeSubmit").click();
	//Click crm/sfa link
	driver.findElementByLinkText("CRM/SFA").click();
	Thread.sleep(2000);
	//Click Leads link
	driver.findElementByXPath("//a[text()='Leads']").click();
	//Click Find leads
	driver.findElementByXPath("//a[text()='Find Leads']").click();	
	//Click on Email
	driver.findElementByLinkText("Email").click();
	//Enter Email
	WebElement email = driver.findElementByName("emailAddress");
	email.clear();
	email.sendKeys("gsabarinathan@yahoo.com",Keys.TAB);
	//Click find leads button
	driver.findElementByXPath("(//button[@class='x-btn-text'])[7]").click();
	//Capture name of First Resulting lead
	Thread.sleep(3000);
	String firstname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]").getText();
	System.out.println(firstname);	
	String lastname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-lastName']/a)[1]").getText();
	System.out.println(lastname);			
	//Click First Resulting lead
	driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	//Click Duplicate Lead
	String title = driver.findElementByXPath("//a[text()='Duplicate Lead']").getText();
	driver.findElementByLinkText("Duplicate Lead").click();
	//Verify the title as 'Duplicate Lead'
	if (title.contains("Duplicate Lead")) {
		System.out.println("Page title is "+title+" : Matching");
	} else {
		System.out.println("Page title is "+title+" : Mismatching");
	}
	//Click Create Lead
	driver.findElementByClassName("smallSubmit").click(); 
	//Confirm the duplicated lead name is same as captured name
	String leadfirstname = driver.findElementById("viewLead_firstName_sp").getText();
	System.out.println(leadfirstname);	
	
	String leadlastname = driver.findElementById("viewLead_lastName_sp").getText();
	System.out.println(leadlastname);	
	
	if(leadfirstname.contains("Renault")){
		System.out.println("Lead First Name is Matching");
		}
		 if(leadlastname.contains("Mitsubush")){
			System.out.println("Lead Last Name is Matching");
		}
		else{
			System.out.println("First Name and Last Name are not Matching");
		}
	//Close the browser (Do not log out)
		//driver.close();
}
}
