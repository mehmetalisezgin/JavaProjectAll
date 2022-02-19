package replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class For_While2 {

	public static void main(String[] args) {
		/*Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.

		Input :

		30

		40

		Beklenen Cikti:
		Beklenen Cikti:
		30 ve 40 icin GCD = 10

		30 ve 40 icin LCM = 120*/
		
		Scanner integer = new Scanner(System.in) ;
		System.out.print("birinci tam sayi:");
		int num1 = integer.nextInt() ;
		System.out.print("ikinci tam sayi:");
		int num2 = integer.nextInt() ;
		
		
		
	    List<Integer> box1= new ArrayList<>();
	    List<Integer> box2= new ArrayList<>();
	    List<Integer> count= new ArrayList<>();
	    List<Integer> count1= new ArrayList<>();
		for (int i = 1; i <= num1; i++) {	
			if((num1%i==0) ) {
		    box1.add(i)	 ;	
			}
		}
		for (int j = 1; j <= num2; j++) {
			if(num2%j==0 ) {
			    box2.add(j)	 ;	
				}
		}
		for (int each1 : box1) {
			for (int each2: box2) {
				if(each1==each2) {
					//if(each)
				count.add(each1) ;	
				}
				
			}
		}
		System.out.println("Pozitif bolenleri sayi1: "+box1);
		System.out.println("Pozitif bolenleri sayi1: "+box2);
		count.sort(null);
		System.out.println("Ortak Bolenleri : "+count);
		int obeb = count.get(count.size()-1) ;
		int okek = (num1*num2)/obeb ;
		System.out.println("Ortak Bolenlerin En Buyugu : "+obeb);
		System.out.println("Ortak Katlarin En Kucugu :"+ okek);
		
		
	}

}
