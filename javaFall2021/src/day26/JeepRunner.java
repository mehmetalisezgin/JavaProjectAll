package day26;

public class JeepRunner {

	public static void main(String[] args) {
		// jeep classin dan bir obje olsuturalim ve ozelliklerini yazdiralim
		
		
		Jeep jeep1 = new Jeep();
		
		System.out.println(jeep1.fiyat+ " "+ jeep1.ilanno+ " " + jeep1.marka + " "+jeep1.model +" "+ jeep1.yil);
		// jeep class indaki variable lar instance variable lar olduklarindan atadigim degerler sadece benim objem icin degerleridir
		// jeep class indaki degerlere hic bir sey yapmaz
		jeep1.fiyat =15000;
		jeep1.ilanno = 1002;
		jeep1.marka = "Toyota";
		jeep1.model = "Corolla";
		jeep1.yil = 2005;
		
		
		System.out.println(jeep1.fiyat+ " "+ jeep1.ilanno+ " " + jeep1.marka + " "+jeep1.model +" "+ jeep1.yil);
		jeep1.hiz(150);
		jeep1.yakit("10 lt");
		
		
		

	}

}
