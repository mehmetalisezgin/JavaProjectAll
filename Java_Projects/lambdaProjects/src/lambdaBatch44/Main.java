package lambdaBatch44;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static List<Ogrenci> ogListesi = new ArrayList<>();

    public static void main(String[] args) {

ogrenciListesi();
notaGoreSirala(35,100);
yasaGoreSirala();
    }

    private static void yasaGoreSirala() {
        ogListesi.stream()
                .sorted(Comparator.comparing(Ogrenci::getAge).reversed()).forEach(System.out::println);
    }

    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    private static void notaGoreSirala(int alt,int ust) {
        ogListesi.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).
                skip(alt-1)
                .limit(ust-alt+1)
                .forEach(System.out::print);
    }






    public static void ogrenciListesi() {


        ogListesi.add(new Ogrenci("Ahmet","Can",30,95.5,"erkek"));
        ogListesi.add(new Ogrenci("Ahmet","Yarba",25,90.5,"erkek"));
        ogListesi.add(new Ogrenci("Ayse","Can",21,82.5,"kadin"));
        ogListesi.add(new Ogrenci("Merve","Aslan",30,98.8,"kadin"));
        ogListesi.add(new Ogrenci("Veli","Han",80,35.5,"erkek"));
        ogListesi.add(new Ogrenci("Funda","Funda",24,99.2,"kadin"));



    }
}
