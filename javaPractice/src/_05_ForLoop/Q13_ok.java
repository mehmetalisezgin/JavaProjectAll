package _05_ForLoop;

import java.util.Scanner;

public class Q13_ok {
 static int num ;
 static int box ;
	public static void main(String[] args) {
		/*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
        hesaplayan kodu yazınız.

        Örnek Ekran Çıktısı
       Girilen sayı=4
       Kareler toplamı=30
    */

	addition(num);
	
		
		
		
		
	}
	public static void addition(int num2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a number");
		num = scan.nextInt();
	 for (int i = 0; i <= num; i++) {
		box+=i*i ;
	}	
	System.out.println(box);	
	}

}
