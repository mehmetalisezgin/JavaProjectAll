package day15;

import java.util.Scanner;

public class C01_methodcreation {

	public static void main(String[] args) {
		// kullanicidan ismini ve soy ismini isteyin, iki farkli method olusturun methodlarin biri girilen kelimeleri
		// ilk harf buyuk, diyerleri kucuk olacak sekilde birlestirsin
		// ikinci method isim ve soyisimin ilk harfleri buyuk harf kalan harfleri * olacak sekilde birlestirilsin

		
		//kullaniciya  isminin acik olaerak yazilmasi veya gizlenmesi tercihi sorun 
		//ve programin kalan kismini isim soyismi kullanicinin istedigi sekilde kullanin...
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isim ve soy isminizi girin \nisimden sponra enter a basin");
		
		String isim = scan.next();
		String soyisim = scan.next();
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1"
				+ "\nilk harf haric gizli yazilmasini istiyorsaniz 2 e basin");
		int tercih=scan.nextInt();
		
		String birlesmisIsim = null; // Emrah Saglam, E****S****
		//acikisim(isim,soyisim);
		
		//isimgizle(isim,soyisim);
		
		if (tercih==1) {
			birlesmisIsim = acikisim(isim,soyisim);
		}else if (tercih==2) {
			birlesmisIsim = isimgizle(isim,soyisim);
			
		}else {
			System.out.println("lutfen 1 veya 2 secin...");
		}
		System.out.println("kullanicinin tercihi :"+birlesmisIsim);
	}

	private static String isimgizle(String isim, String soyisim) {
		isim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w","*"); // \\w word demek oluyor
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w","*");
		return isim+" "+soyisim;
		
		// TODO Auto-generated method stub
		
	}

	public static String acikisim(String isim, String soyisim) {
		isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
		soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
		
		return isim +" "+soyisim ; // void i silip string yapacagiz cunku bize string dondurecek
		// TODO Auto-generated method stub
		
	}

}
