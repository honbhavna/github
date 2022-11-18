package testNg;

import org.testng.annotations.Test;

public class keyword2 {

	@Test (priority=-1)//first
	public void tc01() {
		System.out.println("tc01");
	}
	
	@Test (priority=1)//four
	public void tc02() {
		System.out.println("tc02");
	}
	
	@Test (enabled=false)//disabled
	public void tc03() {
		System.out.println("tc03");
	}
	
	@Test (dependsOnMethods="tc05")//third
	public void tc04() {
		System.out.println("tc04");
	}
	
	@Test (invocationCount=3)//second
	public void tc05() {
		System.out.println("tc05");
	}
	@Test (priority=2)//last
	public void tc06() {
		System.out.println("tc06");
	}
	
	
	
	
	
	
}
