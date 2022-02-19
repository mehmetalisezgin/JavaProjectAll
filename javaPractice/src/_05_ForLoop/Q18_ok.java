package _05_ForLoop;



public class Q18_ok {

	public static void main(String[] args) {
//      1 2 3 4 5 6
//      2 3 4 5 6
//       3 4 5 6
//        4 5 6
//         5 6
//          6       şeklini konsola yazdiriniz.
	
		
		 for(int satir = 1 ; satir <7 ; satir++) {
			 for (int bosluk = 1; bosluk < satir; bosluk++) {
				 System.out.print(" ");
			}
		      for (int rakam = satir; rakam <=6; rakam++) {
		    	  System.out.print(rakam+" ");	
			}
			 System.out.println();    
		 }
		
		
	}
	
     
	
	

}
