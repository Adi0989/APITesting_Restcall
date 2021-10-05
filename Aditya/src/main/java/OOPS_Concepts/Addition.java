package OOPS_Concepts;

public class Addition {

	
	/* method overloading by changing the arguments */
	public void addvalues(int a, int b) {
		int c = a+b;
		System.out.println("Addition is : " + c);
		
	
	}
	public void addvalues(int a, int b, int c) {
		int d = a+b+c;
		System.out.println("Addition is : " + d);
	
	}
	
	public void addvalues(int a, int b, int c, int d) {
		int e = a+b+c+d;
		System.out.println("Addition is : " + e);
}
	
	/* method overloading by changing the arguments */
	
	public double addvalues(double a , double b) {
		
		double c = a+b;
		return c;
		
	}
	
}