package _05_ForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q12_ok {
	static int num ;
	static int add ;
	static List<Integer >countlist = new ArrayList<>() ;
	static List<Integer >countlist1 = new ArrayList<>() ;
    /*
    Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
    Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
    ORNEK:
    INPUT     : 6
    OUTPUT : 1,2,3
                  1+2+3 = 6 = 6 (Mükemmel)

                  mukemmel sayi kontrolu
                  1. kullanicidan sayi alalim
                  2. bir toplam degiskeni olusturuyoruz
                  3. sayinin bolenleri bul
                  4. bolenleri toplamla topla
                  5. sayiyla toplamin esitligini kontrol et

    */
	public static void main(String[] args) {
        
        perfectnumber(num);

	

    }
	public static void perfectnumber(int num) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please write a number");
		num = scan.nextInt();
		
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				countlist.add(i);
			}
			}
			for (int each : countlist) {
				add+=each ;
			
			}
			System.out.println(countlist+" = "+add);
			if(num == add) {
			System.out.println(add+" = "+num+" so it is a Perfect number");
				
	}else {
		System.out.println(add+ " ≠ "+num+" so it is not a Perfect number");
	}
		
				
		
		
		
	
	}	
}
