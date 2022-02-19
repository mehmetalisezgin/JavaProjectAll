package kasim27;

import java.util.Arrays;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		/*Soru 5) Artan düzende uzunluğa göre sıralanmış dizi döndüren bir işlev oluşturun .

Örnekler
sortByLength(["a", "ccc", "dddd", "bb"]) ➞ ["a", "bb", "ccc", "dddd"]

sortByLength(["apple", "pie", "shortcake"]) ➞ ["pie", "apple", "shortcake"]

sortByLength(["may", "april", "september", "august"]) ➞ ["may", "april", "august", "september"]

sortByLength([]) ➞ []
notlar
Dizelerin benzersiz uzunlukları olacaktır, bu nedenle aynı uzunlukta iki dizeyi karşılaştırma konusunda endişelenmeyin.
Girdi dizisi boşsa boş bir dizi döndürün

		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac elemanli bir array olusturcanizi belirleyin...");
		int sayi = scan.nextInt() ; 
		
		String arr[] = new String[sayi];
		
		for(int i = 0 ; i<arr.length ; i++) {
		
		System.out.print("Arrayin" + (i+1) + ". elemanını giriniz: ");
        arr[i] = scan.next();
		
		}
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	
		System.out.println(arr[0].length());
		System.out.println(arr[1].length());
		String temp;
		
		for (int i = 0; i <arr.length; i++) {
			
			for (int j = 1; j < arr.length-i; j++) {
				
				if(arr[j-1].length()>arr[j].length()) {
				
					temp = arr[j];
				
					arr[j] = arr[j-1];
			      
					arr[j-1] = temp;
				
			}
				System.out.println(Arrays.toString(arr));
		}
			
	}			
			
			
			
			
			
		
		
		
		
		
	}

}
