package CollectionFramework;


import java.util.ArrayList;
import java.util.List;


public class Returnthelement {

	public static void main(String[] args) {
	
		List <String> programminglang = new ArrayList<>();
		
		programminglang.add("Java");
		programminglang.add("c");
		programminglang.add("python");
		programminglang.add("Ruby");
	
		
		
		String bestProglang = programminglang.get(3);
		
		System.out.println("The best programming languga is : " + bestProglang);
		
	System.out.println("The size of the array is : " + programminglang.size());
	
	System.out.println("the array is empty : " + programminglang.isEmpty());

	}

}
