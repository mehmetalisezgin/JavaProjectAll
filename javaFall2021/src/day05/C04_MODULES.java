package day05;

import java.util.Scanner;

public class C04_MODULES {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("Lutfen uc basamakli bir sayi girinir:");
		int sayi = scan.nextInt();
		
		int kalan = 0 ;  // iteration
		
		
		int rakam = (sayi%10) ;
		kalan+=rakam ;
		
		sayi/=10;
		rakam = sayi%10;
		kalan+=rakam;
		sayi/=10;
		rakam=sayi;
		kalan+=rakam;
		System.out.println(kalan);

	}

}
