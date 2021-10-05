package Sample1;

import org.testng.annotations.Test;

public class Multitestdependency {
	
	@Test
	public void start() {
		System.out.println("Starting the server");
		
	}
	
	@Test(dependsOnMethods = "start")
	public void init() {
		System.out.println("initiliazing  the server");
	}
	
	@Test(dependsOnMethods = "init")
	public void process() {
		System.out.println("processing the server");
	}

	@Test(dependsOnMethods = "process")
	public void stop() {
		System.out.println("Stoping the server");
	}
}
