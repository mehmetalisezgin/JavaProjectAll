package day09switch;

import java.util.Scanner;

public class Hafiz {
	


	public Hafiz() {
		
	}

	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the price of the(from 25 cents to a dollar, in 5-cent increments): ");
	     int amount = input.nextInt();
	     if (amount<0) {
			 System.out.println("error! amount can not be negative...");
		 }
	     else {
		 int exchange = 100-amount;
		 
		 System.out.println("Amout in Return:"+exchange+"cents");
		 
		 int quarters = exchange/25;
		 exchange=exchange%25;
		 
		 int dimes = exchange/10;
		 exchange=exchange%10;
		 
		 int nickels = exchange/5;
		 exchange=exchange%5;
		 
		 int pennies = exchange;
		 
			 System.out.println("Quarters:"+quarters+" Dimes:"+dimes+" Nickels:"+nickels+" Pennies:"+pennies); 
		 
	     }
	}
}
				 
			 
		
	
		
		
		
	


