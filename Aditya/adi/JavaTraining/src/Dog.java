
public class Dog {

	String name = "jacky";
	String breed = "bully";
	String colour = "black";
			int height =4;
			
public void barking() {
	System.out.println(name + " is barking ");
}

public void eating() {
	System.out.println(name + "is eating");
	
}
public void  colour() {
	System.out.println(name + "is black");
}
	public static void main(String[] args) {
		
		Dog dogclass = new Dog();
		System.out.println(dogclass.height);
		System.out.println(dogclass.colour);	
		dogclass.barking();

	}

}
