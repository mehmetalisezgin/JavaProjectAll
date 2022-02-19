package day26;

import java.util.Iterator;
import java.util.Scanner;

public class C02A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen birinci dizedeki sayi adedini giriniz.");
		int sayi1 = scan.nextInt();
        int arr1[] = new int[sayi1]; 
        		
        System.out.println("Lutfen ikinci dizedeki sayi adedini giriniz.");
		int sayi2 = scan.nextInt();
        int arr2[] = new int[sayi2];
		
		
		int flag = 0;
		
		
		
		
		
	
	for(int i = 0 ; i<arr1.length; i++) {
		System.out.println(i+1+".sayiyi giriniz.");
		arr1[i]=scan.nextInt();
	}
		for (int j = 0; j<arr2.length; j++) {
			System.out.println(j+1+".sayiyi giriniz.");
			arr2[j]=scan.nextInt();
		}
			for(int each1:arr1) {
				for(int each2:arr2) {
					if(each1==each2) {
						System.out.print(each1+ " ");
						flag++;
					
				
			}
		}
	}
			
		
			
			
			
			
			
		
			
		


	
		
		
		
		
		
		
	}

	

}
