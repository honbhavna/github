package testNg;

import org.testng.annotations.Test;

public class keywords {
@Test (priority=-1)//second
public void tc01() {
	System.out.println("tc01");
}
@Test (priority=1)//third
public void tc02() {
	System.out.println("tc02");
}	
@Test (priority= -2)//first
public void tc03() {
	System.out.println("tc03");
}	
	
@Test (priority=2)//four
public void tc04() {
	System.out.println("tc04");
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
