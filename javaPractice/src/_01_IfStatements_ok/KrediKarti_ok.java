package _01_IfStatements_ok;

import java.util.Scanner;

public class KrediKarti_ok {

	public static void main(String[] args) {
		/*

         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Kart Bilgilerinizi Giriniz...");
		System.out.print("Isim SoyIsim :");
		String isim = scan.next();
		System.out.print("SoyIsim :");
		String soyisim = scan.next();
		System.out.print("Kart Numaraniz: ");
		String kartno = scan.next();
	
		if ((kartno.length()<16)|| (kartno.length()>16)||(kartno.contains("ABCDEFGHIJKLMNPRSTYUWZXWQ"))||
				(kartno.contains("abcdefghijklmnoprstuvyzwq")) ) {
		System.out.println("Gecersiz Kart numarasi");
			
		}else {
			
			isim= isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
            soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
            kartno="**** **** **** "+ kartno.substring(kartno.length()-4);
			
		}
		
		System.out.println(isim + " " +  soyisim + " " + kartno);
		
		
		
		
		
		scan.close();
		
		
		

	}

}
