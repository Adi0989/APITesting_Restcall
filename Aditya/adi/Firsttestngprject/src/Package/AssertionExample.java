package Package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {
	
	@Test
	public void testone() {
		System.out.println("Hi, This is the test one");
		
		Assert.assertEquals("Facebook", "Facebook");
		
	}
	
	@Test
	public void testtwo() {
		System.out.println("Hi, This is the test two");
		
		Assert.assertEquals(404, 200);
	}
	
	@Test
	public void testthree() {
		System.out.println("Hi, This is the test three");
		
		Assert.assertEquals(false, "This is false");
		
	}
	
	@Test
	public void testfour() {
		System.out.println("Hi, This is the test four");
	}
	
	@Test
	public void testfive() {
		System.out.println("Hi, This is the test five");
		
	}
	
	@Test
	public void testsix() {
		System.out.println("Hi, This is the test six");
		
	}
}
