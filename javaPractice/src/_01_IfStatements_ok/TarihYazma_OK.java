package _01_IfStatements_ok;

import java.util.Scanner;

public class TarihYazma_OK {

	public static void main(String[] args) {
		/*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    	TRICK: her else komutundan sonra return; komutu kullanınız...

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
    	Scanner scan =new Scanner(System.in);
        System.out.println("Please input day...");
        int day = scan.nextInt();
        System.out.println("Please input month..");
        int month = scan.nextInt();
        System.out.println("Please input year...");
        int year = scan.nextInt();
        
        String date = day+"."+month+"."+year ;     
        String date1 =month+"."+day+"."+year ; 
        String date2 = year+"."+month+"."+day ; 
       
        if(((day>31 || day<1))|| ((month>12)||(month<1)) || (year<1) ) {
        System.out.println("Lutfen gecerli bir tarih giriniz...");	
        }else {
        	System.out.println(date);
        	System.out.println(date1);
        	System.out.println(date2);
        	return ;
        }

	}

}
