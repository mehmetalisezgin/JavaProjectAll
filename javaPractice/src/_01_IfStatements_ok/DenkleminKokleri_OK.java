package _01_IfStatements_ok;

import java.util.Scanner;

public class DenkleminKokleri_OK {

	public static void main(String[] args) {
		/* Günün sorusu: if statement
	      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

	        ax^2 + bx + c;

	        Çözüm adımları
	        kullanıcıdan a,b,c yi okutun.
	        Delta = bb - 4ac
	        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
	        Delta = 0 => 1 tane kök vardır x = -b/2a
	        Delta < 0 ise kök yoktur.
	   */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen denklemin katsayilarini giriniz");
		System.out.print("x^2 in katsayisi a = ");
		int a = scan.nextInt();
		System.out.print("x in katsayisi b = ");
		int b = scan.nextInt();
		System.out.print("c sabiti: ");
		int c = scan.nextInt();
	    double delta;
	    delta = (b*b)-(4*a*c);
	    double x1 = ((-1*b)+Math.sqrt(delta))/(2*a) ;
	    double x2 = ((-1*b)-Math.sqrt(delta))/(2*a);
	    double x = (-1*b)/(2*a);
	    //double realsolutionx1 = ((-1*b)+Math.sqrt(delta))/(2*a) ;
	    
	    if (delta<0) {
	    	delta = -delta; 
	    	double complexsolution1 = ((-1*b)+Math.pow(delta,0.5))/(2*a);
	    	double complexsolution2 = ((-1*b)-Math.pow(delta,0.5))/(2*a);
	    	System.out.println("there is a complex solution"+ "x1= "+complexsolution1+"i"+ ", x2= "+complexsolution2+"i");
	    }else if (delta>0) {
	    	System.out.println("The roots of the given equation: "+"x1="+ x1+ " and "+ "x2= "+ x2);	
	    }else if (delta ==0){
	    	System.out.println("there is double solution (x1,x2) = "+ x);
	    }
	    		
		
		scan.close();

	}

}
