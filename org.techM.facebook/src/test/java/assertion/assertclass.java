package assertion;





import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertclass {
	//hard assert
	
	String expurl ="google.com";
	String acturl1="google.com";
	String acturl2="gooogle.co";
@Test
	
public void test1() {
	//Assert.assertEquals(acturl2, expurl);
	//System.out.println("a0");
	Assert.assertEquals(acturl1, expurl);
	System.out.println("a1");
	Assert.assertNotEquals(acturl2, expurl);
	System.out.println("a2");
	Assert.assertTrue(true);
	System.out.println("a3");
	Assert.assertFalse(false);
	System.out.println("a4");
	//Assert.assertTrue(false);
	//System.out.println("a5");
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
