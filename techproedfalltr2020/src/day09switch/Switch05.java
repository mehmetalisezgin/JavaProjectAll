package day09switch;

import java.util.Scanner;

public class Switch05 {

	public Switch05() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		System.out.println("Ismini gormek istediginizi gunun sayisini giriniz :");
		String ay = scan.next().toLowerCase();
		switch(ay) {
		case "ocak" :
		case "mart" :
		case "mayis" :
		case "temmuz" :
		case "agustos" :
		case "ekim" :
		case "aralik" :
			System.out.println("girmis oldugunuz ay  31 gundur");
		break ;
		
		case "subat" :
			System.out.println("girmis oldugunuz ay 28/29 gundur");
		break ;
		case "nisan" :
		case "haziran" :
		case "eylul" :
		case "kasim" :
			System.out.println("girmis oldugunuz ay 30 gundur");
		break ;
		
		default :
			System.out.println("gecerli bir ay ismi giriniz");
		
		}
		*/
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ogrenmek istediginiz ayin gun sayisini giriniz");
		int gunsayisi = scan.nextInt();
		switch (gunsayisi) {
		
		case 28  :
		case 29 :
			System.out.println("girmis oldugunuz gun sayisi subat yina ayittir");
			break ;
			
	default :
		System.out.println("bu subat ayina ayit gun sayisi degildir");
		}
		
		

	}

}
