package HashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Createhashmapexample {

	public static void main(String[] args) {

		Map<String, Integer> numbermapping = new HashMap<>();

		numbermapping.put("one", 1);
		numbermapping.put("Two", 2);
		numbermapping.put("Three", 3);
		numbermapping.put("Four", 4);

		numbermapping.put(null, 5);

		System.out.println(numbermapping);

		// check if hashmap is empty or not

		System.out.println(numbermapping.isEmpty());

//Find the size of the Hashmap

		System.out.println(numbermapping.size());

		// check if a key is present or not

		if (numbermapping.containsKey("Three")) {

			System.out.println("Exist");
		} else
			System.out.println("Not exist");

		numbermapping.remove("one");

		System.out.println(numbermapping);

		Integer va = numbermapping.get("Two");

		System.out.println(va);

		Collection<Integer> values = numbermapping.values();

		System.out.println(values);

		Set<String> ke = numbermapping.keySet();

		System.out.println(ke);

	//Different ways to iterate over hash map
		
//using iterator method
		
	Set<Map.Entry<String , Integer>> entries = numbermapping.entrySet();
	
	Iterator<Map.Entry<String , Integer>> iterator =  entries.iterator();
	while (iterator.hasNext()) {
		Map.Entry<String, Integer> entry =  iterator.next();
		
 System.out.println("keys : " + entry.getKey()  + "values are : " + entry.getValue());
 
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}