package _04_methods_ok;

import java.util.Scanner;

public class C03_ok {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
        // Bu methodu main methodun disinda olusturup main methodun
        // icinden cagiriniz.
	
       System.out.println("Please write hours to convert seconds");
       Scanner scan = new Scanner(System.in);
       double hour = scan.nextDouble();
       
       System.out.println("Please write miles to convert km");
       double mile = scan.nextDouble();
	   
       System.out.println("Please write kg to convert gr");
       double kg = scan.nextDouble();
       
       convert(hour,mile,kg);
	scan.close();	
	}

	private static void convert(double hour, double mile, double kg) {
	double sec;
	sec = hour*60*60 ;	
	System.out.println(hour+" hour = "+sec+" second");
	double km ;
	km = mile*(1.6);
	System.out.println(mile+" mile = "+km+" kilometer");
	double gr ;
	gr = kg*1000 ;
	System.out.println(kg+" kg = "+gr+" gram");	
	}

}
