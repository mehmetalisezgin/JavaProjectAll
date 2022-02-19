package home_work;

import java.util.Scanner;

public class if_sorulari_1 {

	public static void main(String[] args) {
	
	//Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a number");
		int num = scan.nextInt();
		if (num%2==0) {
			System.out.println("This number is an even number");
		}
        if (num%2!=0) {
        	System.out.println("your number is an odd number");
        }
     scan.close(); 
	}

}
