package plant;

import java.util.Objects;
import java.util.Scanner;

public class Runner {
	
	static Scanner scan = new Scanner(System.in) ;
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
		
		runner();
		
		
	}
	
	
	
		
		
		
        protected static Objects runner() {
        	System.out.println("Asagidaki islemlerden birini seciniz"
    				+ "\n1-Material Ekleme\n2-Production Order\n3-Sales Order\n4-Material goruntule\n5-Cikis");
        	
        	
        	int tercih = scan.nextInt() ;
            
            switch(tercih) {
                   
                  case 1 :
                	  Material.materialekleme();
                	  break;
                  case 2 :
                	  ProductionOrder.productionorder();
                	  break;
                  case 3 :
    	  
    	              break;
                  case 4 :
                	  Goruntule.goruntule();
    	              break;
            }
			return null;
        	
        	
        	
        	
		
	




		
	              
	              
	              
        }
		
		
		
		
	

}
