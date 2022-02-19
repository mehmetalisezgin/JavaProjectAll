package day06ifstatement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IfStatements05 {
	static Scanner D = new Scanner(System.in);
	static int a,b,c ;
	static double sqB,bac,sqrt,num,den,num1,root,root2,sqrt1 ;

	public static void main(String[] args) {
	System.out.println("Please enter the coefficient of a,b,c");	
	
	try { System.out.println("Please enter the coefficient 'a' of the quadratic equation ");
	a = D.nextInt();
	
	System.out.println("Please enter the coefficient 'b' of the quadratic equation ");
	b = D.nextInt();
	 
	System.out.println("Please enter the coefficient 'c' of the quadratic equation ");
	c = D.nextInt();
	
	int ac= 4*a*c; sqB = Math.pow (b, 2);
	bac = sqB - ac; sqrt = Math.sqrt(bac);
	den= 2*a;
	if (a==0){

	System.out.println("sorry,this is not quadratic equation ");
	}
	else if(sqB > ac)
	{
	num = -b+sqrt; num1 = -b-sqrt;
	root = num/den; root2 = num1/den;
	System.out.println ("The quadratic equation is "+a+"x^2 + "+b+"x + " + c + " = 0");
	System.out.println("the roots of the quadratic equation are "+ root + " and " + root2);
	}
	else if (sqB < ac)
	{
	double rt1 = - (b/den);
	double bec = -(bac);
	sqrt1 = Math.sqrt(bec);
	double frt1 = sqrt1/den;
	System.out.println ("The quadratic equation is "+a+"x^2 + "+b+"x + " + c + " = 0");
	System.out.println("the roots of the quadratic equation are "+ rt1+" - "+frt1+"i" + " and " + rt1+" + "+frt1+"i");
	System.out.println(bec);

	}
	} catch (InputMismatchException error)
	{
	System.out.println (error);
	System.out.println("Restart and enter number,not alphabet\nTHANK YOU");
	
	}
	
	
	
	
	
	
	}

}
