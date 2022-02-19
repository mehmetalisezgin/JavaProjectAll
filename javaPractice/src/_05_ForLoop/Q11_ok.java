package _05_ForLoop;

import java.util.Scanner;

public class Q11_ok {
	static String harf;
	static String sesliharf = "a,e,i,o,u" ;
	static String sessizharf = "b,c,d,f,g,h,j,k,l,m,n,p,r,s,t,v,x,y,w,q" ;

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
	    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
	            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

	    Sesli harfler: a,e,i,o,u

	    Test Data:
	    a

	    Beklenen Çıktı:
	    a harfi sesli harfdir.

	    Test Data:
	    d

	    Beklenen Çıktı:
	    d harfi sesiz harftir.

	    Test Data:
	    we  yada %

	    Beklenen Çıktı:
	    Yanlis karakter girdiniz!

	     */

		System.out.println(harfkontrol(harf));
		
		
		
		
	}

	private static String harfkontrol(String harf2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Sesli Harf Giriniz");
		harf = scan.next();
		if(!sesliharf.contains(harf.toLowerCase()) && !sessizharf.contains(harf.toLowerCase()) ) {
			return "Bu bir harf degildir" ;
		}
		else if(sesliharf.contains(harf.toLowerCase())) {
			return "sesli harf" ;
			
		}else {
		 return "Sessiz harf";	
		}
		
		
		
	}

}
