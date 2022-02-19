package day16;

import java.util.Scanner;

public class C11_selfstudy {

	public static void main(String[] args) {
	//	Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
	// sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)	

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 10 dan kucuk sayi giriniz...");
		int num1 = scan.nextInt();
		
		int factoryel = 1 ;
		
	 for(int i = num1; i>0; i--) {
		 factoryel*= i;
		 
	 }
		
	System.out.println("sayimizin factoriyeli "+num1+"5! "+ factoryel);	
	}

}
