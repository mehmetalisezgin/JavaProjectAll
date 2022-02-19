package day06ifstatement;
import java.util.Scanner ;

public class IfStatement03 {

	public static void main(String[] args) {
		
	//kullanicidan bir charecter alin bu chareter buyuk	
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Charecter giriniz : ");
		char char1= scan.next().charAt(0);
		if (char1 >= 'A' && char1 <= 'Z') {
			System.out.println("Buyuk harf");
			
		
		}

       if (char1 >= 'a' && char1<= 'z') {
    	   System.out.println("Kucuk harf");
       }
       if (!(char1 >= 'A' && char1 <= 'Z') && !(char1 >= 'a' && char1<= 'z')) {
    	   
    	        System.out.println("harf degil");
    	   
       }
       scan.close();


	}

}
