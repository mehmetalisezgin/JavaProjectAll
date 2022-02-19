package replit;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Varargs_01 {
	public static void main(String[] args) {
	/*
	 * Write a return method that accepts more than one integer as parameter 
	 * and prints the sum of integers Method name = sum if you call 
	 * method like that sum(1,2,3) output =6 sum(1,2,3,4,5)
	 *  output =15 sum(1,2) output=3
	 *  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen toplamak istediginiz sayilari sayisini giriniz");	
		
		int sayi = scan.nextInt();
	
		int arr[] = new int[sayi];
		
		for (int i = 0; i < sayi; i++) {
			System.out.print("Arrayin" + (i+1) + ". elemanını giriniz: ");
            arr[i] = scan.nextInt();
		}
	
	sum(arr);
	
	
	
	
		
			
	}

	private static void sum(int... sum) {
		
        int toplam = 0;
		
		for(int each:sum) {
			toplam+=each ;
		}
		
		
		System.out.println(toplam);	
		
		
		
		
		
		
	}		
		
		
		
	}

	

		
		


	
		
	

	
