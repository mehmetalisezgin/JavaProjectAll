package day20;

import java.util.Arrays;

public class C03 {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
				// cumlesinin kelimelerini, ozel karakterler ve noktalama isaretleri olmadan
				// harf sirasina gore yazdiralim
		
		String cumle = "Java ogrendim,  #cok para ?kazandim.," ;
		
		String kelimeler[] = cumle.split(" ") ;
		
		System.out.println(Arrays.toString(kelimeler));
		// istenmeyen karekterin tamamini replace all ile degistiririz
		for(int i = 0 ; i<kelimeler.length ; i++) {
			kelimeler[i]=kelimeler[i].replaceAll("\\W", ""); // butun keliem olmayanlari  tek bir bosluk ile degistir
			System.out.println(kelimeler[i]);
		}
		System.out.println(Arrays.toString(kelimeler));
		
		Arrays.sort(kelimeler);
		
		System.out.println(Arrays.toString(kelimeler)); // buyuk harf oldugu icin Java basa aldi[, Java, cok, kazandim, ogrendim, para]
		Arrays.sort(kelimeler);
	    for (int i= 0 ; i<kelimeler.length ; i++) {
		 System.out.print(kelimeler[i]+" ");
		 
		 
			 
	 }
		
		
		
		
		
		
		
	}

}
