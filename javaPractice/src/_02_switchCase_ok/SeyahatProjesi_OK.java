package _02_switchCase_ok;

import java.util.Scanner;

public class SeyahatProjesi_OK {

	public static void main(String[] args) {
		 /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.

        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro

todo İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.



        todo İLK OLARAK;

        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.

    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.

   todo    Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:

      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.

      son olarak konsolda: Frankfurt 15 Euro         yazsın.


      todo  case: KÖLN ise

      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.

       son olarak konsolda:  Köln   20 Euro             yazsın.



       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.

       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)

        case:2 ise

        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.


        todo  Son olarak yolculugunuzu check edin;

        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.

        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.


         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to online tickets store...");
		System.out.println("The following destinations are available ");
		System.out.println("Please click 1 for : Ljubljana-Koln 35 euro\n"
				+ "Please click 2 for : Ljubljana-Frankfurt 25 euro\n"
				+ "Please click 3 for : Koln-Frankfurt 15 euro"		);
		
		System.out.println("Please choose you destination...");
		int destination = scan.nextInt();
		
		
		
		if(destination>3) {
			System.out.println("There are 3 destinations are available,please choose one of them...");
		}else {
			System.out.println("Please choose the passanger...");
			System.out.print("The number of adult: ");
			int adult = scan.nextInt();
			System.out.print("The number of kids 0-6: ");
			int kids = scan.nextInt();
			System.out.print("The number of student 7-18: ");
			int student = scan.nextInt();
		switch (destination) {
		
		case 1:
			int total = 35*adult + 15 *student +10*kids ;
			System.out.println("Ljubljana-Koln "+adult+" adult, "+student+" student, "+kids+" kids tickets");
			System.out.println("The cost of trip: "+total);
			break;
		case 2:	
			int total1 = 25*adult + 10 *student +5*kids ;
			System.out.println("Ljubljana-Frankfurt "+adult+" adult, "+student+" student, "+kids+" kids tickets");
			System.out.println("The cost of trip: "+total1);
			break;
		case 3:
			int total2 = 15*adult + 7 *student +3*kids ;
			System.out.println("Koln-Frankfurt "+adult+" adult, "+student+" student, "+kids+" kids tickets");
			System.out.println("The cost of trip: "+total2);
			
		}
       
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
