package day06ifstatement;

import java.util.Scanner ;

public class IfStatement01 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("iki sayi giriniz");
	double a = scan.nextDouble();
	double b = scan.nextDouble();

	if ( a > b) {
		System.out.println("ilk sayi buyuk");	
	}
	
	if (a < b ) {
		System.out.println("ikinci sayi buyuk");
	}
	
	if (a == b) {
		System.out.println("her iki sayida esit");
	}
		
	
	
	//kullanicidan bir sayi alin
	System.out.println("Please write two numbers : ");
	double e1 = scan.nextDouble();
	double o1 = scan.nextDouble();
	System.out.println("e1 : " + e1); 
	System.out.println("o1 : " + o1);
	System.out.println("==========");
	if (e1 % 2== 0) {
		System.out.println("e1 is even number " + e1);
	}
	if (e1 % 2!=0) {
		System.out.println("e1 is not an even number,it is odd number");
	}
	
	if (o1 % 2==1) {
		System.out.println("o1 is an odd number : " + o1);
		
	}
	if (o1 % 2!=1) {
		System.out.println("o1 is not an odd number, it is even number");
	}
	
	//
	
	scan.close();

	
	
	
	
	
	}

}
