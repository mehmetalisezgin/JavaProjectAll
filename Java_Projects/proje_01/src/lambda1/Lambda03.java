package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("mehmet", "emre", "nilgun", "yıldız",
                "kader", "emine", "islam", "islam", "emre"));
        bykHrfTekrarsizSira(list);
        System.out.println();
        System.out.println(" *** ");
        karektersayisitekrarsizterssirali(list);
        System.out.println();
        System.out.println(" *** ");
        karektersayisinagore(list);
        System.out.println();
        System.out.println(" *** ");
        sonharftersirali(list);
        System.out.println();
        System.out.println(" *** ");
        ciftkaretekrarsizterssira(list);
    }


    public static void printEl(String t){
        System.out.print(t+" ");

    }

//List elemanlarini alafabetik buyuk harf ve  tekrarsiz yazdiriniz
public static void bykHrfTekrarsizSira(List<String> list){
        //elemanlar degisiyor ise akis degisiyor ise map
        list.stream().map(t->t.toUpperCase()).sorted().distinct().forEach(Lambda03::printEl);
}
//List elemanlarinin karekter sayisini ter sirali olarak tekrarsiz yazdiriniz

public static void karektersayisitekrarsizterssirali(List<String> list){
        list.stream().map(t->t.length()).sorted(Comparator.reverseOrder()).distinct().forEach(Lambda01::printEl);
}
//List elemanlarini character sayisina gore kckten byk egore yazdiriniz.
public static void karektersayisinagore(List<String> list) {
    list.stream().sorted(Comparator.comparing(t -> t.length())).forEach(Lambda03::printEl);


}
    public static void sonharftersirali(List<String> list) {
        list.stream().
                sorted(Comparator.
                        comparing(t -> t.toString().
                        charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(Lambda03::printEl);
    }

//Cift sayili elemanlarin karelerini hesaplayan, tekrarli olanlari sadece bir kere buyukten kucuge dogru
//yazdiran bir program yaziniz.

    public static void ciftkaretekrarsizterssira(List<String> list) {
        list.stream().
                map(t->t.length()*t.length()).
                filter(Lambda01::ciftBul).
                distinct().
                sorted(Comparator.reverseOrder()).
                forEach(Lambda01::printEl);
    }







}
