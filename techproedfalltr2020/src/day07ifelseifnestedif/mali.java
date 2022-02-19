package day07ifelseifnestedif;
import java.util.*;
import java.util.Scanner;
public class mali {

	public mali() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir harf giriniz");

		char harf = scan.next().charAt(0);



		if (harf >= 'a' && harf <= 'z') {

			System.out.println("Kucuk harf");

		} else if (harf >= 'A' && harf <= 'Z') {

			System.out.println("Buyuk harf");

		} else {

			System.out.println("Sana harf gir dedim!");

		}

		scan.close();
			}

		}
		
		
		
		
		
		
		

		
		




		
		
		
		
		
		

	


