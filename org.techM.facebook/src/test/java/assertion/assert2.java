package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert2 {
//soft assert
	String expurl ="google.com";
	String acturl1="google.com";
String acturl2="gooogle.co";
	
	@Test
	public void test1() {
		SoftAssert S = new SoftAssert();
		
		S.assertEquals(acturl1, expurl);
		System.out.println("a1");
		S.assertNotEquals(acturl2, expurl);
		System.out.println("a2");
		S.assertTrue(false);
		System.out.println("a3");
		S.assertFalse(false);
		System.out.println("a4");
		S.assertTrue(true);
		System.out.println("a5");
		S.assertAll();
		S.fail();
		System.out.println("last");
	}
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
