package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedArraylist {

	public static void main(String[] args) {

		/*
		 * create a list of integer List<Integer> elements = Arrays.asList(10, 23, 5,
		 * 55, 7);
		 * 
		 * System.out.println(elements);
		 * 
		 * Collections.sort(elements); //acending order System.out.println(elements);
		 * 
		 * Collections.reverse(elements); System.out.println(elements);
		 */

		
		List<SortingofSalary> employees = new ArrayList<SortingofSalary>();
		
		employees.add(new SortingofSalary ("Aditya" ,10, 38000,45));
		employees.add(new SortingofSalary ("Aditi" ,11, 35000,46));
		employees.add(new SortingofSalary ("Adia" ,16, 39000,48));
		
		Collections.sort(employees, new My ());
		
		System.out.println(employees);
	}

} 

class My implements Comparator <SortingofSalary> {

	@Override
	public int compare(SortingofSalary o1, SortingofSalary o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary() - o2.getSalary());
	}
	
	
	
}