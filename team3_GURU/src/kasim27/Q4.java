package kasim27;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		/*Soru 4) P ve q boyutunda iki sıralanmış A ve B dizisi verildiğinde, sıralanmış düzeni koruyarak 
		 * A'nın öğelerini B ile birleştirmek için bir Java programı yazın, yani A'yı ilk p en küçük öğelerle doldurun 
		 * ve B'yi kalan öğelerle doldurun.
            Örnek:
        Giriş :
        int[] A = { 1, 5, 6, 7, 8, 10 }
        int[] B = { 2, 4, 9 }
        Çıkış:
        Sıralı Diziler:
        A: [1, 2, 4, 5, 6, 7]
         B: [8, 9, 10]  */
 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen birinci dizi sayisini belirleyin...");
		int sayi1 = scan.nextInt();
		
		int [] arr1 = new int[sayi1];
		//Kullanicidan sayi2 uzunlugu kadar bir arr1 arrayi olsuturmak icin sayi istedik
		
		System.out.println("Lutfen birinci dizi sayisini belirleyin...");
		int sayi2 = scan.nextInt();
		int [] arr2 = new int[sayi2];
		// kullanicidan sayi2 uzunlugu kadr arr2 olusturmak icin sayi istedik
		int sayi =sayi1 + sayi2 ;
		// arr3 u sayi1+sayi2 uzunlugunda yaptik cunku elemanlarini arr1 ve arr2 den alacak buraya atacagiz
		int arr3[] = new int[sayi];
		
		
		for (int i = 0; i < sayi1; i++) {
			 System.out.print("Birinci Arrayin" + (i+1) + ". elemanını giriniz: ");
			 
	            arr1[i] = scan.nextInt();
		} 
	            for (int j = 0; j < sayi2; j++) {
	            	 System.out.print("Ikinci Arrayin" + (j+1) + ". elemanını giriniz: ");
	                 arr2[j] = scan.nextInt();
	            }
					for (int j2 = 0; j2 < sayi; j2++) {
						if(j2<sayi1) {
							arr3[j2]=arr1[j2];
						}else {
							arr3[j2]=arr2[j2-sayi1];
						}
						
			
		}
					
					int arrnew1[] = new int[arr1.length]	;
					int arrnew2[] = new int[arr2.length] ;
		 for (int i = arr3.length-1 ; i>arr3.length-3 ; i--) {   // Array 1 : [12, 45, 54, 78, 85]
		  arrnew2[i] =arr3[i];  // Index 7 out of bounds for length 3
		 }
			for (int j = 0; j > arr1.length; j++) {   // Array 2 : [45, 54, 63]
				arrnew1[j]=arr3[j];
			                                                //Array 3 : [12, 45, 45, 54, 54, 63, 78, 85]
		}	
					
					
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		System.out.println("Array 1 : " +Arrays.toString(arr1));
		System.out.println("Array 2 : " +Arrays.toString(arr2));
		System.out.println("Array 3 : " +Arrays.toString(arr3));
		
		System.out.println("Yeni Array 1 : " +Arrays.toString(arrnew1));
		System.out.println("Yeni Array 2 : " +Arrays.toString(arrnew2));
		
		 
	}

}
