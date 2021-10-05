
public class Students {

	public  Students() {
		System.out.println("i am inside my constructor");
		System.out.println("this is the second constructor");
	}
	
	int rollno;
	String name;
	 public Students(int i, String n) {
rollno = i;
name = n;
	 }
	 public void display() {
		 System.out.println("Roll no. is : " + rollno + " and Name is : " + name );
	 }
	 public static void main(String[] args) {
		 
		 Students std = new Students();
	 	
		 Students std1 = new Students(10, "James");
		 Students std2 = new Students(20, "Aditya");
		 
		 std1.display();
		 std2.display();
		  

	}

}
