package day20;

import java.util.Arrays;

public class C02_SplitArrays {

	public static void main(String[] args) {
		
		String cumle = "Java Ogrenmek Cok Guzel" ;
		String kelimeler[] = cumle.split(" ") ;
		System.out.println(Arrays.toString(kelimeler));
		
		for (int i= kelimeler.length-1 ; i>0 ; i--) {
			System.out.print(kelimeler[i] + " ");
		}

	}

}
