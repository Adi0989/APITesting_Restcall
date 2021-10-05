package OOPS_Concepts;

public class method_override extends Addition {

	public static void main(String args[]) {
		
		Addition add = new Addition();
		
		add.addvalues(11, 11);
		add.addvalues(33, 33, 33);
		add.addvalues(33,333330333,33,33330);
		
		double d = add.addvalues(11.22, 11.88);
		System.out.println(d);
	}
	
	
}
