package _01_IfStatements_ok;

import java.util.Scanner;

public class KarekterKontrol_OK {

	public static void main(String[] args) {
		// Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii değeri

       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen bir karekter giriniz...");
       char krk = scan.next().charAt(0);
       
       if (krk>='a' && krk<='z') {
    	   System.out.println("kucuk harf");
       }else if(krk>='A'&& krk<='Z') {
    	   System.out.println("buyuk harf");
    	   
       }else {
    	   System.out.println("girilen karekter bir harf degildir...");
       }
    	
    	
    	scan.close();

	}

}
