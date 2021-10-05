package Annotationorder;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SecondAnnotation {
	
	
	@BeforeSuite
	public void beforesuite() {
		
		System.out.println("From beforsuite annotated test in Test");
	}

	@AfterSuite
	public void aftersuite() {
		System.out.println("From aftersuite annotated test in Test");
	}
	
	@BeforeTest
	
	public void beforetest() {
		
		System.out.println("From beforetest annotated test in Test");
	}
}
