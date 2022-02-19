package day06ifstatement;
import java.util.Scanner;
public class IfElse03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer : ");
		
		int  a = scan.nextInt();
		System.out.println("a :" + a);
		if (a>=0) {
			System.out.println("Absolute Value of a is : " + a);
		}
		else {
			System.out.println("Absolute value of a is : " + -a);
		}
		
		
		scan.close();

		
		
		
		
		
		
	}

}
