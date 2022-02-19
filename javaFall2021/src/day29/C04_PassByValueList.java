package day29;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list veya array olusturalim
		// sonra list elemanlarini degistir methodu yazip orada
		// list elemanlarindan bazilarini degistirelim
		// method void olsun
		// main methoda dondukten sonra yeniden listi yazdiralim
		
		List<String> harfler = new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		//harfler [A,B,C]
	listElemanlarDegistir(harfler);
	System.out.println(" Method da degisitrdiigimz list"+ harfler);
	listDegistir(harfler);// method da yeni deger atadigim halde harfler lkistesi degismedi	
	System.out.println(" Listdegistir metoduna donunce"+ harfler);	
		
	// javada list array gibi objeler icin de pass by value gecerlidir
	// yani farkli bir method da array veya list e yeni deger atamasi yaparsaniz
	// orjinal array veya list degismez...
		
	}

	private static void listDegistir(List<String> harfler) {
		harfler = new ArrayList<>();
		System.out.println(harfler);
		
	}

	private static void listElemanlarDegistir(List<String> harfler) {
		harfler.set(0, "D"); // harfler listindeki a harfinin yerine b yazdirmak icin 
	System.out.println(" Method da degisitrdiigimz list"+ harfler); // [B,B,C
		
	// ISIN ICINDE OBJE OLUNCA OBJENIN KENDISINI DEGISITREMESSINIZ AMA OBJENIN BAZI ELEMANLAIRNIN DEGISTIREBILIRSINIZ
	// 
		
	}

}
