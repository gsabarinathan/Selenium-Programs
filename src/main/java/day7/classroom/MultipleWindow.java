package day7.classroom;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElementByXPath("//button[text()='Open Multiple Windows']").click();
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());	
		
		List<String> fisrtstwindow = new ArrayList<String>(windowHandles);
		//String secondWindow=1stWindowHandles.get(1);
		//driver.switchTo(secondWindow);
		String win=fisrtstwindow.get(2);
		driver.switchTo().window(win);		
		System.out.println(driver.getTitle());
	//	driver.quit();
}
}