package _01_IfStatements_ok;

import java.util.Scanner;

public class Dort_Islem_OK {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz...");
		double sayi1 = scan.nextDouble();
		System.out.println("lutfen ikinci sayiyi giriniz");
		double sayi2 = scan.nextDouble();
		System.out.println("Toplama icin->1\ncikarma icin ->2\ncarpma icin ->3 \nbolme icin ->4\n giriniz...");
		int islem = scan.nextInt();
		
		if (islem==1) {
			System.out.println("girdiginiz sayilarin toplami"+ (sayi1+sayi2));
			
		}
		else if (islem==2) {
			System.out.println("girdiginiz sayilarin farki"+ (sayi1-sayi2));
		}
		else if (islem==3) {
			System.out.println("girdiginiz sayilarin carpimi"+ (sayi1*sayi2));
		}
		else if (islem==4) {
			System.out.println("girdiginiz sayilarin orani"+ (sayi1/sayi2));
		}
		else {
			System.out.println("dostum duzgun birsey gir...");
		}
		scan.close();	

	}

}
