package Annotationorder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAnnotation {

	
	@Test (enabled=false)
	public void First() {
		System.out.println("From first annotated test in Test");
	}
	
	@BeforeMethod
	public void beforemethod() {
		
	System.out.println("From beforemethod annotated test in Test");
	
	}
	
	@AfterMethod
	
	public void aftermethod() {
		
		System.out.println("From aftermethod annotated test in Test");
	
	}
	
	@BeforeClass
	public void beforeclass() {
		
	System.out.println("From beforeclass annotated test in Test");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("From afterclass annotated test in Test");
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("From aftertest annotated test in Test");
	}
	
	}
