package day17;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
				// girdigi sayiya gore asagidaki sekli yazdirin
				// orn : 3 girilirse
				// 1
				// 1 2
				// 1 2 3
		Scanner scan = new Scanner(System.in);
    	System.out.println("Ondan kucuk bir sayi giriniz...");
        int sayi1 = scan.nextInt();
		
		if (sayi1<0) {
			System.out.println("lutfen 10 dan kucuk bir pozitif sayi giriniz...");
		}else if (sayi1>10) {
			System.out.println("lutfen 10 dan kucuk bir sayi olsun...");
		}else {
			for (int satir=1; satir<=sayi1; satir++) {
				for(int j=1; j<=satir; j++) {
			System.out.print(satir+" ");		
				}System.out.println("");
			}
		}

	}

}
