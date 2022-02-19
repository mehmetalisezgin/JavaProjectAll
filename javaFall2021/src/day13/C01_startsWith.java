package day13;

import java.util.Scanner;

public class C01_startsWith {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir kelime alin 
		//verilen cumlenin (char squence ) ile baslayip baslamadigini ve bitip bitmedigini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle yaziniz...");// cumle oldugu icin println
		String cumle = scan.nextLine();
		System.out.print("lutfen bir kelime yaziniz");// tek kelime oldugu icin print kullanildi sadece
		String  kelime = scan.next(); // ke;ime oldugu icin ln kullanilmadi
		
		if (cumle.startsWith(kelime)) {
			System.out.println("grilen cumle "+kelime+ " ile basliyor...");
			
		}else {
			System.out.println("girilen cumle "+kelime+" ile baslamiyor...");
		}
		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen cumle "+ kelime+ " ile bitiyor...");
		}else {
			System.out.println("girilen cumle "+ kelime + " ile bitmiyor");
		}
		
		scan.close();
	}

}
