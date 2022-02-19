package home_work;

import java.util.Scanner;

public class method_q1 {
	public static void main(String[] args) {
		//Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu kucuk mu oldugunu
				// ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini
				//100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
			Scanner scan = new Scanner(System.in);
			System.out.println("lutfen bir sayi giriniz...");
			
			int sayi=(int) scan.nextDouble();
			
			negatif(sayi);
			tek_cift(sayi);
			pozitif(sayi);
				
	}

	private static void negatif(int sayi) {
		if (sayi<0) {
			System.out.println("girilen sayi negatif bir sayidir...");
		}else {
			System.out.println("girilen sayi pozitiftir...");
		}
			
		
	}

	private static void pozitif(int sayi) {
	if ((sayi>=100)&&(sayi<1000)){
	
		int birler = sayi%10;
		int onlar = (sayi/10)%10;
		int yuzler =(sayi/100);
		System.out.println("basamak degerleri toplami:"+ (birler+onlar+yuzler));
	}else if ((sayi<100)) {
		int birler = sayi%10;
		System.out.println("Yuzden kucuktur ve birler basamagi:"+ birler);
	}else {
		System.out.println("girilen sayi uc basamakli olmadigi icin islem yapilamiyor...");
	}	
		
	}

	private static void tek_cift(int sayi) {
	if 	(sayi%2==0) {
		System.out.println("Bu sayi cift bir sayidir...");
	}else {
		System.out.println("bu sayi tek bir sayidir");
	}
		
	}

	}	


