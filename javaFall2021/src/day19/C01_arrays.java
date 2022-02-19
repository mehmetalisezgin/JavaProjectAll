package day19;

import java.util.Arrays;

public class C01_arrays {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6} ;
		
		for (int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
// bir array in elemanlarinin yazilmasi 
// ikinci yontem arrays class indan yardim alariz
		
		System.out.println(Arrays.toString(arr));
		
		
		// arrayin elemanlarini yazdirmak istersek loop ile yada arrays class indan yardim alip direk
		// array olarak yazdirabiliriz..args.
		
		
		
	}

}
