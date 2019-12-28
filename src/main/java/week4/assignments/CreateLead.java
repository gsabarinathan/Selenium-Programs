package week4.assignments;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import day9.classroom.ProjectSpecificMethods;

public class CreateLead extends ProjectSpecificMethods {

	//public static void main(String[] args) throws InterruptedException//
	
	@Test
	public void createLead() throws InterruptedException	{
		/*
		 * // Set the property for ChromeDriver System.setProperty(
		 * "webdriver.chrome.driver","D:\\Sabari\\Test Leaf\\Maven\\MavenProject\\drivers\\Chromedriver\\chromedriver.exe"
		 * ); //1// Initiate the ChromeBroswer ChromeDriver driver = new ChromeDriver();
		 * driver.get("http:leaftaps.com/opentaps/control/main"); // Maximize the
		 * browser driver.manage().window().maximize(); //2// Enter the UserName
		 * driver.findElementById("username").sendKeys("DemoSalesManager"); //3// Enter
		 * the Password driver.findElementById("password").sendKeys("crmsfa"); //4//
		 * Click on Login Button
		 * driver.findElementByClassName("decorativeSubmit").click(); //5// Click on
		 * crm/sfa button driver.findElementByLinkText("CRM/SFA").click();
		 */
		// Click on Leads
		driver.findElementByLinkText("Leads").click();
		//6// Click on Create Lead button		
		 driver.findElementByLinkText("Create Lead").click(); 
		 //7// Enter Company Name
		  driver.findElementById("createLeadForm_companyName").sendKeys("RNTBCI"); 
		 //8// Enter First Name
		  driver.findElementById("createLeadForm_firstName").sendKeys("Renault"); 
		 //9// Enter Last Name
		  driver.findElementById("createLeadForm_lastName").sendKeys("Mitsubush"); 
		//10// Enter First Name(Local)
		  driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Sabarinathan");
		//11// Enter Last Name(Local)
		  driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Gunasekaran");
		//12// Enter Salutation  
		  driver.findElementById("createLeadForm_personalTitle").sendKeys("Mr");		 		
		//13//To Interact with drop down : Select Source :
		WebElement dropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select a=new Select(dropDown);
		List<WebElement> options = a.getOptions();
		int option=options.size();
		a.selectByIndex(1);
		//14	Enter Title // 
		 driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		//15	Enter Annual Revenue //
		 driver.findElementById("createLeadForm_annualRevenue").sendKeys("50000");
		//16	Choose Industry //
		 	WebElement dropDown1 = driver.findElementById("createLeadForm_industryEnumId");
			Select b=new Select(dropDown1);
			List<WebElement> options1 = b.getOptions();
			int option1=options1.size();
			b.selectByIndex(1);
		//17	Choose Ownership //
				WebElement dropDown2 = driver.findElementById("createLeadForm_ownershipEnumId");
				Select c=new Select(dropDown2);
				List<WebElement> options2 = c.getOptions();
				int option2=options2.size();
				c.selectByIndex(1);
		//18	Enter SIC Code //
				 driver.findElementById("createLeadForm_sicCode").sendKeys("0265");
		//19	Enter Description //
				 driver.findElementById("createLeadForm_description").sendKeys("Test Leaf Program to create Lead");
		//20	Enter Important Note //
				 driver.findElementById("createLeadForm_importantNote").sendKeys("Assigment");
		//21	Enter Country Code //
				 driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		//22	Enter Area Code //
				 driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("123");
		//23	Enter Extension //
				 driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("456");
		//24	EnterDepartment //
				 driver.findElementById("createLeadForm_departmentName").sendKeys("IT");
		//25	Choose Preferred Currency //
				 	WebElement dropDown3 = driver.findElementById("createLeadForm_currencyUomId");
					Select d=new Select(dropDown3);
					List<WebElement> options3 = d.getOptions();
					int option3=options3.size();
					d.selectByIndex(1);
		//26	Enter Number Of Employees //
					driver.findElementById("createLeadForm_numberEmployees").sendKeys("789");
		//27	Enter Ticker Symbol //
					 driver.findElementById("createLeadForm_tickerSymbol").sendKeys("111");
		//28	Enter Person to Ask For //
					 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Sabari");
		//29	Enter Web Url //
					 driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.google.com");
		//30	Enter To Name //
					 driver.findElementById("createLeadForm_generalToName").sendKeys("Sabarinathan G");
		//31	Enter Address Line 1 and 2 //
					 driver.findElementById("createLeadForm_generalAddress1").sendKeys("Palavanthangal");
					 driver.findElementById("createLeadForm_generalAddress2").sendKeys("Nanganallur");
		//32	Enter City //
					 driver.findElementById("createLeadForm_generalCity").sendKeys("Chennai");			
		//33	Choose State/Province //
					 WebElement dropDown4 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
						Select e=new Select(dropDown4);
						List<WebElement> options4 = e.getOptions();
						int option4=options4.size();
						e.selectByIndex(2);
		//34	Choose Country //
						 WebElement dropDown5 = driver.findElementById("createLeadForm_generalCountryGeoId");
							Select f=new Select(dropDown5);
							List<WebElement> options5 = f.getOptions();
							int option5=options5.size();
							f.selectByIndex(2);					
		//35	Enter Zip/Postal Code //
					 driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600099");
		//36	Enter Zip/Postal Code Extension //
					 driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("222");
		//37	Choose Marketing Campaign //
					 WebElement dropDown6 = driver.findElementById("createLeadForm_generalCountryGeoId");
						Select g=new Select(dropDown6);
						List<WebElement> options6 = g.getOptions();
						int option6=options6.size();
						g.selectByIndex(2);	
		//38	Enter phone number //
					 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("9600040797");
		//39	Enter email address //					 
					 driver.findElementById("createLeadForm_primaryEmail").sendKeys("gsabarinathan@yahoo.com");
		//40    Click on Create Lead (Submit) button
					 driver.findElementByClassName("smallSubmit").click(); 

// 41	Verify the first name//
				String companyName = driver.findElementById("viewLead_firstName_sp").getText();
						if (companyName.contains("Renault")) {
							System.out.println("Company name is "+companyName+ ": Matching" );
						//	driver.close();//
						} else {
							System.out.println("Company name is "+companyName+ ": Not Matching");
						}
						Thread.sleep(1000);
						//driver.close();
	}
}
