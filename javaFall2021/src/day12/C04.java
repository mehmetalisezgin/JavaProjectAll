package day12;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		// - Girilen kelime cumlede 1 kere kullanilmis.
		// - Girilen kelime cumlede 1’den fazla kullanilmis
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen bir cumle giriniz");
			String cumle = scan.nextLine(); // nextline cumnle oldugu icin
			System.out.println("lutfen varligini kontrol etmek icin bir kelime giriniz");
			
			String kelime = scan.next(); //next olmali kelime oldugu icin
			int ilkindex = cumle.indexOf(kelime);
			int sonindex = cumle.lastIndexOf(kelime);
		if (ilkindex<0) {
			System.out.println("girilen kelime cumlede kullanilmamis...");
		}
			else if (ilkindex==sonindex) {
			System.out.println("girilen kelime cumlede bir kez killanilmis...");
			
		}else {
			System.out.println("girilen kelime cumlede birden fazla kullanilmistir..."); 
		}
		scan.close();
		
		
		
		
		
		
		

	}

}
