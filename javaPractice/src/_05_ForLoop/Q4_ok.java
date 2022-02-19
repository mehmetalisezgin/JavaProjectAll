package _05_ForLoop;

import java.util.Scanner;

public class Q4_ok {

	public static void main(String[] args) {
		/*
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
        
         */
		
		Scanner scan = new Scanner(System.in) ; 
		System.out.println("Please write your text");
		String word = scan.nextLine();
		
	   int count  = 0 ;
	   
	   for (int i = 0; i < word.length(); i++) {
		   
		   if (word.toLowerCase().charAt(i)=='a') {
			count++;
			
		} else if(word.toLowerCase().charAt(i)=='c'){
          break;
		}
		
	}
	   System.out.println(count);
	}
}
