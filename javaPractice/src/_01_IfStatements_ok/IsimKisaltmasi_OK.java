package _01_IfStatements_ok;

import java.util.Scanner;

public class IsimKisaltmasi_OK {

	public static void main(String[] args) {
		//Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    	
    	Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen Adınızı ve soyadınızı giriniz = "); //Ahmet Emin Yilmaz
        String ad = scan.nextLine();
    	
    	char name1 = ad.charAt(0);
    	char name2 = ad.charAt(ad.indexOf(" ")+1);
    	char name3 = ad.charAt(ad.lastIndexOf(" ")+1);
    	
    	System.out.println(name1+"."+name2+"."+name3);
    	
    	// Ikinci yol 
    	int ilkBoslukIndex = ad.indexOf(" ");
        @SuppressWarnings("unused")
		int sonBoslukIndex = ad.lastIndexOf(" ");
        
        name2 = ad.charAt(ilkBoslukIndex + 1);
    	System.out.println(name2 );
    	/*Ahmet Emin Yılmaz
        A : adAd2Soyad.CharAt(0);
        E : 1.boşluk karakterinin indexinin 1 fazlası
        Y : Son boşluğun indexinin 1 fazlası */

       //en kısa kod:
       System.out.println(ad.charAt(0) + "." + ad.charAt(ad.indexOf(" ") + 1) + "." + ad.charAt(ad.lastIndexOf(" ") + 1) + ".");
       //A.E.Y.
     scan.close();     

	}

}
