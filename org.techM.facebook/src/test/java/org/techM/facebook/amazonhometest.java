package org.techM.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonhometest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		
		
		
		login log = new login(driver);
		log.movetosinup(driver);
		log.enterid();
		log.IDsubmit();
		log.enterpassword();
		log.passwordsubmit();
		
		amazonhome amhom =new amazonhome(driver);
		amhom.searchclick();
		amhom.searchinput();
		
		amhom.searchclick2();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
