package day19;

import java.util.Arrays;

public class C02_arraysoru {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5} ;
		int kova = arr[0] ;  
		
		for (int i = 0 ; i<arr.length-1 ; i ++) { // length -1 oldu cunku 
			
		arr[i] = arr[i+1]	;
			
			
			
		}
		arr[arr.length-1] = kova ;
		System.out.println(Arrays.toString(arr));
		
	}

}
