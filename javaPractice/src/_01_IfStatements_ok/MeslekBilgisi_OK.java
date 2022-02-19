package _01_IfStatements_ok;

import java.util.Scanner;

public class MeslekBilgisi_OK {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
		String jobtitle = input.next();
		
		String qa = "Quality Assurance";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";
		if (jobtitle.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz:"+ (qa));
		}else if (jobtitle.equalsIgnoreCase("dev")) {
			System.out.println("Mesleginiz:"+ (dev));
		}else if (jobtitle.equalsIgnoreCase("ba")) {
			System.out.println("Mesleginiz:"+ (ba));
		}else if (jobtitle.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz:"+ (pm));
		}
		
		else {
			System.out.println("hatali giris yaptiniz...");
		}
	input.close();

	}

}
