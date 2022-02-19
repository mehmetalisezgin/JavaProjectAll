package day05;

import java.util.Scanner;

public class C02_modules {

	public static void main(String...args) {
	//System.out.println(15%4);
	
	Scanner scan = new Scanner(System.in) ;
	
	System.out.println("Lutfen dort basamakli bir sayi girinir:");
	int sayi = scan.nextInt();
	
	int rakamlartoplami = 0 ;
	int rakam = (sayi%10) ;
	rakamlartoplami+=rakam ;
	
	sayi/=10;
	rakam = sayi%10;
	rakamlartoplami+=rakam;
	
	sayi/=10;
	rakam = sayi%10;
	rakamlartoplami+=rakam;
	
	sayi/=10;
	rakam=sayi;
	rakamlartoplami+=rakam;
	

	
	System.out.println(rakamlartoplami);
			


	
	
	
			
	
	
	
	
	
	
	
	
	
	

	}

}
