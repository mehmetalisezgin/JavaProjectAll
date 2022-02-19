package day12;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
	// - Girilen kelime cumlede kullanilmamis.
	// - Girilen kelime cumlede 1 kere kullanilmis.
	// - Girilen kelime cumlede 1’den fazla kullanilmis
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle = scan.nextLine(); // nextline cumnle oldugu icin
		System.out.println("lutfen varligini kontrol etmek icin bir kelime giriniz");
		
		String kelime = scan.next(); //next olmali kelime oldugu icin
		int index = cumle.indexOf(kelime);
		if (index<0) {
			System.out.println("girilen kelime cumlede kullanilmamis");
		}else if(cumle.indexOf(kelime,index+1)==(-1) ){
			System.out.println("girilen kelime cumlede bir kez kullanilmis...");
		
		}else {
			System.out.println("girilen kelime cumlede birden fazla kullanilmis...");
		
		}	
		scan.close();
	}

}
