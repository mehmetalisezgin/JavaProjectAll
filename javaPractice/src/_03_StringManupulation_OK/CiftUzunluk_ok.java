package _03_StringManupulation_OK;

import java.util.Scanner;

public class CiftUzunluk_ok {

	public static void main(String[] args) {
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a word: ");
		String word = scan.next();
		if (word.length()%2!=0) {
			System.out.println("The number of charcter should be an even...");
		} else {
			String firsthalf = word.substring(0,word.length()/2);
			System.out.println(firsthalf);
			String secondhalf = word.substring(word.length()/2);
			System.out.println(secondhalf);
		}
		
		
		scan.close();
		
		
		

	}

}
