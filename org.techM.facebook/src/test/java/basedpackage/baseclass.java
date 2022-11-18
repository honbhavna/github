package basedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class baseclass {
	public static WebDriver driver;
	
	
	
public static void launchbrowser(String browser) throws InterruptedException {
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
		
	}else if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.firefox.driver", "C:\\selenium webdriver\\chrome driver\\chromedriver.exe");
		driver = new FirefoxDriver();
	}else if(browser.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.IE.driver", "C:\\selenium webdriver\\chrome driver\\chromedriver.exe");
		driver = new InternetExplorerDriver();	
	}
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.phb/");
	Thread.sleep(2000);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
