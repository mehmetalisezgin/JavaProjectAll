package day14;

public class C02_metod_creation {

	public static void main(String[] args) {
		//verilen iki sayinin toplamini ve carpimini yazdiran iki ayri metod yazin
		// method olsuturmak icin 3 adim takip edelim
		// 1. adim method call yazalim
		// 2. adim methoda arguman yazacakmiyiz karar vermeliyiz.
		
		
		
		
		
		int sayi1 = 4 ; 
		int sayi2 = 5 ;
		int sayi3 = 7 ;
		
		
		
		toplama(sayi1,sayi2,sayi3); // method call
		carpma (sayi1,sayi2,sayi3);
// 3. adim 1. ve 2. adimi yaptikdan sonra java dan yardim alip metodu olustururuz
	}

	private static void carpma(int sayi1, int sayi2, int sayi3) {
		// TODO Auto-generated method stub
		
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		// 4. adim erisim duzenleyiciden ve return type a karar vermeliyiz 
		// erisim duzenleyiciden yani axcess modifier dan public yaptik
		// return type bizden sadece yazidrma istedigi icin void kalabilir...
		
		System.out.println("sayilarin toplami :"+(sayi1+sayi2+sayi3));
		System.out.println("sayilarin carpimi :"+(sayi1*sayi2*sayi3));
		
	 String str1 = "a";
	 String str2 = "b";
	 System.out.println(str1.concat(str2));
	
	
	 

	 
	}
	
}
