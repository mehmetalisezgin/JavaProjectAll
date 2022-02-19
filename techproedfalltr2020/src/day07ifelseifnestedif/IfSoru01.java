package day07ifelseifnestedif;

import java.util.Scanner;

public class IfSoru01 {

	public IfSoru01() {
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun ismi giriniz : ");	
		String day = scan.next();
		
		if (day.equalsIgnoreCase("Cuma")) {
			System.out.println(" Muslumanlar icin Kutsal bir gundur " + day);
		}
		if (day.equalsIgnoreCase("Cumartesi")) {
			System.out.println("Cumartesi Yahudiler icin kutsal bir gundur " + day);
		}
		if (day.equalsIgnoreCase("Pazar")) {
			System.out.println("Pazar Hiristiyanlar icin kutsal bir gundur " + day);
		}
		
		if (day.equalsIgnoreCase("Pazartesi" + "sali")) {
			System.out.println("Deliler icin kutsal bir gundur  " + day);
		}	
		
	}

}
