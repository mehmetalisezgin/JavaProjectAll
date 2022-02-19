package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		/*
         * write a method that accepts a 2 dimensional array and finds the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
         * Input : {{1,2,3},{4,5},{6,7,8}}
         * Output : 8
         */
		/*
		int arr[][] =  {{1,2,3},{4,5},{6,7,8}};
	
		
		
		
		System.out.println(ikiBoyutluArrMax(arr));
		
	}

	private static int ikiBoyutluArrMax(int[][] arr) {
		int result=arr[0][0];
		
		for (int i = 0; i < arr.length; i++) {
			
			   for (int j = 0; j <arr[i].length; j++) {
				   
				
				
				if (arr[i][j] > result) {
				
		        result = arr[i][j];
					
				}   
				   
					   
				
			}
	
	
			   
		}
		return result;
		 */
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("Dizideki sayi adedini giriniz...");
		int sayi = scan.nextInt();
		
		int arr []= new int [sayi];
		maximumdeger(arr);
		
		
		
		
		
		
		
	}

	private static int maximumdeger(int[] arr) {
		
		
		
		
		
		
		
		
		
		
		return 0;
        
		
		
		
		

		
	}

}
