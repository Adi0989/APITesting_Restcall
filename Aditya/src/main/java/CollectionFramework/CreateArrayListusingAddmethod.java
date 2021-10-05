package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListusingAddmethod {

	public static void main(String[] args) {

		List<Integer> firstfiveprimenumbers = new ArrayList<>();
		firstfiveprimenumbers.add(11);
		firstfiveprimenumbers.add(2);
		firstfiveprimenumbers.add(5);
		firstfiveprimenumbers.add(9);

			
		  List <Integer> firstTenprimenumbers = new ArrayList<>(firstfiveprimenumbers);
		  
		  List <Integer> nextfiveprimenumbers = new ArrayList<>();
		  
		  nextfiveprimenumbers.add(99); nextfiveprimenumbers.add(67);
		  nextfiveprimenumbers.add(5); nextfiveprimenumbers.add(11);
		  
		  firstTenprimenumbers.addAll(nextfiveprimenumbers);
		  
		  System.out.println(firstTenprimenumbers);
		  
		 
	}
}
