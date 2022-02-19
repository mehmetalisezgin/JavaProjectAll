package day10_ternary;

import java.util.Scanner;

public class c02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		int sayi = scan.nextInt();
		System.out.println((sayi%2==0) ? "cift sayi" : "tek sayi");

		System.out.println("Lutfen bir sayi daha giriniz");
		
		double number = scan.nextDouble();
		double mutlakdeger = number>=0 ? sayi : (-1)*number ;
		System.out.println(mutlakdeger);
		
		System.out.println("nolur bir sayi daha gir");
		
		double x = scan.nextDouble();
	    System.out.println(x>0 ? "pozitif" : "negatif"); 
		
	 // Eğer çalışan kadınsa 60 yaşından büyük olduğunda emekli olabilir,
	 		// Çalışan erkekse 65 yaşından büyükse emekli olabilir.
		
		
	}

}
