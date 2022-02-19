package home_work;

import java.util.Scanner;

public class artik_yil {
	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	
	System.out.print("Lutfen yili giriniz:");
	int yil = scan.nextInt();
    scan.close();
	
    if  (yil>0)  {
    if ((yil%4==0 && yil%100!=0 )||(yil%400==0)) {	
		System.out.println("Artik yil");
	}
	
	else {
	System.out.println("artik yil degil");
	}
	 
    }else	{
	System.out.println("Lutfen gecerli bir yil giriniz.. ");
	}
    scan.close();
	}	
	
	}

	
		
		
		
		
		
		
		
		
			

