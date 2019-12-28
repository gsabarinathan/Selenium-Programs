package day8.classroom;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Zoomcar {
	public void getDate() {

	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.zoomcar.com/chennai");
		driver.manage().window().maximize();

		driver.findElementByXPath("//a[text()='Start your wonderful journey']").click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElementByXPath("(//div[@class='items'])[1]").click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[text()='Next']").click();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		// To get tomorrow date
		Date date = new Date();
		DateFormat sdf = new SimpleDateFormat("dd");
		String today = sdf.format(date);
		int tomorrow = Integer.parseInt(today)+1;
		System.out.println(tomorrow);
		/*WebElement cal = driver.findElementByXPath("(//div[@class='calendar']/ul)[2]");
		List<WebElement> date = cal.findElements(By.tagName("li"));
		System.out.println(date.size());*/

		WebElement todayDate = driver.findElementByXPath("//div[contains(text(),'"+tomorrow+"')]");
		todayDate.click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Next']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//button[text()='Done']").click();
		Thread.sleep(6000);
		List<WebElement> noOfResults = driver.findElementsByXPath("//div[@class='car-listing']");
		System.out.println(noOfResults.size());
		Thread.sleep(20000);
		driver.findElementByXPath("//div[text()=' Price: High to Low ']").click();
		Thread.sleep(2000);
		List<WebElement> priceOfResult = driver.findElementsByXPath("//div[@class='price']");
		System.out.println(priceOfResult.size());
		System.out.println(priceOfResult.get(0).getText());
		
		/*for (int i = 0; i < priceOfResult.size(); i++) {
			
			if (i==0) {
				
				driver.findElementByXPath("(//div[@class='per-km'])[1]/following-sibling::button").click();
				System.out.println("success");
			}
		}*/
		List<Integer> b = new ArrayList<Integer>(); 
		for (int i = 0; i < priceOfResult.size(); i++) {
			String a = priceOfResult.get(i).getText().replaceAll("\\D","");
			System.out.println(a);
				}
		
	}
}