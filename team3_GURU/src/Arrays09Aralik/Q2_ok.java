package Arrays09Aralik;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_ok {

	public static void main(String[] args) {
		// 2)	Write a Java program to reverse an array of integer value
		
		System.out.println("Please write your numbers...");
		
		int arr [] = {123,4563,654,4567,1900,2004}; 
		
		for (int i = 0; i < arr.length/2; i++) {
			int box = arr[i];
			arr[i] = arr[arr.length-i-1] ;
			
			arr[arr.length-i-1] = box ;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Please write your text");
		String input = scan.nextLine() ;
		String arr1 [] = new String[input.length()]; */
		//Kullanicidan alirken sikinti oluyor
		String arr1 [] = {"Mehmet","Ali","Asli","Erva Naz"};
		
		for (int j = 0; j < arr1.length/2; j++) {
			
		String box = arr1[j];
		
		arr1[j] = arr1[arr1.length-j-1];
		
		arr1[arr1.length-j-1] = box;
		
		
		}
		System.out.println(Arrays.toString(arr1));
		
	}

}
