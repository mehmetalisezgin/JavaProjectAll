package day42_AbstractClasses;

public class Ustabasi extends Isci{
	public void maas() {
		System.out.println("ustabasilari aylik 1000 lira maas alir.imza ustabasi");
	}
	public void mesayi() {
		System.out.println("ustabasi ariza durumunda ariza cozulunceye kadar calisir.imza ustabasi");
	}
// obje olusturdugumuz en alttaki class parent class lardaki methodlari
	// override edince, class dan olusturulan objeler en dogru ve en spesifik ozelliklere kavustu
// ama klasik parent-child iliskisinde tum methodlari override etme mecburiyeti yoktur
// java parent class lardaki tum methodlari override etmek mecburiyeti kazandirmak icin abstract class 
	//yapisini olusturmustur
	// yani bir class i abstract olarak tanimlarsaniz child classlar tum methodlari override 
	// etmek zorunda kalir.
	// dolayisiyla abstract yaptigimiz parent class lar sadece kalip gorevi yapacakalr.
	
	public static void main(String[]argds) {
		
		Ustabasi ust1 = new Ustabasi();
		
		ust1.statu();
		ust1.maas();
		
		
		
		
	}
	
	
	
}
