package day29;

import java.util.Arrays;

public class C04_PassByValue {

	public static void main(String[] args) {
		int sayilar[] = {3,4,5,6} ;
		
		elemanDegistir(sayilar);
		System.out.println("eleman degistir methodunda : "+Arrays.toString(sayilar));
		arrayiDegistir(sayilar);
		System.out.println("arrayidegistir methodundan : "+Arrays.toString(sayilar));
		
		}

	private static void arrayiDegistir(int[] sayilar) {
		sayilar = new int[6];
		System.out.println("arrayidegistir methodundan : "+Arrays.toString(sayilar));
		
	}

	private static void elemanDegistir(int[] sayilar) {
		sayilar[0] = 10;
		System.out.println("eleman degistir methodunda : "+Arrays.toString(sayilar));
		
	}

	}


