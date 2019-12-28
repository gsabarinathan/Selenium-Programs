package javaweek6;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	public ChromeDriver driver;
	@Given ("Launch the browser")
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();	
		   throw new cucumber.api.PendingException();
	}
	
	@Given("Maximize the browser")
	public void maximizeTheBrowser() {
		 driver.manage().window().maximize();
	    throw new cucumber.api.PendingException();
	}

	@Given("Load the URL")
	public void loadTheURL() {
		driver.get("http:leaftaps.com/opentaps/control/main");
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter the username as demosalesmanager")
	public void enterTheUsernameAsDemosalesmanager() {
		driver.findElementById("username").sendKeys("DemoSalesManager");
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter the password as crmsfa")
	public void enterThePasswordAsCrmsfa() {
		driver.findElementById("password").sendKeys("crmsfa");
	    throw new cucumber.api.PendingException();
	}

	@Given("Click on the login button")
	public void clickOnTheLoginButton() {
		 driver.findElementByClassName("decorativeSubmit").click();
	    throw new cucumber.api.PendingException();
	}
	
	@Given("Click on crmsfa button")
	public void click_on_crm_sfa_button() {
		 driver.findElementByLinkText("CRM/SFA").click();
	    throw new cucumber.api.PendingException();
	}
	
	@Given("Click on the leads tab")
	public void clickOnTheLeadsTab() {
		driver.findElementByLinkText("Leads").click();
	    throw new cucumber.api.PendingException();
	}

	@Given("Click on Create Lead tab")
	public void clickOnCreateLeadTab() {
		 driver.findElementByLinkText("Create Lead").click(); 
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter Company Name as RNTBCI")
	public void enterCompanyNameAsRNTBCI() {
		  driver.findElementById("createLeadForm_companyName").sendKeys("RNTBCI"); 
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter First Name as Renault")
	public void enterFirstNameAsRenault() {
		  driver.findElementById("createLeadForm_firstName").sendKeys("Renault");
	    throw new cucumber.api.PendingException();
	}

	@Given("Enter Last Name as Nissan")
	public void enterLastNameAsNissan() {
		  driver.findElementById("createLeadForm_lastName").sendKeys("Nissan"); 
	    throw new cucumber.api.PendingException();
	}

	@When("Click on Create lead button")
	public void clickOnCreateLeadButton() {
		 driver.findElementByClassName("smallSubmit").click();
	    throw new cucumber.api.PendingException();
	}

	@Then("Verify Lead is successfully created")
	public void verifyLeadIsSuccessfullyCreated() throws InterruptedException {
		String companyName = driver.findElementById("viewLead_firstName_sp").getText();
		if (companyName.contains("Renault")) {
			System.out.println("Company name is "+companyName+ ": Matching" );
		//	driver.close();//
		} else {
			System.out.println("Company name is "+companyName+ ": Not Matching");
		}
		Thread.sleep(1000);
		//driver.close();
	    throw new cucumber.api.PendingException();
	}
	
	
	
	
	
	
	

}