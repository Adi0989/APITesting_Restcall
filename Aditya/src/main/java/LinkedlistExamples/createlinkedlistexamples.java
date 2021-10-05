package LinkedlistExamples;

import java.util.LinkedList;

public class createlinkedlistexamples {
	
	//add
	//add(2, element)
	/* They both come from deque inteface */
	//addFirst()
	//addLast()
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> fruits = new LinkedList<>();
		fruits.add("Mango");
		fruits.add("kgkg");
		fruits.add("Banana");
		fruits.add("kiwi");
		
		System.out.println(fruits);
		
		fruits.add(4, "watermelon");
		
		System.out.println(fruits);
		
//	Adding element at the beggining of the list

		
		fruits.addFirst("Staraberry");
		System.out.println(fruits);
//		Adding element at the last of the list
		fruits.addLast("gabbar");
		System.out.println(fruits);
		

	}

}
