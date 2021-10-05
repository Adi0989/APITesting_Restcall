package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Differentwaystoiterate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> courses = Arrays.asList("fff", "jhfgjhg", "fddfdf", "fsfs", "rtrtr");

		
		  for (int i = 0; i<courses.size(); i++) {
		  
		  
		  System.out.println(courses.get(i));
		  /*
		  basic loop with iterator*/
		  
		  
		  for (Iterator iterator = courses.iterator(); iterator.hasNext();) { String
		  course = (String) iterator.next();
		  
		  System.out.println(course); } }
		 

	/* java stream+ lambda examples */ 

		courses.stream().forEach(course -> System.out.println(course));

	}

}
