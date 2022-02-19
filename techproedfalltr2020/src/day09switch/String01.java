package day09switch;

public class String01 {

	public String01() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		String s1 = "Studyhardstayhumble";
		System.out.println(s1.charAt(0));
		//  charecteri ekrana yazdiriniz
		
		System.out.println(s1.charAt(6));
		
		//son characteri ekrana yazdiriniz 
		
		System.out.println(s1.charAt(s1.length()-1));
		
		
		if (s1.length()%2!=0) {
        System.out.println(s1.charAt((s1.length()-1)/2));
        
		}
        
		else {
			System.out.println("orta character yok");
		}
        
        //javada temelde iki tur hata vardir 
		//1) compile time error: kod yazarken alinan kirmizi alt cizgiler
		//2)run time error: yazilan code calistirildikdan sonra console da gozuken kirmizi mesajlar
		
		//java run time eror un oldugu satirdan sonraki code lari calistirmaz.
		
		// code calistirma kelimesine execution denir
		
	
		//2.method
		
		String s2 = "ogreten ogrenir";
		System.out.println(s2.concat(" tamam mi"));;  // plus yerine stringlerde kullanilir
		
		//3/ method
		String s3 = "Java ogren zengin ol";
		
		System.out.println(s3.contains("J"));
		
		System.out.println(s3.contains("X"));
		//CONTAINS METHODU TRUE FALSE BLOOEN METODU ICERIR
		System.out.println(s3.contains("ogren"));
		
        System.out.println(s3.contains(""));
        System.out.println(s3.contains(" "));
        
        System.out.println(s3.contains(" . "));
        
        //4.method
        
        String s4 = "Cok calis is bul" ;
        
       
        
        
	}
	

}
