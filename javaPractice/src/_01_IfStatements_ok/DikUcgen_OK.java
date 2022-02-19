package _01_IfStatements_ok;

import java.util.Scanner;

public class DikUcgen_OK {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a^2+b^2=c^2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen Ucgenin kenarlarini giriniz");
		System.out.print("a kenari:");
		int a = scan.nextInt();
		System.out.print("b kenari: ");
		int b = scan.nextInt();
		System.out.print("c kenari: ");
		int c = scan.nextInt();
		
		if(((c*c))==((a*a))+((b*b))) {
			System.out.println("Bu bir dik ucgendir");
		}else {
			System.out.println("Bu bir dik ucgen degildir...");
		}
    	
scan.close();

	}

}
