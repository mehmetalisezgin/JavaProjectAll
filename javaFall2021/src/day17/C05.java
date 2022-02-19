package day17;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		//kullanicidan toplanmak uzere sayi isteyin. kullanici 0 a basincaya kadarsayilari alip toplamaya devam edin...
		// kullanici sifira bastiginda o ana kadar kac sayi girdigini ve girilen sayilarin toplamini yazdirin...
		
		
		//not: loop icinde kulalancagim obje ve variable lari loop dan once olusturmak daha mantiklidir.
		// cunku loop icinde olusturursak loo her dobdugnde yeni bir obje veya variable olusturur bu da hafizayi doldurur.
		
		Scanner scan = new  Scanner(System.in);
		
		
		
		int sayi = 1;
		int toplam = 0;
		int sayac = 0;
		
		while (sayi!=0) {
			
		System.out.println("lutfen toplama eklemek icin bir tamsayi yazin. bitirmek icin 0 a basin");
		sayi = scan.nextInt();
		toplam+=sayi ;
		sayac++ ;
		}
		System.out.println("girilen sayilkarin adedi:"+ (sayac-1));
		System.out.println("girilen sayilarin toplami"+ toplam);
	}

}
