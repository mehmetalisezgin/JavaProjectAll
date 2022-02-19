package day30;

public class C03 {

	public static void main(String[] args) {
		String str1 = "Mustafa" ;
		String str2 = "Mustafa" ;
		String str3 = new String("Mustafa") ;
		String str4 = new String("Mustafa");
		
		System.out.println(str1==str3); //false
		System.out.println(str1.equals(str3)); // true
		
		System.out.println(str4==str3); //false
		System.out.println(str4.equals(str3)); //true
		
		System.out.println(str1==str2); // true
		
		
		// javada string iki turlu olusturulabilir
		// 1- non-primitive oldugu icin new keyword ile
		// java esitligin sagina baktiginda new kelimesi oldugu iicn once obje olusturur
		// sonra degeri atar.
		// yani bu olusturma seklinde herzaman 
		// yeni bir obje olusur.
		// 2- bugune kadar ogrendigimiz gibi olusturursak
		//   String str2 = "Mustafa" 
		// java bu durumda esitligin saginda olan String in STRING HAVUZU nda olup olmadigini kontrol eder
		// ve havuzda varsa yeni obje olusturmaz, oncekinin referansina yeninin refaransini da ekler.
		
		
		

	}

}
