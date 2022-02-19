package _01_IfStatements_ok;

import java.util.Scanner;

public class MutlakDeger_OK {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("Please write a number...");
		
		double a = scan.nextDouble();
		
		if (a<0) {
			System.out.println("absolute value of a is :"+ (a*(-1)));
		}else if (a>=0){
			System.out.println(a);
		}else {
			System.out.println("Invailed charachter...");
		}
		
		
		scan.close();
		

	}

}
