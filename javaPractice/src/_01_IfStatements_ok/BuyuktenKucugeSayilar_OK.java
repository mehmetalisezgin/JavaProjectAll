package _01_IfStatements_ok;

import java.util.Scanner;

public class BuyuktenKucugeSayilar_OK {

	public static void main(String[] args) {
		/*
	    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
	    en kucuk olanlarini konsola yazdiriniz
	    int num1 
	    int num2 
	    int num3
	*/
	    
	    
	    	Scanner scan =new Scanner(System.in);
	    	System.out.println("Lutfen uc sayi giriniz");
	    	System.out.print("Birinci sayi ");
	    	double a = scan.nextDouble();
	    	System.out.print("Ikinci sayi ");
	    	double b = scan.nextDouble();
	    	System.out.print("Ucuncu sayi");
	    	double c = scan.nextDouble();  
	        
	    	
	    	if(a==b || b==c) {
	    		System.out.println("sayilar esit olmamali");
	    	}
	    	
	    	if(a<b && b<c) {
	    		System.out.println("buyuk sayi "+c);
	    	}if (a<c && c<b) {
	    		System.out.println("buyuk sayi "+b);
	    	}if (b<a && a<c) {
	    		System.out.println("buyuk sayi "+c);
	    	}if (b<c && c<a) {
	    		System.out.println("buyuk sayi "+a);
	    	}if (c<a && a<b) {
	    		System.out.println("buyuk sayi "+b);
	    	}if (c<b && b<a) {
	    		System.out.println("buyuk sayi "+a);
	    	}
	    	
	    	scan.close();

	}

}
