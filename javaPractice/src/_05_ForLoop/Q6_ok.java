package _05_ForLoop;

public class Q6_ok {

	public static void main(String[] args) {
		// Aşağıdaki şekilde çıktı veren programı print içerisinde
		// sadece bir tane # kullanarak yazıdırınız

//		            #####
//		            #####
//		            #####
//		            #####
//		            #####
		
		for (int satir = 0; satir< 5; satir++) {
			
			for(int sutun=0; sutun<5; sutun++) 
				System.out.print("@");
				System.out.println();
			
		}
		

	}

}
