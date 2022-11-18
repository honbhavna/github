package org.techM.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkarthometest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chrome driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	
	flipkarthomepage fbhompage =new flipkarthomepage(driver);
	fbhompage.cutlogin();
	fbhompage.search();
	fbhompage.searchinput();
	fbhompage.searchclick();
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
