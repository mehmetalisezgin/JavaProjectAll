package day02;

public class C02_SwapVariables {
	
	public static void main(String[] args) {
		
		// verilen sayi1 ve sayi 2 variable larin degerlerini degistiren (swap) bir program yaziniz
		// orn: sayi1 = 10 ve sayi2 = 20 kod calistikdan sonra sayi1=20 sayi2=10 olacak
		
		int sayi1 = 10;
		int sayi2= 20 ;
		
		System.out.println("baslangicta sayi1 ="+sayi1+ " ve sayi2 = "+sayi2);
		
		// ilk once bos bir variable olusturalim
		int bos;
		// sayi2 yi bos variable a atayalim
		bos = sayi2 ;
		//sayi2 variable ina sayi1 degerini atayalim
		sayi2 = sayi1;
		// bos variable ini sayi1 e atayalim
		sayi1 = bos ;
		
		
		System.out.println("sonucta sayi1="+sayi1+ " ve sayi2= "+sayi2);
		
		
		
		
		
		
		

	}

	

}
