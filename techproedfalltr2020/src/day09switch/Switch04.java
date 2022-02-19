package day09switch;

import java.util.Scanner;

public class Switch04 {

	public Switch04() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir ay ismi giriniz :");
		String ay = scan.next().toLowerCase();
		//
		switch(ay) {
		case "ocak" :
			System.out.println("girmis oldugunuz ay yilin birinci ayidir");
		break ;
		
		case "subat" :
			System.out.println("girmis oldugunuz ay yilin ikinci ayidir");
		break ;
		
		case "mart" :
			System.out.println("girmis oldugunuz ay yilin ucuncu ayidir");
		break ;
		
		case "nisan" :
			System.out.println("girmis oldugunuz ay yilin dorduncu ayidir");
		break ;
		case "mayis" :
			System.out.println("girmis oldugunuz ay yilin besinci ayidir");
		break ;
		case "haziran" :
			System.out.println("girmis oldugunuz ay yilin altinci ayidir");
		break ;
		case "temmuz" :
			System.out.println("girmis oldugunuz ay yilin yedinci ayidir");
		break ;
		case "agustoz" :
			System.out.println("girmis oldugunuz ay yilin sekizinci ayidir");
		break ;
		case "eylul" :
			System.out.println("girmis oldugunuz ay yilin dokuzuncu ayidir");
		break ;
		case "ekim" :
			System.out.println("girmis oldugunuz ay yilin onuncu ayidir");
		break ;
		case "kasim" :
			System.out.println("girmis oldugunuz ay yilin onbirinci ayidir");
		break ;
		case "aralik" :
			System.out.println("girmis oldugunuz ay yilin onikinci ayidir");
		break ;
		
		default :
			System.out.println("gecerli bir ay ismi giriniz");
		
		
		}
		

	}

}
