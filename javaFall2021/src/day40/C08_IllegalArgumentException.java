package day40;

import java.util.Scanner;

public class C08_IllegalArgumentException {

	public static void main(String[] args) {
	// Kullanicidan yasini girmesini isteyin
		// kodunuzu kullanicid sifirdan kucuk bir sayi girerse Exception verecek sekilde yazin
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yasinizi yaziniz");
		int yas = scan.nextInt();
		
		try {
			if(yas<0) {
				throw new IllegalArgumentException(); // bunu yaptigimizda eception formatinda bir hata verecek
			}else {
				System.out.println(yas);
			}
		} catch (IllegalArgumentException e) {
		System.out.println(e);
		System.out.println("yas sifirdan kucuk olamaz");
		}

	}

}
