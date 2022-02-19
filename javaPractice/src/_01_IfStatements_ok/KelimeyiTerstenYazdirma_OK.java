package _01_IfStatements_ok;

import java.util.Scanner;

public class KelimeyiTerstenYazdirma_OK {

	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
       Scanner scan = new Scanner(System.in);
       System.out.println("lutfen bir kelime giriniz.");
       String kelime = scan.next();
       
       if(kelime.length()!=4){
           System.out.print("lütfen 4 karakterli kelime giriniz");
       }else {
           System.out.print("tersten kelime : "); //tersten kelime : amuc
           System.out.println(kelime.substring(3));
           System.out.print(kelime.substring(2,3));
           System.out.print(kelime.substring(1,2));
           System.out.print(kelime.substring(0,1));

       }
       scan.close();
		
		
		
		
		
	}

}
