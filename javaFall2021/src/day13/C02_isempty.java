package day13;

public class C02_isempty {

	public static void main(String[] args) {
		//String olarak verilen 10000 sayisinin
		//binden buyuk olup olmadigini yazdirin
		
		String sonuc = "10.000";
		sonuc = sonuc.replace(".","");// nokta olmasa da hata vermez bulursa degistirir bulmassa birsey yapmaz...
		//System.out.println(sonuc);
		
		if (Integer.valueOf(sonuc)>1000) { // sonuc bir string oldugu icin wrapper class kullanarak sonuc u intere a cevirdik
			System.out.println("bulunan sonuc sayisi 1000 den cok");
		}
      
		
		
      }
	
	}


