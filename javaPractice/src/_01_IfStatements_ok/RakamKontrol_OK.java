package _01_IfStatements_ok;

import java.util.Scanner;

public class RakamKontrol_OK {

	public static void main(String[] args) {
		//Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Lutfen bir sayi giriniz");
   
    	double a = scan.nextDouble();
        
    	if (a>=0 && a<10) {
    		System.out.println("Bu bir rakamdir...");
    	}else if (a>=10) {
    		System.out.println("pozitif bir sayi...");
    	}else {
    		System.out.println("negatif sayi");
    	}
    	scan.close();

	}

}
