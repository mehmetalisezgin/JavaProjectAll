package day26;

import day15.H01_MethodCreation;

public class CarRunner {

	public static void main(String[] args) {
		// Car class indna bir obje olusturalim 
		
		Car               car1        =     new                Car(); // Car class i icin obje1 objesini olusturduk
	// class ismi	    //objeismi         //keyword         // constructor  kullanilacak concstructor
		System.out.println(car1.km+ " "+ car1.model + " "+car1.renk+ " "+car1.yil);
        
		// Bir obje olsutururken kendi class indan belirlenen degerleri 
		// kullanmak isitoryorsan hic bir degeri  kendim atamadan obje olusturabilirim
		// bu durumda hic bir parametre kullanilmadigi icin default constructor yeterli olacaktir
		
		// eger obje olsuturdugum class daki degerleri kullanmak yerine kendi degerlerimle bir obje
		// olusturmak istersem o zaman parametreli constructor olsuturmam gerekir.
		
		// Car car2 = new Car("Kirmizi","Corolla"); bu hata verdi cunku Car class inda iki string parametresi olan bir constructor 
		//olmadiig icin hata verir
		
		
		/*H01_MethodCreation obje = new H01_MethodCreation();
		obje.rakamlarToplami(234);*/
		
		
		
	}

}
