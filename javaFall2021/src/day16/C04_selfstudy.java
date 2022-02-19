package day16;

import java.util.Scanner;

public class C04_selfstudy {

	public static void main(String[] args) {
	// Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak girilen sayiya kadar 3’un kati olan sayilari yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen yuzden kucuk bir sayi giriniz...");
		
		double sayi = scan.nextDouble();
		int num = (int) sayi; //  bu isleme menualnorwing 
		
		if (sayi<0) {
			System.out.println("Negatif giremezsiniz...");
		}
		else if (sayi!=num) {
		System.out.println("lutfen girdiginiz sayi tam sayi olsun...");
		}
		else if (sayi>100) {
		System.out.println("lutfen 100 den kucuk sayi giriniz...");	
		}else {
			
			
		for(int i =1; i<num; i++) {
			if (i%3==0) {
				System.out.print(i+",");
		
		
		
		// sayi negatifse veya tamsayi degilse uyari verelim 
		
			
			}	
			
			}
	
		}
				
	}	
			
}	
			
		
	
	


