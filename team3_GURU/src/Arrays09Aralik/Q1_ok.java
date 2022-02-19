package Arrays09Aralik;

import java.util.Arrays;
import java.util.Scanner;

public class Q1_ok {

	public static void main(String[] args) {
		/*
		 * 1)Write a method which accepts a String as parameter
            and prints the sum of the digits, present in the given string.(Kubra Hanim)
            input : ade1r4d3
            output : 8
            Hint :
            Use Character.isDigit()
            Integer.valueOf()

		 */
        System.out.println("Please write your text...");
        Scanner scan = new Scanner(System.in);
		String input = scan.nextLine() ;
		
		//Character.isDigit() boolean deger dondurrus false yada true
		int sum = 0;
		for (int i = 0; i <input.length(); i++) {
			
			if (Character.isDigit(input.charAt(i))) {
			
			
			String box = input.substring(i,i+1);// i+1 bir sonraki stebe gecmesi icin 
			sum+=Integer.parseInt(box);
			}
			
		}
		
		    System.out.println(sum);
		
		
		
	}

}
