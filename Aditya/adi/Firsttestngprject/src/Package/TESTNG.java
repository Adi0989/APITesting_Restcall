package Package;

import org.testng.annotations.*;

public class TESTNG {
	
	@BeforeSuite
	public void beforeSuiteMethod() {
		System.out.println("this is executing");
	}	
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("this is second");
		
	}
	
}

