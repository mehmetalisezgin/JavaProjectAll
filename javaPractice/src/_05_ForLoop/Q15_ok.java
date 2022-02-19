package _05_ForLoop;

import java.util.Iterator;
import java.util.Scanner;

public class Q15_ok {

	public static void main(String[] args) {
		 /*  Problem Tanımı
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */
		
		Scanner scan = new Scanner(System.in);
        System.out.print("pozitif bir tam sayı giriniz : ");
        int sayi = scan.nextInt();
		
        for (int satir = 1; satir <= sayi; satir++) {
        	for (int bosluk = sayi-satir; bosluk >= 0; bosluk--) {
				System.out.print("");
			}
		for (int yildiz = 1; yildiz <= satir; yildiz++) {
		System.out.print("1");
		}	
		System.out.println();
		}
		
		
		
		
	}

}
