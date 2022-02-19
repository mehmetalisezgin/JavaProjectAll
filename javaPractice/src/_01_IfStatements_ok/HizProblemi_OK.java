package _01_IfStatements_ok;

import java.util.Scanner;

public class HizProblemi_OK {

	public static void main(String[] args) {
		/*
        Problem tanimi : 
      Kulanıcıdan aracının hızını alınız
      Trafik cezasının değerini hesaplayın.
          45 hız sınırıdır.
          Eğer hızınız 55-74 arasında ise:
          Ceza 100 $'dır.

          Eğer hızınız 75 - 84 arasında ise:
          Ceza 150 $'dır.

          Eğer hızınız 85 -94 arasında ise:
          Ceza 320 $'dır.

          Eğer hızınız 94'den daha fazla ise:
          Ceza 500 $'dır.

          ve ayrıca,
          Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

          Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

          Örn;

          currentSpeed(Hızınız) 87
          ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

          sonuç 320 olmalıdır.

          currentSpeed(Hızınız) 65
          ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

          sonuç 300 olmalıdır.
   */
		Scanner scan =new Scanner(System.in);
	    System.out.println("hiziniz...");
	    double hiz = scan.nextDouble();
	    
	    System.out.println("Ehliyetiniz?\nVAR\nYOK");
	    String ehliyet = scan.next();
		
	    
	   // if((!ehliyet.equalsIgnoreCase("var"))||(!ehliyet.equalsIgnoreCase("yok"))){
	    	//System.out.println("Lutfern Var Yok dan birini secin...");
	   // }
	    if(hiz<=50 && ehliyet.equalsIgnoreCase("var")) {
	    	System.out.println("Dikkat ettiginiz icin tesekkurler...");
	    }if(hiz<=50 && ehliyet.equalsIgnoreCase("yok")) {
	    	System.out.println("Dikkat ettiginiz icin tesekkurler fakat ehliyetiniz olmadigi icin cezaniz 200$...");
	    }
	    if(hiz>=55 && hiz<=74 && ehliyet.equalsIgnoreCase("Var")) {
	    	System.out.println("Odemeniz gereken ceza 100$ ");
	    }if (hiz>=55 && hiz<=74 && ehliyet.equalsIgnoreCase("yok")) {
	    	System.out.println("Odemeniz gereken ceza 300$ ");
	    }if (hiz>=75 && hiz <=84 && ehliyet.equalsIgnoreCase("var")) {
	    	System.out.println("Odemeniz gereken ceza 150$ ");
	    }if (hiz>=75 && hiz <=84 && ehliyet.equalsIgnoreCase("yok")) {
	    	System.out.println("Odemeniz gereken ceza 350$ ");
	    }	if (hiz>=85 && hiz <=94 && ehliyet.equalsIgnoreCase("var")) {
	    	System.out.println("Odemeniz gereken ceza 350$ ");
	    }	if (hiz>=85 && hiz <=94 && ehliyet.equalsIgnoreCase("yok")) {
	    	System.out.println("Odemeniz gereken ceza 550$ ");
	    }	if (hiz>=95 && ehliyet.equalsIgnoreCase("var")) {
	    	System.out.println("Odemeniz gereken ceza 500$ ");
	    }if (hiz>=95 && ehliyet.equalsIgnoreCase("yok")) {
	    	System.out.println("Odemeniz gereken ceza 700$ ");
	    }
	    ///else if ((!ehliyet.equalsIgnoreCase("var"))||(!ehliyet.equalsIgnoreCase("yok"))){
	    	//System.out.println("Lutfern Var Yok dan birini secin...");
	    
	    //}
			
	    scan.close();	
	}

}
