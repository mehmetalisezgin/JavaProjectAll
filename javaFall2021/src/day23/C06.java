package day23;

import java.util.Arrays;

public class C06 {

	public static void main(String[] args) {
		int arr1[]= {3,5,7,10};
		int arr2[] = {2,4,6,8,9};
		
        int birlesikarray[] = birlestir(arr1,arr2);
        Arrays.sort(birlesikarray);
        System.out.println(Arrays.toString(birlesikarray));
        // birlesikarray in scopu method un disinda oldugu icin asagidaki method da kullanilmaz
	}

	private static int[] birlestir(int[] arr1, int[] arr2) {
		// ayni isimde tekrar bir array olsuturabiliriz takibi kolay olmasi icin
		int birlesikarray[] = new int[arr1.length+arr2.length];
		
		for(int i = 0; i<arr1.length ; i++) {
			
			birlesikarray[i]=arr1[i];
			
			for(int j=0 ; j<arr2.length ; j++) {
				
				birlesikarray[j+arr1.length]=arr2[j];
			}
		}
	
		
		
		
		
		
		
		
		return birlesikarray;
	}

	

}
