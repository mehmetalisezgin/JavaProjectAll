package _04_methods_ok;

import java.util.Iterator;
import java.util.Scanner;

public class C06_ok {

	public static void main(String[] args) {
		 /*
        Problem tanımı :
        Bir String içinde kaç kelime olduğunu yazdıran bir method yazınız.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */

		System.out.println("Please write your word");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();	
		
		
		System.out.println("Girilen String kelime sayısı : "+countnumber(word));
		countnumber(word);
		
		
	scan.close();	
		
	}

	public static int countnumber(String word) {
	int count=0;
	char space = ' ';
	for (int i = 0; i < word.length(); i++) {
		if(word.charAt(i)==space) {
			count++;
		}
		
	}
	return count+1;
		
	}

}
