package day10_ternary;

import java.util.Scanner;

public class c08manupulation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir yil giriniz");
		
		
		int yil = scan.nextInt();
		
		if (yil%100==0) { // yil 100 tam bolunuyor
			if (yil%400==0) {
				System.out.println("Artik Yildir");
			} else {
				System.out.println("Artik Yil Degildir");
			}
			
		} else if(yil%100!=0) {// yil 100 e tam bolunmuyorsa otomatik kod burayi calistiracaktir
	           
			if(yil%4==0) {
			System.out.println("Artik Yildir");
		}else{
			System.out.println("Artik Yil Degildir");
		}
       
	}
	}
}
