package OOPS_Concepts;

public class Bankloan {

	private String name;
	private int age;
	private int loanamount;
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		
		if(age>=18 || age<67) {
		this.age = age;
		
		}else {
			System.out.println("Please enter the correct age");
	}
	}
	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}
	
	public String getName() {
		return name;

}
	public int getAge() {
		return age;
		
	}
	public int getLoanamount() {
		return loanamount;
		
	}
}