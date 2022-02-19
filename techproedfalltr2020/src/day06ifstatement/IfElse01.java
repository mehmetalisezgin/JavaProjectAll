package day06ifstatement;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Charecter giriniz : ");
		char char1= scan.next().charAt(0);
		if ((char1 >= 'a' && char1<= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
			System.out.println("WELL DONE IT IS A LETTER :) ");
		}
		else {
			System.out.println("common man learn alphabet");
		}
		
		
		scan.close();
		

	}

	
}
