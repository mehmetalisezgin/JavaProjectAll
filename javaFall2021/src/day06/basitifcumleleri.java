package day06;

import java.util.Scanner;

public class basitifcumleleri {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazar")|| gun.equals("cumartesi") ){
			System.out.println("Hafta sonu");
		}
		if (gun.equals("pazartesi")||gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")||gun.equals("cuma")) {
			System.out.println("Hafta ici");
		}
		
		// string non primitive oldugu icin == kullanilamaz
		
		scan.close();
		

	}

}
