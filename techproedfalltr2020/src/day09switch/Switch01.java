package day09switch;
import java.util.Scanner;
public class Switch01 {

	public Switch01() {
		
	/*
	 * switch() statement if-else-if ile ayni isi yapar.
	 * switch() statement daha kolay yazilir ve daha kolay okunur
	 * 	2 den fazla durum varsa genellikle if-else-if yerine switch() kullanilir.
	 */
		
		
	/*
	 * Kullanici hafta gununun sayisni girsin program haftanin gununu yazsin
	 * 

	 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ismini gormek istediginizi gunun sayisini giriniz :");
		
		int gun = scan.nextInt();
		
		if (gun==1) {
			System.out.println("pazartesi");
			
		}else if (gun==2) {
			System.out.println("sali");
		}else if (gun==3) {
			System.out.println("carsamba");
		}else if (gun==4) {
			System.out.println("persembe");	
		
		}else if (gun==5) {
			System.out.println("cuma");
		
		}else if (gun==6) {
			System.out.println("cumartesi");
		}else if (gun==7) {
			System.out.println("pazar");
		
		}
		else {
			System.out.println("gecerli gun sayisi giriniz!");
		}
		
		
		
		
		scan.close();
		
		
		
		
		
			
	}

}
