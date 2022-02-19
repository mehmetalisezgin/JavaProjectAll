package day16;

import java.util.Scanner;

public class C08_selfstudy {

	public static void main(String[] args) {
		//Kullanicidan bir String isteyin ve Stringi tersine ceviren bir method yaziniz

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen tersten yazdirmak icin bir kelime yaziniz...");
		
		String str = scan.nextLine();
		
		ters(str);
	
	}

	private static String ters(String str) {
		String tersstr = null;
		for(int i=str.length()-1; i>=0 ; i-- ) {
			tersstr = str.substring(i,i+1);
			System.out.print(str.substring(i,i+1));
		
		}
		return tersstr;
		
	}

}
