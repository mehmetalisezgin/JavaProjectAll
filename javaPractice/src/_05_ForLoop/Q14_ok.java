package _05_ForLoop;

import java.util.Scanner;

public class Q14_ok {
	static String word ;
	static char letter;
	static int count;
	

	public static void main(String[] args) {
		/*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */
		
		catchSameWord(word);
		

	
		
}



	private static void catchSameWord(String word2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a word");
		word = scan.nextLine();
		System.out.println("Please write a letter to check in the sentence");
		letter = scan.next().toLowerCase().charAt(0);
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)==letter) {
			count++ ;	
			} 
			
		}
	System.out.println("Girdiginiz cumlede " + letter +" karakteri "+ count+ " kere kullanilmistir");	
		
		
		
		
	}
		
		
		
	}


