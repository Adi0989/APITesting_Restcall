package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class List {

	
	public static void main(String args[]) {
		
		Collection<String> fruitcol = new ArrayList<>();
		
		fruitcol.add("hkghk");
		fruitcol.add("fdff");
		fruitcol.add("fff");

	System.out.println(fruitcol);
	
	fruitcol.remove("fff");
	System.out.println(fruitcol);
	
	System.out.println(fruitcol.contains("fff"));
	
	fruitcol.isEmpty();
	fruitcol.iterator();
	fruitcol.clear();
	System.out.println(fruitcol);
}

}