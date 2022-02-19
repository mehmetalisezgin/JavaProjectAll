package day02;

public class c03_SwapVariables2 {

	public static void main(String[] args) {
		// verilen sayi1 ve sayi 2 variable larin degerlerini degistiren (swap) bir program yaziniz
				// orn: sayi1 = 10 ve sayi2 = 20 kod calistikdan sonra sayi1=20 sayi2=10 olacak ancak 3.variable olmucak
		
	
	
	int sayi1 = 15;
	int sayi2 = 20;
	
	
    sayi1 = sayi1 ^ sayi2 ^ (sayi2 = sayi1);
    System.out.println("New values of x and y are "+ sayi1 + ", " + sayi2);
    
    sayi1 = sayi1-sayi2 ;
    sayi2 = sayi1+sayi2 ; 
    sayi1 = sayi2-sayi1 ;
    System.out.println("sonucta sayi1="+sayi1+ " ve sayi2= "+sayi2);
    		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
