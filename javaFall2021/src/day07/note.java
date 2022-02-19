package day07;

import java.util.Scanner;

public class note {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Maas beklentiniz nedir ?");
		double maas = scan.nextDouble();
		if (maas<0) {
			System.out.println("Lutfen gecerli bir sayi giriniz...");
		}
		else if (maas<60000) {
			System.out.println("kabul edemicem sorry...");
		}
		
		else if (maas>80000) {
			System.out.println("Isi kabul ediyorum... :) ");
		}
		else if (maas<80000) {
			System.out.println("isi kabul ediuyorum ");
		}
		
		

	}

}
