package home_work;

import java.util.Scanner;

public class if_sorulari_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write the first letter of name of a day : ");
		char letter = scan.next().charAt(0);
		if (letter=='m' || letter=='M') {
			System.out.println("that day is : Monday");
		
		}
       if (letter == 't' || letter == 'T') {
    	   System.out.println("These days are: Tuesday and Thursday");
       }
       if (letter=='w'||letter=='W') {
    	   System.out.println("that day is wednesday");
       }
       if (letter =='f'||letter=='F') {
    	   System.out.println("that day is Friday");
       }
       if (letter=='s'||letter=='S') {
    	   System.out.println("that day is Saturday or Sunday");
       }
       
       else {
    	   System.out.println("Please write to correct letter...");
       }
       
       //Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin ve dikdortgenin kare olup olmadigini yazdirin.
       
       System.out.println("Please write to values of an edges of the given shape...");
       System.out.print("x is:");
       double x = scan.nextDouble();
       System.out.print("y is:");
       double y = scan.nextDouble();
       System.out.print("z is:");
       double z = scan.nextDouble();
       
       if ((x==y && x==z)&&(y==z && z==x)) {
    	   System.out.println("This is a square");
       }
    	if ((x==y && x!=z)||(y==z && x!=y)) {
    		System.out.println("this is a rectangle");
    	}  
       
       if (x!=y && y!=z) {
        System.out.println("this is a polygon");
       }
       
       
       
       
       scan.close();
       
       
       
       
       
       
       
       
	}
	
	

}
