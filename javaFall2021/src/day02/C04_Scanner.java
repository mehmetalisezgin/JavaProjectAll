package day02;

import java.util.Scanner;

public class C04_Scanner {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kilonuzu giriniz:");
		
		int kg = scan.nextInt();
		
		System.out.println("Lutfen boyunuzu giriniz:");
		
		float boy = scan.nextFloat() ;
		
		System.out.println("Vucut kitle indeksiniz:"+ kg/(boy*boy));
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
