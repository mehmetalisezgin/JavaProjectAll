package _01_IfStatements_ok;

import java.util.Scanner;

public class BMI_ok {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy*boy)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
      Scanner scan = new Scanner(System.in);
      System.out.println("lutfen boyunuzu cm cinsinden giriniz...");
      double boy = scan.nextDouble();
      System.out.println("lutfen kilonuzu giriniz...");
      double kilo = scan.nextDouble();
      
      double bmi = kilo/(boy/100*boy/100);
      if (bmi<20 && bmi>0) {
    	  System.out.println("oldukca zayifsiniz...");
      }
      else if ( bmi<=25) {
    	  System.out.println("normal sinirdasiniz...");
      }
      else if (bmi<=30) {
    	  System.out.println("sisman kategorisindesiniz...");
      }
      else if (bmi>30) {
    	  System.out.println("obez grubundasiniz...");
      }
     scan.close();

	}

}
