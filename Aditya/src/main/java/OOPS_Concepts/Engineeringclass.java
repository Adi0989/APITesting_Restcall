package OOPS_Concepts;

public class Engineeringclass implements student {

		public void displayName() {
		System.out.println("HI");
	}

	
	public void getstudentnumber() {
	System.out.println("We are 120 student");
		
	}

	public void getstandard() {
	System.out.println("we are in 3rd standard");
		
	}

	
	public static void main(String args[]) {
		
		Engineeringclass eng = new Engineeringclass();
		
		eng.displayName();
		eng.getstudentnumber();
		eng.getstandard();
		
		System.out.println("our university is london" );
	}
}
