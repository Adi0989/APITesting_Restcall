package Array;

public class passarraytomethod {

	public static void findmin(int array[]) {
		int min = array[0];
		
		for (int i=0 ; i<array.length; i++) {
			if(min>array[i]) {
				min = array[i];
				
			}
		}
		System.out.println("Minimum element is : " +min);
	}
	
	public static void main(String args[]) {
		
		passarraytomethod pass = new passarraytomethod();
		
		int arraytest[] = {12,98,67,78};
		
		pass.findmin(arraytest);
		
		
	}
}
