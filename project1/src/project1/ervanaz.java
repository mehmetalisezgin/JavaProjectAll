package project1;

import java.util.Scanner;

public class ervanaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Cinsiyetinizi giriniz: Erkek / Kadin");
		String c = scan.next();
		System.out.println("Yasinizi giriniz");
		int y = scan.nextInt();
		
		if(c.equalsIgnoreCase("Erkek")) {
			if(y<18) {
				System.out.println("Erkek cocuk");
			} else {
				System.out.println("Bay");
				
			}
		} else if(c.equalsIgnoreCase("Kadin")) {
			if(y<18) {
				System.out.println("Kiz cocuk");
			} else {
				System.out.println("Kadin");
			}
		} else {
			System.out.println("Bu cinsiyet tanimli degil");

       

		}
	}
}


