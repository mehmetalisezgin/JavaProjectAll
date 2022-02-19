package _01_IfStatements_ok;

import java.util.Scanner;

public class KelimeSorusu_OK {

	public static void main(String[] args) {
		/*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
       Scanner scan = new Scanner (System.in);
	   System.out.println("Lutfen Bir Kelime Yaziniz...");
	   String word = scan.next();
	   
	   
	   for(int i=0; i<3; i++) {
	   if (word.length()>=3) {
		System.out.print(word.substring(2));
		System.out.print(" ");
	}else {
		System.out.print(word);
	}
	   }
		
		scan.close();
		
		
		
	}

}
