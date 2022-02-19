package day06;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class if_conditions {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Notunuz:");
		int not = scan.nextInt();
		if (not>=0 && not<=44) {
		System.out.println("Notunuz:CC");
		}
		if (not>=45 && not<=59) {
		System.out.println("Notunuz:DC");
	}
		if (not>=60 && not<=75) {
		System.out.println("Notunuz:BB");	
		}   
		if (not>=76&& not<=100) {
		System.out.println("Notunuz:AA");
		}
		   
		else {
		System.out.println("LUTFEN 0 ILE 100 ARASINDA BIR NOT GIRINIZ...");	
		}   
		System.out.print("Lutfen Haftanin gunlerinden ilk harfi yaziniz:");
		char ilkharf = scan.next().toUpperCase().charAt(0);
		if  (ilkharf=='P') {
			System.out.println("pazar,pazartesi,persembe");
			
		}
		if (ilkharf=='S') { 
		   System.out.println("Sali");
		
		}
		if (ilkharf=='C') {
			System.out.println("Carsamba,cuma,cumartesi");
		}
         


		   
	}

}
