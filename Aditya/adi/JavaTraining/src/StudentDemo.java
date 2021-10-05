
public class StudentDemo {

	int rollno;
	String name;
	String Standard;
	public StudentDemo(int rollno, String name, String Standard) {
	
	this.rollno = rollno;
	this.name = name;
		this.Standard = Standard;
		
	}
	public void display() {
		System.out.println("Student roll no is : " + rollno +  "name is : " + name + "and Class is : " + Standard);
 	}
	public static void main(String[] args) {
		
		
		StudentDemo stddemo = new StudentDemo(10, "Aditya", "2nd");
		
		StudentDemo stdemo2 =new StudentDemo(20, "Mohini", "5th");
		stddemo.display();
		stdemo2.display();
			
	}

}
