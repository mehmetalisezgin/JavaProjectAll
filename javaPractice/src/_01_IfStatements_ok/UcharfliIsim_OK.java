package _01_IfStatements_ok;

import java.util.Scanner;

public class UcharfliIsim_OK {

	public static void main(String[] args) {
		/* TODO Auto-generated method stub/*
        * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
        * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
        * Test data: ali eme all
        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfenuc harfli bir kelime Giriniz...");
		String name = scan.next();
		
		char a = name.charAt(0);
		char b = name.charAt(1);
		char c = name.charAt(2);
		if (name.length()>3) {
			System.out.println("Lutfen 3 harfli bir kelime giriniz...");
		}else if((a!=b)&&(a!=c)&&(b!=c)) {
			System.out.println("Harfler uniqe dir..");
		}else {
			System.out.println("Lutfen uc harfli bir kelime giriniz...");
		}
		
		//Input: 123456>>>>Output: Lutfen 3 harfli bir kelime giriniz...
        //Input: 112 veya 665, 151>>> Output: Lutfen uc harfli bir kelime giriniz...
		//Input: 112 veya 665, 151>>> Output: Lutfen uc harfli bir kelime giriniz...
		// Input: 123 veya 665, 151>>> Output: Harfler uniqe dir..
	}

}
