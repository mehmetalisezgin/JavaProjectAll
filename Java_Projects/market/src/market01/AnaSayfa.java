package market01;

import java.util.Scanner;

public class AnaSayfa {

    public static void main(String[] args) {
        anaMenu();



    }
    public static void anaMenu() {
        System.out.println("Yapmak istediginiz islemi seciniz\n1-Kullanici Girisi ile Urun Ekleme\n2-Urun Goruntuleme \n3-Satin Alma\n4-Cikis");

        Scanner scan = new Scanner(System.in);
        int secim;
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                UrunEkleme.kullanicigiris();
                break;
            case 2:
                 Urunler.urunGoruntuleme();
                break;
            case 3:

                break;
            case 4:
                System.out.println("Gule Gule ");
                break;
            default:
                System.out.println("gecerli bir tercih seciniz");
                break;
        }

    }


}
