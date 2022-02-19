package _01_IfStatements_ok;

import java.util.Scanner;

public class IsimSoyisimAyirma_OK {

	public static void main(String[] args) {
		
		// Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        // ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    	
		Scanner scan = new Scanner(System.in);
    	System.out.println("lutfen bir kelime yaziniz...");
    	String isimsoyisim = scan.nextLine();
    	
    	String ad = isimsoyisim.substring(0,isimsoyisim.indexOf(" "));
    	String soyisim = isimsoyisim.substring(isimsoyisim.indexOf(" ")+1); 
		System.out.println("isim :"+ ad);
        System.out.println("soyisim :"+soyisim);
			
		
		scan.close();	
		
		
		
		
		
		
		

	}

}
