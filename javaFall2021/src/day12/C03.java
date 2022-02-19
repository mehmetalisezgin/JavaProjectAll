package day12;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		String str = "Calisirsaniz, Java ogrenmek cok kolay";
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("a"));
		System.out.println(str.lastIndexOf('t'));
		System.out.println(str.lastIndexOf("Java"));
		System.out.println(str.lastIndexOf('a',11));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen Bir Cumle Giriniz");
		String cumle = scan.nextLine();
		System.out.println("lutfen varligini kontrol etmek icin bir harf giriniz");
		char  krk = scan.next().charAt(0);
		int index = cumle.lastIndexOf(krk);
		
		if (index==-1) {
			System.out.println("harf cumlede kullanilmamis");
		}else {
			System.out.println("harf cumlede kulanilmis");
		}
scan.close();

		

	}

}
