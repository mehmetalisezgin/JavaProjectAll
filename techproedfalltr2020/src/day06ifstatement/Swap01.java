package day06ifstatement;
import java.util.Scanner ;

public class Swap01 {

	public static void main(String[] args) {
	/* avaribale nin degeri 12, b variable nin degeri 25 olsun.oyle bir kod yaziniz ki a=25, b=12 olsun
	 * 	gecici variable in ismi genellikle temp denir temporery yani
	 * 1.yol
	 */
	 Scanner scan = new Scanner(System.in);
	 System.out.println("iki sayi giriniz");
	 double a = scan.nextDouble();
	 double b = scan.nextDouble();
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);	
	 System.out.println("=========");
	 double temp = 0;
	 temp = a;
	 a = b ; //temp 12 olur gene a daki 12 gider a 25 kalir 
	 b = temp ; 
	
	 System.out.println("a : " + a);
	 System.out.println("b : " + b);	
	 System.out.println("=============");
	 System.out.println("uc sayi giriniz");	
	double x1 = scan.nextDouble();
	double x2 = scan.nextDouble();
	double x3 = scan.nextDouble();
	System.out.println("============");
	System.out.println("x1 : " + x1);
	System.out.println("x2 : " + x2);
	System.out.println("x3 : " + x3);
	System.out.println("============");
	
	 if ((x1<x2)||(x2<x3)) {
		 
	double d = 0 ;
	d = x1 ;
	x1=x3 ;
	x3=x2;
	x2 = d ;
	
	System.out.println("x1 : " + x1);
	System.out.println("x2 : " + x2);
	System.out.println("x3 : " + x3);
	System.out.println("=============");	 
		 
	 }
		
	 System.out.println("iki sayi giriniz");		
	double a1 = scan.nextDouble();
	double b2 = scan.nextDouble();
	System.out.println("a1 :" + a1);
	System.out.println("b2 :" + b2);
	System.out.println("==============");
	a1 = a1+b2;
    b2 = a1-b2;
	a1 = a1-b2 ;
	System.out.println("a1 :"  +a1);
	System.out.println("b1 : " +b2);
		
		
	scan.close();


	}

}
