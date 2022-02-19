package Arrays09Aralik;

import java.util.Arrays;

public class Q4_ok {
	
	static int max;
	static int min ;
	
	public static void max_min(int arr[]) { 
		
	
	 max = arr[0];
	 min = arr[0];
	 
	
	 //int arr [] = {1,2,3,6,4,5,90,1525,0};
	 
	 for(int i = 0; i<arr.length; i++) {
		 if (i==0) {
			 max = arr[i];
			 min = arr[i];
		}
		 if(arr[i]>max) {
			 max = arr[i];
		 }
		 if(arr[i]<min) {
			 min = arr[i];
		 }
	 }
			
	}
	
	public static void main(String[] args) {
// 4)	Write a Java program to find the maximum and minimum value of an array

		int arr [] = {1,2,3,6,4,5,90,1525,0};
		
		//Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(("max value:" +arr[arr.length-1]));
		//System.out.println(("min value:" +arr[0]));
		
		max_min(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		
	}

}
