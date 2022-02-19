package plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductionOrder extends Runner{
	
	// fabrikada asagidaki urunler uretilmektedir
	static List<Object> masa = new ArrayList<>(); 
	static List<Object> koltuk = new ArrayList<>(); 
	static List<Object> caydanlik = new ArrayList<>(); 
	static List<Object> sandelye = new ArrayList<>(); 
	
	
	Scanner scan = new Scanner(System.in);
	

	static Object productionorder() {
		System.out.println("<<<<<<<Lutfen uretim siparisinizi veriniz>>>>>>>>>>>"
				+ "\n1-MASA\n2-KOLTUK\n3-CAYDANLIK\n4-SANDELYE");
		
		Scanner scan = new Scanner(System.in);
		int tercih = scan.nextInt() ;
		
		switch(tercih) {
		     
		case 1 :
			masaproduction();
			break ;
		case 2 :
			koltukproduction();
			break ;
		case 3 :
			caydanlikproduction();
			break ;
		case 4 :
			sandelyeproduction();
			break;
		default :
		}
		
		return null;
		
	}


	private static void sandelyeproduction() {
	Scanner scan = new Scanner(System.in);		
	System.out.println("Bir Adet Sandelye icin gerekli olan malzemeler"
			+ "\n1-Pamuk 10 kg\n2-Demir 2 kg");
	
	System.out.println(Material.demir);
	
	System.out.println("Kullanmak istediginiz Demir ismini giriniz");
	String demir = scan.next();
	
// Bu kisimda demir elementinin list deki yerini bulup ondan sonra gelen iki indexi masa listine eklemek istiyoruz	
	for(Object each : Material.demir) {
		if(((String) each).toLowerCase().contains(demir)) {
			int indexdemir = Material.demir.indexOf(demir) ;
			masa.add(demir) ;
		    masa.add((indexdemir+1));
		    masa.add(indexdemir+2);
		   
		}
	}System.out.println("Masa :"+ masa);
	
	
	
	
	System.out.println("Kac kg kullanmak istiyorsunuz");
	int kg = scan.nextInt();
	
		
		
		
		
	}


	private static void caydanlikproduction() {
		// TODO Auto-generated method stub
		
	}


	private static void koltukproduction() {
		// TODO Auto-generated method stub
		
	}


	private static void masaproduction() {
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
