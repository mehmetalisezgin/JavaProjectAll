package day15;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		//soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse, 
		//kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		//Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.

	Scanner scan = new Scanner(System.in);
	System.out.println("lutfen kac sayi toplamak istediginizi sayi adedini yaziniz...");
	int tercih = scan.nextInt();
	//ikisayitopla ();
	//ucsayitopla();
	//dortsayitopla();
	
	if (tercih>4) {
		tercih = 5 ;
	}
	switch (tercih){
		case 2:
			ikisayitopla();
			break;
		case 3 :
			ucsayitopla();
			break ;
		case 4 :
			dortsayitopla();
			break ;
		case 5 :
			System.out.println("cok sayi girdiniz, ben toplayamam");
			default :
				System.out.println("gecersiztercih");
	}	
		
	// ekranda birsey yazdirmak istiyorsak return olmaz void olur...	
		
	}

	private static void dortsayitopla() {
		Scanner scan = new Scanner(System.in);
		double s1 = scan.nextDouble();
		double s2 = scan.nextDouble();
		double s3 = scan.nextDouble();
	}

	private static void ucsayitopla() {
		// TODO Auto-generated method stub
		
	}

	private static void ikisayitopla() {
		// TODO Auto-generated method stub
		
	}

}
