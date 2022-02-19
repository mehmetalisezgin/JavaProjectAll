package _01_IfStatements_ok;

import java.util.Scanner;

public class BuyukKucukHarf_OK {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir karekter giriniz");
		char ch = scan.next().charAt(0);
		if (ch>='A' && ch<='Z') {
			System.out.println("girilen karekter buyuk harftir...");
		}else if (ch>='a' && ch<='z') {
			System.out.println("girilen karekter kucuk harftir...");
		}else {
			System.out.println("hatali giris lutfen harf yaziniz...");
		}

		
		System.out.println("lutfen bir karekter giriniz");
		char ch1 = scan.next().charAt(0);
		if (ch1>='A' && ch1<='Z') {
			System.out.println("girilen karekter buyuk harftir...");
		}else if (ch1>='a' && ch1<='z') {
			System.out.println("girilen karekter kucuk harftir...");
		}else {
			System.out.println("hatali giris lutfen harf yaziniz...");
		}scan.close();

	}

}
