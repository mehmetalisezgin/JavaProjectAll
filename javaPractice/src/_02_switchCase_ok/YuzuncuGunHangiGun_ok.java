package _02_switchCase_ok;

import java.util.Scanner;

public class YuzuncuGunHangiGun_ok {

	public static void main(String[] args) {
		// Bugüne göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi haftanin ilk gunu olarak aliniz..
        
        // girilen gun sayisini bugunden itibaren baz alarak hesap edin hangi gun olacagini
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Lutfen gun sayisini yaziniz...");
	int gun = scan.nextInt();
	
	if (gun%7==1) {
		System.out.println("Gunlerden pazartesi...");
		
	}if (gun%7==2) {
		System.out.println("Gunlerden sali...");
		
	}if (gun%7==3) {
		System.out.println("Gunlerden carsamba...");
		
	}if (gun%7==4) {
		System.out.println("Gunlerden persembe...");
		
	}if (gun%7==5) {
		System.out.println("Gunlerden cuma...");
		
	}if (gun%7==6) {
		System.out.println("Gunlerden cumartesi...");
		
	}if (gun%7==0) {
		System.out.println("Gunlerden pazar...");
		
	}
		
		
	}

}
