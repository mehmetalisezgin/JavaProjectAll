package _04_methods_ok;

import java.util.Scanner;

public class C02_ok {

	public static void main(String[] args) {
		/*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

		System.out.println("Please write first word");
		Scanner scan = new Scanner(System.in);
		
		String name1 = scan.next();
		System.out.println("Please write second word");
		String name2 = scan.next();
		
		change(name1,name2);
		scan.close();
	}

	private static void change(String name1, String name2) {
		
		if (name1.length()%2==0) {
			name1 = name1.substring(0, (name1.length()/2)).concat(name2).concat(name1.substring(name1.length()/2 ));
			System.out.println(name1);
		} else {
			name1 = name1.concat(name2);
			System.out.println(name1);
		}
		
		
		
		
		
	}

}
