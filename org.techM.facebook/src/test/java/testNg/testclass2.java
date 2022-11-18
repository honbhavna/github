package testNg;

import org.testng.annotations.Test;

public class testclass2 {
	
		@Test
		public void tc01() {
			System.out.println("testclass2 tc01");
		}
			
		@Test(groups ="regression1")	
		public void tc02() {
			System.out.println("testclass2 tc02");
		}	
			
		@Test(groups ="regression2")	
		public void tc03() {
			System.out.println("testclass2 tc03");
		}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
