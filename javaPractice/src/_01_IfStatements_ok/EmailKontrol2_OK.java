package _01_IfStatements_ok;

import java.util.Scanner;

public class EmailKontrol2_OK {

	public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
        Scanner scan =new 	Scanner(System.in);
		
		System.out.println("Lutfen email adresinizi giriniz...");
		String email = scan.next();
		
		if (!email.contains("@")) {
			System.out.println("gecerli bir email girin");
		}if (email.contains("@gmail.com")) {
			System.out.println("email onaylandi");
		}if(!email.contains("gmail.com")) {
			System.out.println("Lutfen gmail hesabinizi girin");
		}
		
scan.close();
	}

}
