package week4.assignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead { public static void main(String[] args) throws InterruptedException{
	//1  Launch the browser
	System.setProperty("webdriver.chrome.driver","D:\\Sabari\\Test Leaf\\Maven\\MavenProject\\drivers\\Chromedriver\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	//2  Enter the username
	driver.findElementByName("USERNAME").sendKeys("DemoSalesManager");
	//3  Enter the password
	driver.findElementById("password").sendKeys("crmsfa");
	//4  Click Login
	driver.findElementByClassName("decorativeSubmit").click();
	//5  Click crm/sfa link
	driver.findElementByLinkText("CRM/SFA").click();
	Thread.sleep(2000);
	//6  Click Leads link
	driver.findElementByXPath("//a[text()='Leads']").click();
	//7  Click Merge leads
	driver.findElementByXPath("//a[text()='Merge Leads']").click();	
	//8  Click on Icon near From Lead
	driver.findElementByXPath("//button[text()='LookupLeads']").click();
	//9  Move to new window
	
	//10  Enter Lead ID
	//11  Click Find Leads button
	//12  Click First Resulting lead
	//13  Switch back to primary window
	//14  Click on Icon near To Lead
	//15  Move to new window
	//16  Enter Lead ID
	//17  Click Find Leads button
	//18  Click First Resulting lead
	//19  Switch back to primary window
	//20  Click Merge
	//21  Accept Alert
	//22  Click Find Leads link
	//23  Enter From Lead ID
	//24  Click Find Leads button
	//25  Verify message "No records to display" in the Lead List. This message confirms that the successful merge of leads
	//26  Close the browser (Do not log out)

}
}
