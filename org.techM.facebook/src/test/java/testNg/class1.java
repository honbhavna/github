package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class1 {
	@BeforeSuite
	public void beforesuite() {
		System.out.println(" beforesuite");
	}
	
	@BeforeTest
	public void beforetest() {
	System.out.println("beforetest");	
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("beforeclass");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("beforemethod");
		
	}
	@AfterClass
	public void afterclass() {
		
		System.out.println("afterclass");
		
	}
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("aftermethod");
		
	}
	@Test
	public void tc01() {
		
		System.out.println("tc01class1");
		
	}
	@Test
	public void tc02() {
		
		System.out.println("tc02class1");
		
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
