package _01_IfStatements_ok;

import java.util.Scanner;

public class UcgenOlabilme_OK {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
		 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
		    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
		     
		     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
			 a+b>c>a-b
			 a+c>b>a-c  
		     b+c>a>b-c  
			a=b=c ise es kenar ucgen 
			 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ucgenin kenarlarini giriniz...");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
	    if ((a==b) && (a==c))	{
			System.out.println("bu bir eskener ucgendir...");
		}
	   
	    if ((((a+b)>c) && ((c>(a-b)*(-1)))) && (((a+c)>b) && ((b>(a-c)*(-1))))&&(((b+c)>a) && ((a>(b-c)*(-1)))))  {
	    	System.out.println("bu bir ucgendir...");
	    }
		else {
			System.out.println("bu bir ucgen degildir...");
		}
	scan.close();	

	}

}
