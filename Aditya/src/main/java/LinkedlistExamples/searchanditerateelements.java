package LinkedlistExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class searchanditerateelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> programinglang = new LinkedList<>();
		programinglang.add("C++");
		programinglang.add("Java");
		programinglang.add("hibernate");
		programinglang.add("ruby");
		programinglang.add("python");
		
	 boolean result = programinglang.contains("jgkgk");
	 System.out.println(result);
		
		int index = programinglang.indexOf("ruby");
		
		System.out.println(index);
		
		//iterate over the elements using iterator method
		
		
		Iterator<String> itr = programinglang.iterator();
  while (itr.hasNext()) {
	String programinglang1 = (String) itr.next();
	
	System.out.println(programinglang1);
}
	
}		
		
	}


