package Sample1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestParameter {

	
	@Test 

	@Parameters("browser")
	public void testcaseone(String browser) {
		System.out.println("browser passed as :- " + "browser");
	}
	
	
	
	@Test

	@Parameters({"username","password"})
	
	public void testcasetwo(String username, String password) {
		
		System.out.println("Parameter for user name passed as :- " + "username");
	System.out.println("Parameter for password passed as:- "  + "password");
	
	
	}
	
}
