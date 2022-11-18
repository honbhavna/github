package failedtestcase;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utilpack.utilityclass;

public class capturessoffailedtestcases {
@Test 
public void tc01() {
	//Assert.fail();
	System.out.println("tc01");
	
	
}
	
@Test 
public void tc02() {	
	System.out.println("tc02");
}	
	
@Test 
public void tc03() {
	Assert.fail();
	System.out.println("tc03");
}	
	
@AfterMethod
	public void aftermethod (ITestResult result) {
	if(result.getStatus()==ITestResult.FAILURE) {
		//utilityclass.screenshotget();
		System.out.println();
	}	
	else
		System.out.println("test case pass");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
