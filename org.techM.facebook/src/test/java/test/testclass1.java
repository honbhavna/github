package test;

import org.testng.annotations.Test;

public class testclass1 {
	@Test
	public void tc01() {
		System.out.println("testclass1 tc01");
	}
		
	@Test	
	public void tc02() {
		System.out.println("testclass1 tc02");
	}	
		
	@Test(groups ="regression1")	
	public void tc03() {
		System.out.println("testclass1 tc03");
	}	
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
