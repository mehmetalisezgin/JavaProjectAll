package market01;

import java.util.Scanner;

public class SatinAlma {


static Scanner scan = new Scanner(System.in);






public static void satinalma(){
    String devam = "";
    double toplamFiyat = 0;

    System.out.println("sectiginiz urun kodunu giriniz : ");
    int urunNo = scan.nextInt();
    System.out.println("Kc kg almak istiyorsunuz?");
    double kg = scan.nextDouble();
    sepetEkle();
    toplamFiyat = sepetTutari();

}
    public static void sepetEkle(){
        int urunNo = 0;
        Urunler.sepetUrunlerin.add(Urunler.urunIsimleri.get(urunNo));
        Double kg = null;
        Urunler.sepetKg.add(kg);
        Urunler.sepetFiyatlar.add(Urunler.fiyatlar.get(urunNo)*kg) ;
    }

 public static double sepetTutari(){




    return  0;
 }

}
