package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotations {
@BeforeClass//1
public void beforeclass() {
	System.out.println("BeforeClass");
}
	
@BeforeMethod//2	
	
public void beforemethod() {
	System.out.println("Beforemethod");
}
@Test	//3
	
public void tc01() {
	System.out.println("tco1");
}
	
@AfterMethod //4	
public void aftermethod() {
	System.out.println("aftermethod");
}
	@AfterClass //5
	public void afterclass() {
		System.out.println("afterclass");
	}
	
	
	
	
	
	
}
