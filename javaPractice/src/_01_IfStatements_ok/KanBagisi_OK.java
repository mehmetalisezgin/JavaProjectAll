package _01_IfStatements_ok;

import java.util.Scanner;

public class KanBagisi_OK {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
				// 18 yasindan kucuk ise kan bagisi yapamaz
				// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
				// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
				
				Scanner scan = new Scanner(System.in);
				System.out.println("lutfen yasinizi giriniz");
				int yas = scan.nextInt();
				System.out.println("lutfen kilonuzu giriniz");
				double kilo = scan.nextDouble();
				if ((yas<18)||(yas>18 && kilo<50)) {
					System.out.println("Kan Bagisi Yapamaz...");
					
				}else if (yas>=18 && kilo>=50) {
					System.out.println("kan bagisi yapabilir...");
				}

				scan.close();
	}

}
