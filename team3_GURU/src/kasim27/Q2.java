package kasim27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		/*Soru 2) Kullanıcıdan 20 tamsayı girişi alın ve şunu yazdırın:
			pozitif sayıların
			sayısı negatif sayıların
			sayısı tek sayıların
			sayısı çift sayıların sayısı
			0'ların sayısı.
	*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac tamsayi gireceginizi belirleyin...");
		
	    int listin = scan.nextInt();
	    
		//int listin = scan.nextInt();
	   // listin.add(scan.nextInt());
	    int arr[] = new int [listin];
	    
	    //List<Integer> list = new ArrayList<>(listin);
	    
	    
	    
	    int pozitif = 0 ;
	    int negatif=0;
	    int tek =0 ;
	    int cift =0 ;
	    int sifir =0 ;
	    
	   
	     //  {1,3,5,7,98,0,0,6}
	    
	    for(int i=0 ; i<arr.length ; i++) {
	    
	    System.out.println((i+1)+".sayiyi giriniz.");
	    arr[i]=scan.nextInt();
	        
	    	if(arr[i]>0 ) {
	    		
	    	    pozitif++ ;
	    	    
	    	}if(arr[i]<0) {
	    		
	    		negatif ++ ;
	    	}if (arr[i]%2!=0) {
	    		
	    		tek ++;
	    	}if (arr[i]%2==0 && arr[i]!=0) {
	    		
	    		cift ++;
	    	}if((arr[i]==0)||(arr[i]%10==0)) {   // arr[i]/10 yapip son rakami 0 olnalari da saydik
	    		                                 // bu soruda 99 a kadar olan rakamlar baz alindi
	    		
	    		sifir ++ ;
	    	}
	    	
	    }
	    System.out.println("Pozitif sayilar" + pozitif);
	    System.out.println("negatif sayilar: " +negatif);
	    System.out.println("tek sayilar:" +tek);
	    System.out.println("cift sayilar : "+cift);
	    System.out.println("sifir olanlar :" +sifir);
	}

}
