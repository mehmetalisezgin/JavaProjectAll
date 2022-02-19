package day19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07 {

	private static boolean k;

	public static void main(String[] args) {
		// Kullanicidan bir sifre girmesini isteyin. Girilen sifreyi asagidaki sartlara gore kontrol
		//edin ve sifredeki hatalari yazdirin.
		//Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin ve gecerli sifre
		//girdiginde “Sifreniz Kabul edilmistir” yazdirin.
		
		//Sifre kucuk harf icermelidir
		
		//Sifre buyuk harf icermelidir
		//
		//Sifre ozel karakter icermelidir
		
		//Sifre en az 8 karakter olmalidir.
        Scanner scan = new Scanner(System.in);
		String sifre = "";
		
		boolean khk=false;
		boolean bhk = false;
		
		do {
			System.out.println("lutfen sifrenizi giriniz...");
			sifre = scan.nextLine();
			
			khk = kucukharfkontrol(sifre);
		    bhk =buyukharfkontrol(sifre);
			//ozelkarekterkontrol(sifre);
			//uzunlukkontrol(sifre);
				
		}while(!khk || !bhk);
		System.out.println("Sifreniz basarili bir sekilde kaydedildi...");
			
		
	}

	private static void uzunlukkontrol(String sifre) {
		// TODO Auto-generated method stub
		
	}

	private static boolean ozelkarekterkontrol(String sifre) {
		return false;
		
		
	}

	private static boolean buyukharfkontrol(String sifre) {
		boolean bhk = false;
		String harf = "ABCDEFGHIJKLMNOPRSTUVYZQWX";
		
		for(int i = 0; i<sifre.length(); i++) {
	        if (harf.contains(sifre.substring(i,i+1))) {
	        	//System.out.println("Buyuk harf kontrolu ok...");	
	        	bhk=true ;
	        	break; 
	        }	
	        }
	        	
	       if(!bhk) {
	    	   System.out.println("Sifrenizi en az bir buyuk harf icermelidir...");
	       
		}
		return bhk;
		
	
	}

	private static boolean kucukharfkontrol(String sifre) {
		boolean khk = false;
		String harfler = "abcdefghijklmnoprstuvyzqwx";
		
		for(int i = 0; i<sifre.length(); i++) {
	        
			if (harfler.contains(sifre.substring(i,i+1))) {
	        	//System.out.println("kucuk harf kontrolu ok...");	
	        	khk=true ;
	        	break; // butun harflerin kucuk olmasi lazim degil birtane buldugu icin break olacak ki durdurcak
	        }
	        	// bu satira gel;digmizde sifrede kucuk harf varsa khk=true, hic yoksa khk=false calisir
		}
			if(!khk) {
				
	    	   System.out.println("Sifrenizi en az bir kucuk harf icermelidir...");
	       } 
	    	 
		return khk;
		
		
	}

}
