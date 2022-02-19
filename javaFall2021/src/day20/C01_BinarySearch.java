package day20;

import java.util.Arrays;

public class C01_BinarySearch {

	public static void main(String[] args) {
		int [] arr = {6,-4,12,0,-10} ;
		int x = -10 ; 
		int y = Arrays.binarySearch(arr, x);
		System.out.println(y);
		
		/*binarrysearch methodu belli bir elemanin bir arfray de olup olmadigini kontrol etmek icin kullanilir.
		search ederken once ortadaki elemana bakr sonra compare eder solda mi sagda mi 
		kontrol edilen eleman sayisini azaltilir.
		
		/*
		
		/* String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		// Outputs Volvo
		cars[0] = "Opel";
		System.out.println(cars[0]);
		
		System.out.println(cars.length);
		// Outputs 4
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]); 
			}*/
		
		
		int [] numbers = {2,8,6,4 } ;
		Arrays.sort(numbers);
		System.out.println(Arrays.binarySearch(numbers, 1));
		// arrays class ile sort yaptigimizda arraimiz kalici olarak degisir.
		// sort methodu elementleri natural order a gore siralar.
		
		
		
		String isimler[] = { "Hacer", "Ainagul", "Emine", "Murat", "Kutlu"} ;
		// isimler arrayin  de murat ismi varmi 
		Arrays.sort(isimler);
		System.out.println(Arrays.toString(isimler));
		isimler[4] = "Mahmut";
		System.out.println(Arrays.toString(isimler));
		Arrays.sort(isimler) ;
		System.out.println(Arrays.binarySearch(isimler, "Ainagul"));
		
		
		int num1 []= {3,6,7,9,4,0};
		Arrays.sort(num1);
		System.out.println(Arrays.binarySearch(num1, 9));
		// var olanlarda 0 dan olmayanlarda 1 den baslayarak tarama yapar
		
	}

}
