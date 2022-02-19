package market01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// bu sayfa market calisanlarina ait bir sayfadir calisanlarin kullanici adi ve sifresi bir list de tutulmustur
public class UrunEkleme {
    static List<Object> user1 = new ArrayList<>(Arrays.asList("Mustafa",1234)) ;
    static List<Object> user2 = new ArrayList<>(Arrays.asList("Arda",1985)) ;
    static List<Object> user3 = new ArrayList<>(Arrays.asList("Erva",1986)) ;
     static  Scanner scan = new Scanner(System.in) ;







    public static void kullanicigiris() {
        int count = 1;


        do {
            System.out.println("Kullanici adi giriniz");
            Scanner scan = new Scanner(System.in) ;
            String kullanici = scan.next();
            System.out.println("Kullanici sifrenizi giriniz");
            int sifre = scan.nextInt();

            if(user1.contains(kullanici)&&user1.contains(sifre)){
                System.out.println("Giris basarili");
              count++;
              break;
            } if (user2.contains(kullanici)&&user2.contains(sifre)){
                System.out.println("Giris basarili");
                count++;
                break;
            } if (user3.contains(kullanici)&&user3.contains(sifre)){
                System.out.println("Giris basarili");
                count++;
                break;
            }else{
                System.out.println("Hatali giris yaptiniz");
            }

        } while (count<4) ;

        urunekleme();
    }

    public static void urunekleme() {

        String urunismi;
        double urunfiyat ;
        Object devam1 = null;
        Object devam;
        System.out.println("******* Urun Ekleme Syfasindasiniz******");
        System.out.println("Eklemek istediginiz urun ismi : ");
        do {
            urunismi = scan.nextLine();
            System.out.println("Urunun Birim fiyati : ");
            urunfiyat = scan.nextDouble();
            Urunler.urunIsimleri.add(urunismi);
            Urunler.fiyatlar.add(urunfiyat);
            System.out.println("Ana menuye donmek icin herhangi bir tusa basiniz");
            devam= scan.next();
        }
            while (devam1 == devam) ;
            AnaSayfa.anaMenu();

        }
    }


