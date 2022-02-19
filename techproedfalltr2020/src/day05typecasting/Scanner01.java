package day05typecasting;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
	/*
	 * kenar uzunluklari kullanican alinan bir ucgenin cvresini hesaplayan bir program yaziniz 
	 * byte kullaniniz note: ucgenin cevresi a+b+c	
	 */
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Ucgenin kenar uzunluklarini giriniz");
	byte k1 = scan.nextByte();
	byte k2 = scan.nextByte();
	byte k3 = scan.nextByte();
	int cevre = k1 + k2 + k3 ;
	System.out.println("Cevre: " + cevre);
	
	/* kullanicidan aldiginiz sekil ile asagidaki gibi bir gorunum olusturun
	 *          A
	 *         A A
	 *        A A A 
	 *         	 */
	
	Scanner scan1 = new Scanner(System.in);
	System.out.println("Bir karekter giriniz");
	char ch = scan.next().charAt(0);
	System.out.println("  " + ch + "  ");
	System.out.println(" " + ch + " " + ch + " ");
	System.out.println(ch + " " + ch + " " + ch  );
	
			
			
			
			
			
			
			
			
			
	
	

	}

}
