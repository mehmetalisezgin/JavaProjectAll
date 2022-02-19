package day17;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// kullanicidan iki sayi alalim ve aralarindaki sayiyi ucerli yazalim...
		
		
		Scanner scan = new Scanner(System.in);
    	System.out.println("iki sayi yaziniz...");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        
        if (sayi1<sayi2) {
        	for (int i=sayi1; i<sayi2; i=i+3) {
        		System.out.print(i+" ");
        	}
        }else if (sayi1>sayi2) {
        	for(int i = sayi1; i>sayi2; i=i-3) {
        		System.out.print(i+" ");
        	}
        }else {
        	System.out.println("girilen sayilar esittir...");
        }
        scan.close();
	}

}
