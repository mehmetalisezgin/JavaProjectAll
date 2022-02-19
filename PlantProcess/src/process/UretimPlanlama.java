package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class UretimPlanlama {
// fabrikada uretilen urunlerin isimleri belirlenmistir. yandaki aciklamalar birim urun icin gerekli olan hammadde gereksinimlerini gostermektedir.
    private static String sandalyeA; //1 sandalye = 10 kg demir ve 5 kg plastikten uretilir
    private static String sandalyeB; //1 sandalye = 8 kg demir ve 3 kg plastikten uretilir
    private static String koltukA; //1 koltuk = 20 kg demir ve 10 kg plastikten olusur
    private static String koltukB; //1 koltuk = 20 kg demir ve 10 kg plastikten olusur
    private static String kanepeA; // 1 kanepe = 30kg demir ve 25 kg plastikten olusur
    private static String kanepeB; // 1 kanepe = 30kg demir ve 25 kg plastikten olusur
    int tercih ;
    int adet ;

    static List<Object> siparisListesi = new ArrayList<>() ;

    public UretimPlanlama(int tercih, int adet, String siparistarih) {





    }
    // parametreli constructor olsuturuldugu iicn baska yerlerde
    //kullanilmak uzere default in yerine parametresiz constructor olsuturuldu

    public UretimPlanlama(){

    }

    public static void main(String[] args) {

        siparisUrun();
        System.out.println(siparisListesi.stream().toList());
    }



   public static void siparisUrun(){

        System.out.println("Uretmek istediginiz urunu seciniz\n1- SandalyeA\n2- KoltukA\n3- KanepeA\n4- SandalyeB\n5- KoltukB\n6- KanepeB");
        Scanner scan = new Scanner(System.in) ;
        int tercih = scan.nextInt();

        System.out.println("Siparis adetini giriniz...");
        int adet = scan.nextInt() ;

        LocalDateTime dateTime =  LocalDateTime.now(); //dateTime= the local date of now
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        // gun/ay/yil olarak yukardaki formatlanana gore yazdircak...
        String siparistarih =dtf.format(dateTime) ;


        UretimPlanlama siparis = new UretimPlanlama(tercih,adet,siparistarih);
        siparisListesi.add(siparis) ;


    }
    public void ListeleSiparis() {
        System.out.println("\nUrun      :"+ tercih+"\nUrun Adedi    :"+adet+"\nOda Sayisi    :"+ odaSayisi);
    }


}
