package kasim27;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		/*Soru 1) Bir dizi sayı "Boom!"alan ve dizide 7 rakamı görünüyorsa dönen bir işlev oluşturun . Aksi takdirde iade edin 
		 * "there is no 7 in the array".
		Örnekler
		sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
		 7 contains the number seven.

		sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
		 None of the items contain 7 within them.

		sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
		 97 contains the number seven.*/

       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen Girmek istediginiz sayi dizisini belirleyin: ");
	   
       int num = scan.nextInt();
       
	   int arr[]= new int[num];
	                                                                   
	   int yediolanlar = 0;
	   int yediolmayanlar = 0;        //Not: 99 a kadar olan sayilar icin dusunduk. 
	   
	   for (int i = 0; i < arr.length; i++) {
		   
		   System.out.println(i+1+".sayiyi giriniz.");
		   arr[i]=scan.nextInt();
		   
		   int a= arr[i]/10 ; // 70 li sayilari 10 a bolup bir a variable inia assign ettik tek basamak kalmasi icin 
		   
		       if((arr[i]==7)||(arr[i]%10==7)|| a==7 ) {
		    	   yediolanlar++;
		    	    
		   }else if(arr[i]!=7 || (arr[i]%10!=7)) {
			   
			   yediolmayanlar++;
		   }  
		       
		       
	}
	   System.out.println(Arrays.toString(arr));
	   System.out.println("BOOM! the number of 7 contains in the array: "+ yediolanlar);
	   System.out.println("The number of no contains 7 in the array :  "+yediolmayanlar);
		
	}

}
