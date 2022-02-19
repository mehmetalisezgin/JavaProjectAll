package _04_methods_ok;

import java.util.Scanner;

public class C08_ok {

	public static void main(String[] args) {
		 /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
		System.out.println("Please write your word");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		
		System.out.println(reverseString(word));
		reverseString(word)	;
	scan.close();	
	}

	public static String reverseString(String word) {
	String word2 = word.trim();
	String strters = "";
	
	for (int i = word.length()-1; i>=0; i--) {
		strters+=word2.charAt(i);
	}
	
	
	
	return strters;
	
	
	
	
	
	
	
	
	}

}
