package day01;

import java.util.Scanner;

public class Soru01 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Bir Tam sayi Yaziniz");
	
	int sayi = scan.nextInt();
	
	System.out.println((sayi+1)*(sayi)*(sayi-1) + "("+(sayi-1)+"*"+(sayi)+"*"+(sayi+1)+")");
	
	
}	
	
	
	
	
	
	
	
	
	

}
