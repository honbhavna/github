package testNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.techM.facebook.amazonhome;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testngclass1 {
	WebDriver driver ;
	amazonhome amhom;
	
	@BeforeClass
	public void beforeclass() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chrome driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			Thread.sleep(2000);
			this.driver=driver;
	}
	
	@BeforeMethod
	
	public void beforemethod () {
		System.out.println("beforemethod");
		 amhom =new amazonhome(driver);
		
		
		
	}
	@Test
	public void tc01() throws InterruptedException {
		amhom =new amazonhome(driver);
		System.out.println("before method");
		this.driver=driver;
		amhom.searchclick();
		Thread.sleep(2000);
		amhom.searchclick2();
		Thread.sleep(2000);
		amhom.searchinput();
		Thread.sleep(2000);
		
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
		driver.quit();
	}
	
	
	
	
	

}
