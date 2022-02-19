package day12;

import java.util.Scanner;

public class C05_contains {

	public static void main(String[] args) {
		String str = "Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.contains("k"));
		System.out.println(str.contains("a"));
		System.out.println(str.contains("b"));
		System.out.println(str.contains("Java"));
		System.out.println(str.contains("c"));
		//1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com icermiyorsa “lutfen gmail adresi giriniz”, @gmail.com ile bitiyorsa
      //  “Email adresiniz kaydedildi 
         // “ , @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
		
	//  Soru 1) Kullanicidan email adresini girmesini isteyin, 
        //         - mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”, 
        //         - @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ , 
        //         - @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin 
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen gmail adresinizi giriniz");
        
        
        String email=scan.next();
        
        int uzunluk=email.length();
        int index=email.lastIndexOf("@gmail.com");
        
        if (!email.contains("@gmail.com")) {
            
            System.out.println("lutfen gmail adresi giriniz");
        } else if(index==uzunluk-10){
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin");
        }
        
		
		
	}

}
