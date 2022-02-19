package day19;

public class LocalVariables {
	
   String okulIsmi ;
   
	public static void main(String[] args) {
	//local variable lar herhangi bir method icerisinde olusturulan variable lardir.
		// local variable sadece icinde olusturuldugu method da gecerliir
		// birden fazla method larda kullanilacxak variablarimm var ise local olsuturmak yerine class level da olusturmak gereklidir.
		// class level ds olsuturlacak variable main method da kullanilacaksa static olarak olsuturulmalidir, bu durumda
		// bu variable kullanacak diger methodlarda static olarka kullanilabilir.
		// local variable lara java default deger atamaz
		// 
		
	int sayi = 0 ; // int sayi dersek java cte veriyor
	System.out.println(sayi);
	
	// bir local de birden fazla variable olusturulamaz...// data turu farkli olsa da java buna izin vermez..
	String isim = "Veli"; 
		

	}
	public static void staticMethod() {
	//	sayi; farkli local de olsuturulan variable methodlarin static olup olmamasina bagli
		// olmaksizin local de kullanilamaz...
		
		String isim = "veli";  
		
	}
	
	
	

}
