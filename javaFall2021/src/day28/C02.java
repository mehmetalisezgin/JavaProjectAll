package day28;

import java.util.Iterator;

public class C02 {
   int x = 5 ; 
   static int y= 10;
  
   
	
	
	
	
	

	public static void main(String[] args) {
		
		C02 obje1 = new C02() ; 
		
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ obje1.y);
		
		obje1.x++ ;
		obje1.y++ ;
		// static variable lara obje1.y dememize gerek yok direk y denilebilir
		
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ y);
		
		C02 obje2 = new C02() ; 
		System.out.println("obje2 icin x :"+ obje2.x + ", obje2 icin y :"+ obje2.y);
		
		obje2.x++ ; 
		obje2.y++;
		
		System.out.println("obje2 icin x :"+ obje2.x + ", obje2 icin y :"+ obje2.y);
		System.out.println("obje2 olsuturulduktan sonra ve islemden sonra obje1 in degerleri");
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ obje1.y);
		
		
		C02 obje3 = new C02() ;
		
		obje3.x = 20;
		obje3.y = 40;
		System.out.println("obje3 olsuturulduktan sonra ve islemden sonra obje lerin degerleri");
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ obje1.y);
		System.out.println("obje2 icin x :"+ obje2.x + ", obje2 icin y :"+ obje2.y);
		System.out.println("obje3 icin x :"+ obje3.x + ", obje3 icin y :"+ obje3.y);
		
		
	}

}
