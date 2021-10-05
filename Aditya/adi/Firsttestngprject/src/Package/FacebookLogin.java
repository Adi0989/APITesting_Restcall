package Package;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test (enabled = false)
	public void Facebooklogin() {
		System.out.println("Successfully login");
	}
	
	@Test  
	public void UnableToLogin() {
		System.out.println("Not able to login");
		
		throw new SkipException("I want to skip");
	}

}
