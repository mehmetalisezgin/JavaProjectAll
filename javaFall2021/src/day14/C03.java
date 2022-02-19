package day14;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
        // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
        // kullaniciya us sorun
        // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write two numbers...");
		
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		
        System.out.println("Kareler toplami icin 2, kupler toplami icin 3 giriniz...");
		
	    int us = scan.nextInt();
	    
	    if (us==2) {
	    	karealma(x1,x2);
	    }else if (us == 3) {
	    	kupalma(x1,x2);	
	    }else {
	    	System.out.println("Lutfen 2 yada 3 giriniz...");
	    }
	    
	    
		//karealma(x1,x2);
		//kupalma(x1,x2);
	}

	public static void kupalma(double x1, double x2) {
	System.out.println((x1*x1*x1)+(x2*x2*x2));

		
	}

	public static void karealma(double x1, double x2) {
		System.out.println((x1*x1)+(x2*x2));
		
		
		
		
	}

}
