package day10_ternary;

public class c07 {

	public static void main(String[] args) {
		//Girilen sayi 10 ise “Iki basamakli en kucuk sayi 100 ise “uc basamakli en kucuk sayi” 1000 ise “dort basamakli en kucuk sayi” diger
		//durumlarda “Girdigin sayiyi degistir” yazdirin
       int number = 10;
       
       switch(number) {
       case 10 : 
    	   System.out.println("2 basamakli en kucuk sayi");
    	   break;
       case 100 : 
    	   System.out.println("3 basamakli en kucuk sayi");
    	   break;
       case 1000 : 
    	   System.out.println("4 basamakli en kucuk sayi");
    	   break;
    	   default:
    		   System.out.println("gecerli sayi girin");
       }
		
		
		
		
		
		
		
		
	}

}
