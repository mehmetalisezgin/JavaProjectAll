package _04_methods_ok;

import java.util.Scanner;

public class C07_ok {

	public static void main(String[] args) {
		/*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
		System.out.println("Please write your word");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		
		singlechar(word);
		
		
		
		
		
	scan.close();	
	}

	private static void singlechar(String word) {
		String sonuc = "";  //string default değeri "" atadık çünkü işleme etki etmemeli.
        for (int i = 0; i < word.length(); i++) {
            if (!sonuc.contains(word.substring(i, i + 1))) {//sonuç metni str'nin

                sonuc += word.substring(i, i + 1);
            }
		
	}
        System.out.println(sonuc);
	}
}

