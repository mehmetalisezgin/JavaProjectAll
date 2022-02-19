package day25;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class C04_ArrayList {

	public static void main(String[] args) {
		
		// verilen arra i arrays class indan yardim alarak liste ye cevirebiliriz
		String arr[] = {"A", "b","C", "d"};
		
		List<String> arraydenlist = Arrays.asList(arr);
		
		System.out.println(arraydenlist);
		
		//arraydenlist.add("F"); // CTE vermesi icin yazimda syntex hatasi yok. RTE desteklenmeyen isle hatasi verdi
		
		// bu sekilde array class indan yardim alarak array i liste cevirrirsek olusturdugumuz listin boyutu sabit olur.
		// dolayisiyla add() veya clear() gibi methodlari salistirmak istesek hata verir
		
		arr[1] = "Z";
		System.out.println("Array i degistirdikten sonra, array = "+ Arrays.toString(arr));
		System.out.println("Array i degistirdikten sonra, array = "+ arraydenlist);
		
		arraydenlist.set(3, "D");
		System.out.println("Array i degistirdikten sonra, array = "+ arraydenlist);
		System.out.println("Array i degistirdikten sonra, array = "+ Arrays.toString(arr));

	}

}
