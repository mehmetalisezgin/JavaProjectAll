package day18;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		//Soru 7 )Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
		
		
		 Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen pozitif bir tam sayi giriniz");
	     int sayi=scan.nextInt();
	     
	     int rakamlartoplami = 0 ;
	     int rakam = 0 ;
	     
	     while (sayi>0) {
	    	 rakam = sayi%10 ;
	    	 rakamlartoplami+=rakam;
	    	 sayi/=10 ;
	    	 
	     }
	     
	     System.out.println("girdiginiz sayinin rakamlari toplami: "+rakamlartoplami);
	     scan.close();
	     
	     }
	}

