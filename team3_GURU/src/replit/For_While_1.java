package replit;

import java.util.Scanner;

public class For_While_1 {

	public static void main(String[] args) {
	/*
	 * Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
	 *  ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

      char ch1= 'a' ;

	  String name =“John came late" 

	 Expected Output: 


     Number of a = 2	
	 */
		System.out.println("Please write your text...");
        Scanner scan = new Scanner(System.in);
		String input = scan.nextLine() ;	
		System.out.println("Please write a chrackter to check in the text...");
		char char1 = scan.next().toLowerCase().charAt(0) ;
		int count = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if(char1==input.toLowerCase().charAt(i)) {
				count++ ; ;
			
			}
		}
		System.out.println("the character :"+char1+ " appears "+count + " times.");
		
	}
	

}
