package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		//kullanicidan istedigi kadar sayi alip bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icin q ya basiniz...
		
		int sayi = 0 ;
		int toplam = 0 ;
		int count = 0;
		//String secim = "" ;
		Scanner scan = new Scanner(System.in);
		try {
			while(count<10000 ) {
				System.out.println("Lutfen toplam icin bir sayi yaziniz\nBitirmek icin sayi disindabir tusa basiniz");
				sayi=scan.nextInt();
				toplam+=sayi ;
				count++ ;
			}
		} catch (InputMismatchException e) {
			 System.out.println("sayilarin toplami :"+toplam);
		}
		
		
		
		}
	
}
    
	


