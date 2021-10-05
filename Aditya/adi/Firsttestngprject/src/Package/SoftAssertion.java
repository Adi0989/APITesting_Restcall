package Package;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	
@Test

public void Firstsoftassertion() {
	SoftAssert softassert = new SoftAssert();
	System.out.println("test case one started");
	softassert.assertEquals(5, 5 , "First test case pass");
	System.out.println("hard assertion failed");
	softassert.assertTrue("Hello".equals("hello"), "Second hard aasertion failed");	 
	System.out.println("***test case one executed successfully***");
	
	softassert.assertAll();
}

@Test

public void Secondsoftassertion() {
	SoftAssert softassert = new SoftAssert();
	System.out.println("test case second started");
	softassert.assertEquals("Hello", "Hello" , "First test assertion failed");
	System.out.println("hard assertion failed");
	softassert.assertTrue(false, "assertion failed");	 
	softassert.assertTrue(false, " Same assertion failed");	
	System.out.println("***test case two executed successfully***");
	
	softassert.assertAll();
}

@Test

public void Thirdsoftassertion() {
	
	SoftAssert softassert = new SoftAssert();
	System.out.println("test case third started");
	softassert.assertEquals(5, 5 , "First test assertion failed");
	System.out.println("hard assertion success");
	softassert.assertTrue("Hello".equals("Hello"), "Second hard aasertion failed");	  
	System.out.println("***test case two executed successfully***");
	softassert.assertAll();
}
	

}
