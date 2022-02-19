package day12;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Cumle Giriniz");
		String cumle = scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir harf giriniz");
		char  krk = scan.next().charAt(0);
		int index = cumle.indexOf(krk);
		if (index<0) {
			System.out.println("girilen harf verilen cumlede yoktur.");
		}else {
			System.out.println("Girdiginiz harf verilen cumlede var...");
		}
scan.close();
	}

}
