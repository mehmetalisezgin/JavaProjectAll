package day09;

import java.util.Scanner;

public class C01_NestedIfElse {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write to the password:");
		char  letter = scan.next().charAt(0);
		
		if (letter>='A' && letter<='Z') {
		if (letter=='A') {
			System.out.println("Correct...");
		}
		else {
				System.out.println("Try again!!");
			}
		if (letter=='Z') {
			System.out.println("Correct");
		}
		else {
			System.out.println("try again!!");
		}
		}
		}
		
		
		

	}


