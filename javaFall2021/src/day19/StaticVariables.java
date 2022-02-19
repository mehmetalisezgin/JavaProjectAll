package day19;

public class StaticVariables {
	
	static int no = 20; 
	static int sayi ;
	static String adres = "Ankara";
	static String cadde ;
	static boolean aktifmi = true;
	static boolean tatildemi;
	
	
	

	public static void main(String[] args) {
		
      // static variable lara main method dan direk ulasabiliriz mi ? Evet 	
		
		System.out.println(no);// 20
		no++ ;
		staticMethod();
		System.out.println(no); // 21
		StaticVariables obje = new StaticVariables();
		staticolmayanMethod();// basta methodu cagirdik hata verdi bu sebepten bizde bir ustteki objeyi olusturduk...
	}

	public static void staticMethod() {
	// static variable lara main method dan direk ulasilabilirmiyiz ? evet
		no ++ ;
		System.out.println("static method da sayi : "+ no);
		
	// static ise birtane sayi var okulun adi gibi adres no gibi 
		
		
		
	}
	
	public static void staticolmayanMethod() {
		
	// static variable lara main method dan direk ulasabilirmiyiz? evet
		// static variable lara static olan veya olmayan tum methodlardan ulasilabiliriz.
		// bu yuzden static variable ;lara class variuab;e denir
		no++;
		
		System.out.println("static olmayan method da sayi :"+ no);
		
		
		
		
	}
	
	
	
	
	
}
