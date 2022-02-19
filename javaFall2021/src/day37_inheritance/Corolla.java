package day37_inheritance;

public class Corolla extends Toyota{
	String renk ;
	int fiyat ;
	boolean elektrklimi;
	int tekersayisi=4;
	String uretimyeri = "Turkiye ";
	

	public static void main(String[] args) {
		Corolla                   arb1     =         new          Corolla();
	// class ismi && data type   obje    assgment   keyword       constructor
		
		Toyota arb2 = new Corolla();
		
		Araba arb3 = new Corolla();
		
		// data turu java acisindan Corolla
		
		// java da obje olsuturdugumuz her class ismi ayni zamanda bir data turudur
		// bu ornegimiz icin corolla hem class adi hemde olusturdugumuz arb1 objesinin data type dir
System.out.println(arb1.calisiyormu);		
System.out.println(arb1.tekersayisi);
System.out.println(arb1.uretimyeri);

System.out.println(arb2.calisiyormu);
System.out.println(arb2.tekersayisi);




	}

}
