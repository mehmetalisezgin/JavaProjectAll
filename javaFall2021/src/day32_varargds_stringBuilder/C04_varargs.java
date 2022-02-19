package day32_varargds_stringBuilder;

public class C04_varargs {

	public static void main(String[] args) {
kafanagoreislem(5,10,13,0); 
		// varargs da hic eleman olmasa da java itiraz etmez 
        // once int olarak tanimlanan sayilari eslestirir
        // kalan tum sayilari varargs doldurur
		
	}

	private static void kafanagoreislem(int add1,int add2,int add3,int add4, int... add) {
		int toplam = 0;
		
		for(int each:add) {
			toplam+=each ;
		}
		
		System.out.println(add2*toplam);


	}

}
