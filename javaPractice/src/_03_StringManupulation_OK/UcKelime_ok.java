package _03_StringManupulation_OK;

import java.util.Scanner;

public class UcKelime_ok {

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
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a word: ");
		String word = scan.next();
		
		if (word.length()>2) {
			
			word=(word.substring(2,word.length()))+(word.substring(2,word.length()))+
					(word.substring(2,word.length()));
			
			
		} else {
       System.out.println(word);
		}
		
		System.out.println(word);
		
		
		
	}

}
