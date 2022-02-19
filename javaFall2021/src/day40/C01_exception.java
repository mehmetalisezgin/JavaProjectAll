package day40;

import java.util.Scanner;

public class C01_exception {
    final static int sayi=30; 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi yaziniz");
		int a = scan.nextInt() ;
		System.out.println("lutfen ikinci sayiyi yaziniz");
		int b =scan.nextInt() ;
		
		
		
		try {
			  // block of code that can throw exceptions
			System.out.println("sayilarin bolumu :"+ (a/b));
			
			} catch (ArithmeticException e) {
				
			  // Exception handler
			System.out.println("sifir kulanilmaz");	
			//System.out.println(e.getMessage());// exception in kaynagini gosterdi
			e.printStackTrace();
			}	
		
		
			
		//System.out.println("sayilarin bolumu :"+ (a/b));
		System.out.println("Gorev tamamlandi");
	
	}
}
