package _01_IfStatements_ok;

import java.util.Scanner;

public class EmailKontrol_OK {

	public static void main(String[] args) {
		 /*
	       kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" 
	       içeriyorsa, "gmail" ile değiştirin,
	        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
	        */

		Scanner scan =new 	Scanner(System.in);
		
		System.out.println("Lutfen email adresinizi giriniz...");
		String email = scan.next();
		
		if (email.contains("@hotmail.com")) {
			System.out.println(email.replace("hotmail", "gmail"));
		} else {
         System.out.println("Email adresini yanlis girdiniz...");
		}
		
		scan.close();
		
		
	}

}
