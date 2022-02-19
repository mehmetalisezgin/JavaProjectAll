package _04_methods_ok;

import java.util.Scanner;

public class C05_ok {

	public static void main(String[] args) {
		/*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

		System.out.println("Please write your word");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.next().toLowerCase();
		
		control(word);
		
		
		
	scan.close();
		
	}

	public static boolean control(String word) {
		String a = "xyz";
		if (word.contains(a)) {
			
		System.out.println("true");
		return true;
		} else {
		System.out.println("false");
		return false;
		}
			
		
	}

}
