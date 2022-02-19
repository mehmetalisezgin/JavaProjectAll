package day06ifstatement;
import java.util.Scanner ;

public class IfStatement04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please enter a number :");
		double a1 = scan.nextDouble();
		
		if (a1>99 && a1<1000) {
			System.out.println(a1   + " is three digits number");
		}
		
        if (a1>9 && a1<100){
        	System.out.println(a1   + " is a two digits number");
        }
        
        if (a1>0 && a1<10) {
        	System.out.println(a1   +" is one digit number");
        }
        
        else {
        	System.out.println("You have mistake please try again");
        }
        
        
        scan.close();

	}

}
