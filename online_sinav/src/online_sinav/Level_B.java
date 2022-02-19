package online_sinav;

import java.util.Scanner;

public class Level_B {
static String soru1 = "1) Asagidaki access modifier lardan hangisi package icinde belirli bir degiskene erisemedigi "
		+ "anlamina gelir?" ; // a
	static String A1 = "A- Private "	;
	static String B1 = "B- Public" ;
	static String C1 = "C- Protected" ;
	static String D1 = "D- Default" ;
	
static String soru2 = "2) Interface in tum degiskenleri ne olmali?" ; // c
   static String A2 = "A- default ve final"	;
   static String B2 = "B- default ve static" ;
   static String C2 = "C- public,static ve final" ;
   static String D2 = "D- protect,static ve final" ;
   
static String soru3 = "3) Aşağıdakilerden hangisi ile metot tanımlarsın?" ;
   static String A3 = "A- metotAdi() " ;//a
   static String B3 = "B- metotAdi[]" ;
   static String C3 = "C- metotAdi{}" ;
   static String D3 = "D- (metodAdi)" ;
static String soru4 = "4) Hangisinden ornek objesi Ornek class'indan türetilmiştir?"    ;   
   static String A4 ="A- new ornek = Ornek();" ;
   static String B4 ="B- class ornek = Ornek();" ;
   static String C4 ="C- Ornek ornek = new Ornek();" ;
   static String D4 ="D- class ornek = new Ornek();" ;
static String soru5 = "5) Asagidakilerden hangisi bir Access Modifier degildir" ;
   static String A5 ="A- Public" ;
   static String B5 ="C- Private" ;
   static String C5 ="D- Protected" ;
   static String D5 ="D- Void" ;
   
//*******************************************************************************8
 static Scanner scan = new Scanner(System.in)  ;
   public static String level_B() {
	    
		String soru1 = Level_B.soru1 ;
		String A = Level_B.A1 ;
		String B = Level_B.B1 ;
		String C = Level_B.C1 ;
		String D = Level_B.D1 ;
		System.out.println(soru1);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
		char tercih =scan.next().toLowerCase().charAt(0);

		  
		   if(tercih=='d') {
		System.out.println("Dogru");
		
	    }else {
		System.out.println("Yanlis");
	    }
	System.out.println("==========================");	
		
	    String soru2 = Level_B.soru2 ;	
	    String A2 = Level_B.A1 ;
		String B2 = Level_B.B1 ;
		String C2 = Level_B.C1 ;
		String D2 = Level_B.D1 ;
		System.out.println(soru2);
		System.out.println(A2);
		System.out.println(B2);
		System.out.println(C2);
		System.out.println(D2);
		char tercih1 =scan.next().toLowerCase().charAt(0);	
		if(tercih1=='c') {
			System.out.println("Dogru");
		}else {
			System.out.println("Yanlis");
		
		}
	System.out.println("==========================");	
			
	  String soru3 = Level_B.soru3 ;	
	String A3 = Level_B.A3 ;
	String B3 = Level_B.B3 ;
	String C3 = Level_B.C3 ;
	String D3 = Level_B.D3 ;
	System.out.println(soru3);
	System.out.println(A3);
	System.out.println(B3);
	System.out.println(C3);
	System.out.println(D3);
	char tercih3 =scan.next().toLowerCase().charAt(0);	
	if(tercih3=='b') {
		System.out.println("Dogru");
	}else {
		System.out.println("Yanlis");		
	}	
			
			
	System.out.println("==========================");	

	String soru4 = Level_B.soru4 ;	
	String A4 = Level_B.A4 ;
	String B4 = Level_B.B4 ;
	String C4 = Level_B.C4 ;
	String D4 = Level_B.D4 ;
	System.out.println(soru4);
	System.out.println(A4);
	System.out.println(B4);
	System.out.println(C4);
	System.out.println(D4);
	char tercih4 =scan.next().toLowerCase().charAt(0);	
	if(tercih4=='a') {
		System.out.println("Dogru");
	}else {
		System.out.println("Yanlis");		
	}	
			
	System.out.println("=======================================");			
	String soru5 = Level_B.soru5 ;	
	String A5 = Level_B.A5 ;
	String B5 = Level_B.B5 ;
	String C5 = Level_B.C5 ;
	String D5 = Level_B.D5 ;
	System.out.println(soru5);
	System.out.println(A5);
	System.out.println(B5);
	System.out.println(C5);
	System.out.println(D5);
	char tercih5 =scan.next().toLowerCase().charAt(0);	
	if(tercih5=='d') {
		System.out.println("Dogru");
	}else {
		System.out.println("Yanlis");		
	}		
		
	System.out.println("Sinava Devam etmek istiyorsaniz 1 e yoksa 2 ye tiklayiniz");
	int devam = scan.nextInt();
	if (devam==1) {
		return Menu.menu();
	}if (devam==2) {
	//eklemek istedigi baksa bir kitap yok ise kullaniciyi Kitapci class indaki menu methoduna yonlendirdik
	System.out.println("Basarilar");
	}	
		
		//return null;


		
		
		
				
		
		return null;	
		
		}  

   

}
