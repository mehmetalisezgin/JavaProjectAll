package day04scanner;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		 System.out.println("Lutfen -128 ile 127 arasinda bir sayi giriniz");

		int sayi = scan.nextInt();

		System.out.println(5*sayi);
	}

}
