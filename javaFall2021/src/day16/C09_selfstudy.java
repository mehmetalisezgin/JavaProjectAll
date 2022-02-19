package day16;

import java.util.Scanner;

public class C09_selfstudy {
	//Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki tum tamsayilari
	//toplayip, sonucu yazdiran bir program yaziniz

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz...");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int kucuk = 0;
		int buyuk = 0;
		
		
		if(num1>num2) {
			buyuk=num1;
			kucuk = num2;
		}else {
			buyuk=num2;
			kucuk=num1;
		}
		int toplam = 0;
		for(int i = kucuk ; i<=buyuk; i++) {
		toplam+=i;
		}
		
		System.out.println(toplam);
		
		

	}

}
