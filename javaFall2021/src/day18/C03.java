package day18;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	     System.out.println("Lutfen pozitif bir tam sayi giriniz");
	     int sayi=scan.nextInt();
	     
	     int rakamlartoplami = 0 ;
	     int rakam = 0 ;
		// int olarka verilen bir sayinin basamak sayisini bulmak istersek
	     // kisa yoldan o sayiyi String e cevirip str.length() metodunu kullaniriz 
		
		String sayistr = " " + sayi ;
	     
	     for (int i = 0; i<sayistr.length(); i++) {
	    	 rakam = sayi%10 ;
	    	 rakamlartoplami+=rakam;
	    	 sayi/=10 ; 

	}
	     System.out.println("girdiginiz sayinin rakamlari toplami: "+rakamlartoplami);
	     scan.close();
	}
}
