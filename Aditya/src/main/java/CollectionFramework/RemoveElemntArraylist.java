package CollectionFramework;



import java.util.ArrayList;
import java.util.List;


public class RemoveElemntArraylist {

	public static void main(String[] args) {
	
		List <String>  topElem = new ArrayList<>();
		
		topElem.add("jhg");
		topElem.add("jhfgjh");
		topElem.add("jgj");
		
		System.out.println(topElem);

		topElem.remove(2);
		System.out.println(topElem);
		topElem.remove(topElem);
		System.out.println(topElem);
		
		
		
	}

}
