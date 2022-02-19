package day19;

public class InstanceVar2 {
	String adres = "Ankara";
	String dogumYeri ;
	double notOrtalamasi ;
	double yasOrt = 12.3 ; 
	char cinsiyet = 'E' ;
	char karakter ;
	boolean ogrencimi = true ;
	boolean izinlimi;

	public static void main(String[] args) {
// instance variable larin main method dan direk ulasabilirmiyiz? hayir
		// nasil ulasabilirz? obje olusturarak
		
		
		InstanceVar2 ali = new InstanceVar2();
		System.out.println(ali.adres);// Ankara
		System.out.println(ali.dogumYeri); //null
		System.out.println(ali.notOrtalamasi);//0.0
		System.out.println(ali.yasOrt);//12.3
		System.out.println(ali.cinsiyet);
		System.out.println(ali.karakter);
		System.out.println(ali.ogrencimi);
		System.out.println(ali.izinlimi);
		
		
		
		
		
		
		
		
		
		
	}

}
