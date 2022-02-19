package _05_ForLoop;

public class Q10_ok {

	public static void main(String[] args) {
		// 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
		int count = 0 ;
		for (int i = 0; i < 11; i++) {
			count=1*i ;
			 
			System.out.println("1 x "+i+"= "+count);	
		}
     
	}

}
