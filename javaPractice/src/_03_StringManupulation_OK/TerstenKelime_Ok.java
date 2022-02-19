package _03_StringManupulation_OK;

import java.util.Scanner;

public class TerstenKelime_Ok {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a word: ");
		String str = scan.next();
	
		
		if(str.length()!=4){
            System.out.print("lütfen 4 karakterli kelime giriniz");
        }else {
            System.out.print("tersten kelime : "); 
            System.out.print(str.substring(3));
            System.out.print(str.substring(2,3));
            System.out.print(str.substring(1,2));
            System.out.print(str.substring(0,1));

        }
        scan.close();
		
		
        
        
	}

}
