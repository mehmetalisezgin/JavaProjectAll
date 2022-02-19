package _01_IfStatements_ok;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class StringMethod_OK {

	public static void main(String[] args) {
		/*
		StringMethods:
		cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    ORNEK:
     	INPUT      :  Python
		OUTPUT :   Pyt
*/
       
        Scanner scan =new 	Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz...");
		
		String kelime =scan.next();
		
		int uzunluk = kelime.length(); 
		//int n = 2; // ikiye bolecegimiz icin
		int temp = 0, chars = uzunluk/2; 
		
		String yenikelime [] = new String[2];
		
		
		
		if (kelime.length()%2!=0) {
			System.out.println("Lutfen harf sayisi cift olan bir kelime girin");
		}else {
			for (int i = 0; i < uzunluk; i=i+chars) {
				String part = kelime.substring(i,i+chars) ;
				yenikelime[temp] = part ;
				temp++;
			}
		for (int i = 0; i < yenikelime.length; i++) {
			System.out.println(yenikelime[i]);
		}
		}
		
		
		scan.close();
		
		
		
	}

}
