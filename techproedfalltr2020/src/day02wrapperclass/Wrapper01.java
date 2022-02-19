package day02wrapperclass;

public class Wrapper01 {
	public static void main(String[] args) {
		
	//byte,short ve int in max ve min degerlerini code ile bulunuz.
		
	// once byte aribale olusturulur
		byte maxByte = Byte.MAX_VALUE ;
		System.out.println(maxByte);
		byte minByte = Byte.MIN_VALUE;
		System.out.println(minByte);
		short maxShort = Short.MAX_VALUE;
		short minShort = Short.MIN_VALUE;
		System.out.print("max" + "="+maxShort  );
		System.out.println(  "   min" + "="+minShort);
		
		String name = "Ali Can";
		name.toUpperCase();
		System.out.println(name.toUpperCase());
		//variable isimlendirmenin kurallari vardir
		int harf = 'b';
		System.out.println(harf);
	}
	
	
	
	
	
	
	

}

