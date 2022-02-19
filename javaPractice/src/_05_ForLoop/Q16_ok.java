package _05_ForLoop;

public class Q16_ok {

	public static void main(String[] args) {
		/*
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri
        */

		int harf = 65 ;
		
		for (int satir = 0; satir < 8; satir++) {
			
			for (int sutun = 0; sutun <= satir; sutun++) {
				System.out.print((char)(harf+satir)+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
