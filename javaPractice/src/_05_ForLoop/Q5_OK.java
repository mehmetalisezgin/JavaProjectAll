package _05_ForLoop;

import java.util.Scanner;

public class Q5_OK {

	public static void main(String[] args) {
		// Kullanıcıdan 5 adet sayı isteyiniz
        // Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        // bu soruyu continue kullanarak çözünüz.
       Scanner scan = new Scanner(System.in);
      int x ;
      
       int add = 0 ;
       
       for (int i = 1; i < 6; i++) {
    	   
    	System.out.println("enter number: "+i);
    	
		 x =scan.nextInt();
		
		if(x>5 && x<10) {
			System.out.println("5 ile 10 arasindaki sayilar isleme alinmamistir");
			continue;
			
		}
		add+=x ;
	}   
       
      System.out.println(add);
	}

}
