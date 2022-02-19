package day10_ternary;

public class c03 {

	public static void main(String[] args) {
		// HER DEFASINDA SCANNER OLUSTURMAK YERINE TEST DATALARIMIZI VARIABLE OLARAK OLUSTURABILIRIZ
	
		//char cinsiyet = 'K';
		//int yas = 71;
		//String sonuc = cinsiyet=='K' ?
			//	                      ( yas>=60 ? " emekli olabilirsin":"emekli olamazssin"):
			//	                    	  (yas>=65 ? "emekli olabilirsin":"emekli olamassin");
		
		//System.out.println(sonuc);
		
		// Soru2 : Kullanicidan bir harf isteyin
		// kucuk harf ise consola “Kucuk Harf” ,
		// buyuk harfse consola “Buyuk Harf”
		// yoksa “girdiginiz karakter harf degil” yazdirin.
		
		
		char krk = '.';
		String sonucc = (krk>='a' && krk<='z') ? "kucuk harf": (
		(krk>='A'&& krk<='Z')? "buyuk harf": "girilen karekter harf degil ");
		System.out.println(sonucc);
	}

}
