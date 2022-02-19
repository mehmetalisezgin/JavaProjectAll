package day17;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		
		// once baslangic degeri atanir daha sonra while dan sonra sartimizi koyuyporuz
		Scanner scan = new  Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz...");
		int i = scan.nextInt();
		if((i>15)||(i<0)) {
			System.out.println("lutfen 0-15 arasinda bir sayi giriniz...");
		}else{
		while(i<15) {
			System.out.println(i);
			i++ ;
		}
		
		}
	}

}
