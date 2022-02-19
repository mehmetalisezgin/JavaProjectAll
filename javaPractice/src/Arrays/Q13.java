package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// Kullanicidan aldigimiz 8 elemanli arrayin icinde 
    	// kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 8 sayi yaziniz");
		int sayi = 0;
		int arr[]= new int [8];
		int count=0;
		int count1=0;
		
		
        for (int i = 0; i < 8; i++) {
        	System.out.println(i+1+".sayiyi giriniz.");
        	arr[i] = scan.nextInt();	
        	if(arr[i]%3==0) {
    			count ++ ;	               // 3,6,9,1,5,8,,6,3,7
    			}
		}
        int arr1[]=new int[count];
        for (int i = 0; i < arr.length; i++) {
        	if(arr[i]%3==0) {
        		arr1[count1]=arr[i]	;
    			count1++;
    			}
		}
        System.out.println(Arrays.toString(arr1));
        
        
        
        
        //System.out.println(Arrays.toString(arr));
        System.out.println("count1 :"+count);
        System.out.println("count "+ count);
        // scanner objesi olustur 
        // bos bir int value olustur
		//1.adim 8 length uzunlugunda arr tanimla
        //2.adim for dongusu ile kullanicidan 8 sayi girmesini iste
        //scan almayi unutma 
        //olusturulan arr icindeki 3 e bolunebilen sayilara bakacagiz
        
		
		
		
		

	}

}

