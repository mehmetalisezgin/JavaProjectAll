package _04_methods_ok;

import java.util.Scanner;

public class C01_ok {

	public static void main(String[] args) {
		/*
	     Problem Tanımı :
	        powerOfThree isminde bir method oluşturun.
	        Parametre olarak int
	        Return tipi boolean
	        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
	        Örnek 1:
	        Girdi: 27
	        Çıktı: true
	        Açıklama: 3*3*3 =27
	        Sonuç= true

	        Örnek 2:
	        Girdi: 0
	        Çıktı: false
	        Örnek 3:
	        Girdi: 9
	        Çıktı: true
	        Açıklama: 3*3 = 9
	        Sonuç= true

	        Örnek 4:
	        Girdi: 45
	        Çıktı:: false
	        Açıklama: 3*3*3*3 =81
	        Sonuç= false
	        45, 3ün üssü (kuvveti) değildir.
	     */	
		System.out.println("Please write a number");
		Scanner scan = new Scanner(System.in);
		
		
	    int x = 0 ;
	    x = scan.nextInt();
		powerOfThree(x);
		
	scan.close();	
	}

	private static boolean powerOfThree(int x) {
	boolean b = false ; 
	int carpim = 1 ;
	
	for(int i = 0; i<x/3; i++) {
	carpim*=3;
	
	if (carpim == x ){
		b=true;
		System.out.println(b);
		break;
	}	
	} return b;
		
		
	}
	
}
