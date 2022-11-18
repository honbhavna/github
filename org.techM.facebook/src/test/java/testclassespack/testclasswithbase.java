package testclassespack;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import basedpackage.baseclass;
import utilpack.utilityclass;

public class testclasswithbase extends baseclass{
//@Parameters("browser")
	@BeforeClass
	public void beforeclassannotation() throws InterruptedException {
	//System.out.println(browservalue);//String browservalue
		launchbrowser("chrome");
	}
	
	@Test
	public void tc01() {
		System.out.println("tc01");
	}
	
	public static void takescreenshot() {
	utilityclass.screenshotget();
	}
	
	
	
	
	
	
	
	
	
	
}
