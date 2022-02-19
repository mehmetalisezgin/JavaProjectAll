package market01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Urunler {
    static List<String> urunIsimleri = new ArrayList<>(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuç", "Elma",
            "Muz", "Çilek", "Kavun", "Üzüm", "Limon")) ;
    static List<Double> fiyatlar = new ArrayList<>(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));
    static List<String> sepetUrunlerin = new ArrayList<>();
    static List<Double> sepetKg = new ArrayList<>();
    static List<Double> sepetFiyatlar = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);


    public static void urunGoruntuleme() {
     for(int i = 1; i <urunIsimleri.size(); i++ ) {

         System.out.println(" " + i + "\t" + urunIsimleri.get(i) + "\t" + fiyatlar.get(i));
     }

         System.out.println("Satin almak icin 1 e cikis icin 2 ye tiklayiniz");
         int secim = scan.nextInt();
         switch (secim){
             case 1:
                 SatinAlma.sepetEkle();
                 break;
             case 2:
                 System.out.println("Bizi Tercih Ettiginiz Icin Tesekkur Ederiz");
                 break;
             default:
                 System.out.println("Tercihiniz yanlistir");
                 break;
         }


        }





}




