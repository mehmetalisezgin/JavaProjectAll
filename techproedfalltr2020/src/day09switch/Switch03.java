package day09switch;

import java.util.Scanner;

public class Switch03 {

	public Switch03() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ismini gormek istediginizi gunun sayisini giriniz :");
		
		int gun = scan.nextInt();
		switch(gun) {
		case  1 :
			System.out.println("pazartesi");
			 
			
		case  2 :
			System.out.println("sali");
			
		case  3 :
			System.out.println("carsamba");
			
		case  4 :
			System.out.println("persembe");
			
		case  5 :
			System.out.println("cuma");
		
		case  6 :
			System.out.println("cumartesi");
			
		case  7 :
			System.out.println("pazar");
			break ;
			default :
				System.out.println("gecerli gun sayisi giriniz");
			
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		

	}

}
