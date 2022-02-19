package day19;

import java.util.Arrays;

public class C03_ArrayToplama {

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,8,8,4,5} ;
		int toplam = 0 ;  
		
		
		for (int i = 0 ; i<arr.length ; i ++) { // 
			
        toplam+=arr[i] ;
		}	
		System.out.println("elemanlarin toplami : "+ toplam);	
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	// buyukten kucuge yazdirmak icin ya for loop ile elemanlari ters sira yazdiririz
		
		for (int i = arr.length-1; i>=0 ; i--) {
			
			System.out.print(arr[i]+ " ");	
		// print aldigimiz sonuc bir array degil onu tekrar bir array in icine sokmaliyiz
		}	
		int tersarray[] = new int [arr.length] ;
		for(int i = 0 ; i<tersarray.length ; i++) {
			tersarray[i]= arr[arr.length-1-i]; 
		}
		System.out.print(Arrays.toString(tersarray));
			
		}
	}


