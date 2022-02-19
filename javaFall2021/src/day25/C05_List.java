package day25;

import java.util.ArrayList;
import java.util.List;

public class C05_List {

	public static void main(String[] args) {
		// verilen bir listede icinde belirli bir harf olan elemanlari silen bir program yaziniz

		List<String> str = new ArrayList<>();
		str.add("Ceyhun") ;
		str.add("Yildiz") ;
		str.add("Mustafa") ;
		str.add("Tugba ") ;
		str.add("Turgut") ;
		str.add("Maraba") ;
		System.out.println(str);
		
		String silinecekharf = "a" ; 
		
		killthemall(str,silinecekharf); // hem str ye hemde silinecek harfe gitmeli 
		
		
		
		// remove da iki tane var ya kelimeyi yada string i yaziyoruz ayni isimden ikitane varsa sikinti olabilir
		// bu sebepten index kullanmak daha mantikli
		
	

	
	}

	private static   List<String> killthemall(List<String> str, String silinecekharf) {
		for (int i = 0; i < str.size(); i++) {
			
			if (str.get(i).contains(silinecekharf)) {
				str.remove(i);
				i--;
			}
			
		}
	
		
		System.out.println(str);
		return null;
	}

}
