package home_work;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		
		// soru-1 Kullanicidan iki tamsayi alip bu sayilarin toplam,fark ve carpimlarini yazdir 
		
				Scanner scan=new Scanner(System.in);
				System.out.println("lutfen bir tam sayi giriniz");
				int a=scan.nextInt();
				System.out.println("lutfen ikinci tam sayinizi giriniz");
				int b=scan.nextInt();
				System.out.println("sayilarin toplami: "+ (a+b));
				System.out.println("sayilarin farki: "+ (a-b));
				System.out.println("sayilarin carpimi: "+ a*b);
				
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Kullanicidan karenin bir kenar uzunlugunu alin ve karenin cevresini ve alanini hesaplayip yazdirin
				
				System.out.println("karenin bir kenar uzunlugunu yaziniz");
				float c=scan.nextFloat();
				System.out.println("kenar uzunlugu= "+ (c)+" metre");
				System.out.println("karenin cevresinin uzunlugu= "+ (4*c));
				System.out.println("karenin alaninin uzunlugu= "+ (c*c));
				System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
				
				System.out.println("dairenin yari cap uzunlugunu yaziniz");
				double r=scan.nextDouble();
				System.out.println("dairenin cevresi= "+ (2*3.14*r));
				System.out.println("dairenin alani= "+ (3.14*r*r));

	}

}
