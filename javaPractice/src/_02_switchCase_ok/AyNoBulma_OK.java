package _02_switchCase_ok;

import java.util.Scanner;

public class AyNoBulma_OK {

	public static void main(String[] args) {
		// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız
       Scanner scan = new Scanner(System.in);
       System.out.print("Ay No =");
       int ayno = scan.nextInt();
		
		switch (ayno) {
		case 1 :
		case 3 :
		case 5 :
		case 7 :
		case 8 :
		case 10 :
		case 12 :
			System.out.println("Girdiginiz ay 31 gun : ");
			break;
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			System.out.println("Girdiginiz ay 30 gun : ");
		case 2 :
			System.out.print("yıl = ");
            int yil = scan.nextInt();
            if (yil % 4 == 0)
                System.out.println("Girdiğiniz ay 29 gün");
            else
                System.out.println("Girdiğiniz ay 28 gün");
            break;

        default:
            System.out.println("Hatalı giriş yaptınız!!!");
		}
		
		
		
		scan.close();
		
		
		
		
		
	}

}
