package FirstWeek;

import java.util.Scanner;

public class Q1_OK {

	public static void main(String[] args) {
   //  Soru 1) Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız. 
   //  (Java Practice-IfStatement_TernaryOperator-Q06)
    
		Scanner scan = new Scanner(System.in); 
		System.out.println("Note: (x,y) koordinat duzlemi icinde iki noktadir/sayidir");
		System.out.print("Lutfen x noktasini giriniz: ");
		double x = scan.nextDouble();
		System.out.println("Lutfen y noktasini giriniz: ");
		double y = scan.nextDouble();
		
		// saatin tersi yonunde: Note: birincibolge (+,+), ikincibolge (-,+), ucuncubolge (-,-), dorduncubolge (+,-)
		
		if (x>0 && y>0) {
			System.out.println("Girilen noktalar birinci bolgededir...");
		}else if (x<0 && y>0){
			System.out.println("Girilen noktalar ikinci bolgededir...");
		}else if (x<0 && y<0){
			System.out.println("Girilen noktalar ucuncu bolgededir...");
		}else if (x>0 && y<0){
			System.out.println("Girilen noktalar dorduncu bolgededir...");
		}else if(x==0 && y==0) {
			System.out.println("Girilen noktalar orjindedir/merkezdedir...");
		}
		scan.close();
	}

}
