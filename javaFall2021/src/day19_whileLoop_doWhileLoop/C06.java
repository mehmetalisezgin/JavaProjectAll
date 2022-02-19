package day19_whileLoop_doWhileLoop;

public class C06 {

	public static void main(String[] args) {
		// Soru 2 )’m’ harfinden baslayarak ‘c’ harfine kadar tum harfleri

		for(char i = 'm'; i>'c'; i--) {
			System.out.print(i+ " ");
		}
		
		char krk = 'm';
		
		while (krk>'c') {
			System.out.println(krk);
			krk-- ;
		}
		char harf = 'm';
	 do {
		System.out.print(harf+" ,,");
		harf-- ;
	 }while (harf>'c');
		
	 
	}
	}


