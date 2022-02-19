package day28;

public class C03 {

	
	public static void main(String[] args) {
C02 obje1 = new C02() ; 
		
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ obje1.y);
		
		obje1.x++ ;
		obje1.y++ ;
		
		System.out.println("obje1 icin x :"+ obje1.x + ", obje1 icin y :"+ obje1.y);
		
		C02 obje2 = new C02() ; 
		System.out.println("obje2 icin x :"+ obje2.x + ", obje2 icin y :"+ obje2.y);
		
		obje2.x++ ; 
		C02.y++;
		
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
		
		// java runtime bir programdir run iconuna bastigimiz da java calismaya baslar ve islemleri yapar.
		// javanin isi bittiginde (calisma tusu kirmizidan griye dondugunde)
		// hersey basa doner...
		
		
		// static variable ve method lar bulunduklari class ile ilintilidir(pbje ile degil class ile)
		// baska bir class da iken C02.staticMethodIsmi() yazmamiz yeterli olur.
		
		//static bir variable a class ismi uzerinden ulasmak yerine
		// instance variable lar gibi obje ile ulasmaya calisirsaniz
		// CTE vermez ama solda ! isareti ile bizi uyarir...
		
        // instance variable lar icin her objeye o instance icin deger atamak gerekiyor ama static variable i bir kez olusturup
	//	her yerde kullanilabilir
	}

}
