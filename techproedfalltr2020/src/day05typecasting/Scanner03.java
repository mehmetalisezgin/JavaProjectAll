package day05typecasting;
import java.util.Scanner;



	public class Scanner03 {

		public static void main(String[] args) {
			Scanner scan = new Scanner( System.in );
			
			System.out.println("Ucgenin Dik Kenar uzunluklarini giriniz : ");
		
			float k1 = scan.nextFloat();
			float k2 = scan.nextFloat();
			
			
			float Alan = (k1 * k2)/2;
			System.out.println(Alan);

			System.out.println("Dikdortgenin kisa kenarini giriniz : ");
			
			float a1 = scan.nextFloat();
			System.out.println("Dikdortgenin uzun kenarini giriniz");
			float a2 = scan.nextFloat();
			
			float Alan1 = a1*a2 ; 
			
			
		
		    if ((a1==a2)|| (a1>a2)) {
		    	System.out.println("try again");
		    }
		    else {
			    System.out.println("area of rectangle is " + (Alan1));	
			    }

 
		   
		  
		    
		   System.out.println("Write to radius of circle "); 
		    float   r1 = scan.nextFloat();
		    float x1 = (float) 3.14 ;
		    float x2 = 3;
		    float circlearea = r1 * r1 * x1 ; 
		    System.out.println("Area of Circle is " + (circlearea));
		    
			


	}

}

		