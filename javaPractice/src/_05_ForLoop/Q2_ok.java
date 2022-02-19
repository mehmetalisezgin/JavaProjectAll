package _05_ForLoop;

import java.util.Scanner;

public class Q2_ok {

	public static void main(String[] args) {
		/*

	       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
	       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

	       Problem Tanımı
	        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını 
	        ekrana yazdırınız (büyükten küçüğe).

	         Ekran Çıktısı
	        91
	        78
	        65
	        52
	        39
	        26
	        13       */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please add a number...");
		int num = scan.nextInt();
		
	
		
		for (int i = num; i > 0; i--) {
			
			if (i%13==0) {
			 
			System.out.println(i);
			 
			scan.close();
			}
			
		}
		
		
		
		
		
		
		
		
	}

}
