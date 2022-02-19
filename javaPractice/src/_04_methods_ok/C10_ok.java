package _04_methods_ok;

import java.util.Scanner;

public class C10_ok {

	public static void main(String[] args) {
		/*
	    Problem Tanımı:
	    addDigits isminde bir method oluşturun.
	    Parametresi int
	    Return tipi de int
	    Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
	    Tek basamaklı çıktığında, döndürün

	    Örnek1:
	    Girdi 38
	    Çıktı: 2
	    Açıklama: İşlemler şöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
	                 2 , tek basamaklı olduğundan, bunu döndürün.
	    */
		System.out.println("Please write your number");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		addDigits(number);
		
		
		System.out.println(addDigits(number));
		
		
		
		scan.close();
		
	}

	public static int addDigits(int number) {
	int count = 0;
		
	for (int i = 0; i < number; i++) {
		
	    number= (number%10)+(number/10);
		count++;
	}	
		
		
		
		
		return number;
		
		
		
		
	}

}
