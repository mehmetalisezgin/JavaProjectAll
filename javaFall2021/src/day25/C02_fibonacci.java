package day25;

import java.util.ArrayList;
import java.util.List;

public class C02_fibonacci {

	public static void main(String[] args) {
		int sinir = 15;
		List<Integer> fibonacci = new ArrayList<>();
        
		fibonacci.add(1);
		fibonacci.add(1);
		int sayi = 0;
		 
		while (sayi<sinir) { //sayi sinir sayisindan kucuk olmali kucuk ise dedik devam ettik
			
			sayi = fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			fibonacci.add(sayi);
			
		
		}
		System.out.println(fibonacci);
		fibonacci.remove(fibonacci.size()-1);
		System.out.println(fibonacci);
	}

}
