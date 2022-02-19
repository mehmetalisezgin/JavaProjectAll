package Arrays09Aralik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Q5 {
	
	
	

	public static void main(String[] args) {
	// 5)	Write a Java program to find the common elements between two arrays (string values
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen arr1 icin eleman sayisini belirleyiniz");
        int arr1sayi = scan.nextInt();
        int x;
        int y;
        int count = 0 ;
        System.out.println("Lutfen arr2 icin eleman sayisini belirleyiniz");
        int arr2sayi = scan.nextInt();
		


		
		
		
		/*String arr1[] = {"mehmet","erva","asli","zeynep","yusuf"};
		
		String arr2[] = {"mehmet","eva","asli","zeyno","muhammed"};*/
		
		List<String> box = new ArrayList<>();
		
		for(int a = 0 ; a<arr1sayi; a++) {
			System.out.println("arr1 icin giris yapiniz");
			System.out.println(a+1+". elamani giriniz");
			//x =scan.nextInt();
			arr1[a]=scan.nextInt() ;
		}
       for(int b = 0 ; b<arr2sayi; b++) {
			System.out.println("arr2 icin giris yapiniz");
			System.out.println(b+1+". elamani giriniz");
			y =scan.nextInt();
		}
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j <arr2.length; j++) {
				if (arr.arr1[i]==arr.arr2[j]) {
				count++ ; 
				
				}
				
			}
			
		}
		System.out.println(count);
		
	}

}
