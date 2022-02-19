package Arrays09Aralik;

import java.util.Scanner;

public class Q6 {
	

	public static void main(String[] args) {
		//6)	Write a Java program to remove duplicate elements from an array
	
		
        
        int arr [] = {123,123,134,567,876,123,123,3,4,4,4,4,4,4,4};
        int box = arr.length ;
       for (int i = 0; i < arr.length; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]==arr[j]) {
				
				arr[i] = arr[box-1];
				box--;
				j--;
			}
			
		}
	}
        
		
		
		
		
	}

}
