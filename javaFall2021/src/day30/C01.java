package day30;

import java.util.ArrayList;
import java.util.List;

public class C01 {

	public static void main(String[] args) {
		// string immutable bir class iken list mutable dir
		String str = "Ali" ;
		
		str.toUpperCase() ; // suan da ALI havada kaldi atanmis bir variable yok
		
		System.out.println(str); // orjinal olani yani Ali yi yazdirir
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str);
		
		List<String> isimler = new ArrayList<>();
		
		System.out.println(isimler);
		
		isimler.add("Ali");
		System.out.println(isimler);
		isimler.set(0, "Veli") ;
		System.out.println(isimler);
		isimler.remove(0);
		System.out.println(isimler);
		
		
		
	}

}
