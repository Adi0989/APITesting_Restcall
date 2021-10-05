package OOPS_Concepts;

public class ICICIbankloan extends Bankloan {
	
	public static void main(String args[]) {
		
		Bankloan bnk = new Bankloan();
		
		bnk.setName("Aditya");
		bnk.setAge(999);
		bnk.setLoanamount(1000000);
		
		System.out.println("Name is : " +bnk.getName());
		
		System.out.println("Age is : "  +bnk.getAge());
		
		System.out.println("Loan amount is : " +bnk.getLoanamount());


	}

}
