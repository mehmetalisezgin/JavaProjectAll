package kasim27;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		//Soru 3) Bir dizinin en büyük ve en küçük öğelerini bulun.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen girmek istediginiz dizi sayisini belirleyin...");
		int sayi = scan.nextInt();
		
		int bignum = 0 , smallnum = 0 ;
		
		int [] arr = new int[sayi];
		
		
		for(int i = 0; i < sayi; i++) {
        
            System.out.print("Arrayin" + (i+1) + ". elemanını giriniz: ");
            arr[i] = scan.nextInt();
            
            if(i == 0) {
                bignum = arr[i];
                smallnum = arr[i];
            }
            if(arr[i] > bignum) {
                bignum = arr[i];
            }
            if(arr[i] < smallnum) {
                smallnum = arr[i];
            }
        }
        System.out.println("Dizinin en büyük elemanı = " + bignum);
        System.out.println("Dizinin en kucuk elemanı = " + smallnum);
        System.out.println("Fark = " + (bignum - smallnum));
		

	}

}
