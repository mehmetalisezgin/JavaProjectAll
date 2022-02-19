package _01_IfStatements_ok;

import java.util.Scanner;

public class Koordinat_OK {

	public static void main(String[] args) {
	//// Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
    	
	    	Scanner scan  = new Scanner(System.in);
	    	System.out.println("Lutfen koordinat (x,y) noktalarini giriniz...");
	    	double x = scan.nextDouble();
	    	double y = scan.nextDouble();
	        if (x>0 && y>0) {
	        	System.out.println("Birinci bolge "+"("+x+","+y+")");
	        }else if (x<0 && y>0) {
	        	System.out.println("Ikinci bolge"+"("+x+","+y+")");
	        }else if (x<0 && y<0) {
	        	System.out.println("Ucuncu bolge"+"("+x+","+y+")");
	        }else if (x>0 && y<0) {
	        	System.out.println("Dorduncu bolge"+"("+x+","+y+")");
	        }else if (x==0 && y==0) {
	        	System.out.println("Orjinde...");
	        }
	        
	    	scan.close();
	}

}
