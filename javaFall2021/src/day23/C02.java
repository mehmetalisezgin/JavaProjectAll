package day23;

import java.util.Arrays;

public class C02 {

	public static void main(String[] args) {
		int arr[][] = new int [3][3]; 
		
		System.out.println(Arrays.toString(arr));// direk outer array i yazdirmak istedigimizde icindeki elemanlar non primitive 
		// oldugundan referanslari yazdirir [[I@3feba861, [I@5b480cf9, [I@6f496d9f]
		
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.deepToString(arr));
		arr[0][1]=5;
		arr[1][0]=2;
		arr[2][1]=3;
		System.out.println(Arrays.deepToString(arr));
		

		
	}

}
