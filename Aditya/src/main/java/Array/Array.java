package Array;

public class Array {

	public static void main(String[] args) {
		
		int ar[] = new int[9];
		
		ar[0] = 12;
		ar[1] = 139;
		ar[2] = 199;
		ar[3] = 125;
		ar[4] = 128;
		ar[5] = 125;
		ar[6] = 121;
		ar[7] = 1223;
		ar[8] = 122;
		
		System.out.println(ar[6]);

		for(int i = 0 ; i < ar.length ; i++) {
			System.out.println(ar[i]);
		}
		
		
		int ar1[] = {10,89,78,76,89,9};
		
		System.out.println("Size of the array is : " + ar1.length);
	}
	
	

}
