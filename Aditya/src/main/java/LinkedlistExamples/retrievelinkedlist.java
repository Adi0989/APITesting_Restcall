package LinkedlistExamples;

import java.util.LinkedList;

public class retrievelinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> fruits = new LinkedList<>();
		
		fruits.add("jhgjg");
		fruits.add("gjhgk");
		fruits.add("jhgjg");
		
		//First element
		
		String firstelement = fruits.getFirst();
		System.out.println("First element is : " + firstelement);
	
		//last element
		
		String lastElement = fruits.getLast();
		
	System.out.println(lastElement);
		
	
	//at a given position
	
	String element = fruits.get(1);
	
	System.out.println(element);
	}

}
