package home_work;

import java.util.Scanner;

public class method_q2 {

	public static void main(String[] args) {
		//Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
		//numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
		//sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
		//duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
		//geri dondurun.!

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Isminizi giriniz...");
		String isim = scan.nextLine();
		System.out.println("lutfen soyisminizi giriniz...");
		String soyisim = scan.nextLine();
		System.out.println("onalti haneli kredi karti numaranizi giriniz...");
		int kartno = scan.nextInt();
		
		isimduzeltme(isim,soyisim);
		
		
		
		
		
		
		
		
	}

	private static String isimduzeltme(String isim, String soyisim) {
		isim = isim.substring(0, 1).toUpperCase()+isim.substring(1);
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1);
		System.out.print(isim +" "+ soyisim);
		
		return (isim + "  " + soyisim) ;
				
		
	}

	

	

}
