package day07;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir karekter giriniz");
		
		char  karekter =scan.next().charAt(0);
		
		if ((karekter>='A'&& karekter<='Z') || (karekter>='a'&&karekter<='z')){
		System.out.println("girdiginiz "+ karekter+" bir harftir");	
		}
		
		else {
			System.out.println("lutfen bir karekter giriniz");
		}
		
		
		
		
		
		
		

	}

}
