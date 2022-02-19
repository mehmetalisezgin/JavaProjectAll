package day07;

import java.util.Scanner;

public class ifelseif {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in); 
		//6) Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin, sayilarin 
		  //ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse
		//“farkli isaretlerde sayilarla islem yapamazsin” yazdirin, sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir” 
		System.out.println("Please write two numbers:");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		if (x>0 && y>0) {
			System.out.println("the sum of the numbers : "+(x+y));
		}
		else if (x<0 && y<=0)	{
		System.out.println("the multiple of the numbers:"+(x*y));
		
		}
		else if ((x<0 && y>0) || (x>0 && y<0)) {
		System.out.println("not allowed to do operation with the different sign of numbers ");	
		}
		else {
			System.out.println("zero is the absorbing element for the multiple operation");
		}
		}

}
