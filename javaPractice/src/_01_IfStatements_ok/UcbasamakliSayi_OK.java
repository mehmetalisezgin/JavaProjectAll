package _01_IfStatements_ok;

import java.util.Scanner;

public class UcbasamakliSayi_OK {

	public static void main(String[] args) {
		// Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
        // 3 basamaklı degilse çift olup olmadigini kontrol edin. Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
        // Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”

    	Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz...");
        int num = scan.nextInt();
        
        if(num<1000 && num>=100) {
            System.out.println("sayi uc basamaklidir");	
        }
        else if (num==0) {
        	System.out.println("sifir ne cift ne de tektir...");
        }
        else if (num%2==0) {
        	System.out.println("3 basamakli olmayan cift sayi");
        }
        else {
        	System.out.println("uc basmaakli olmayan tek sayi");
        }
    	
    	scan.close();

	}

}
