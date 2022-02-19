package lambdaBatch44;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Q01 {
    //        2) "Q01" olarak adlandırılan bir class oluşturun
//        3) 5 String öğesi içeren bir String listoluşturun.
//        4) 3 tanesi "A" harfi ile başlayacak
//        5) Elemanlar "A" harfi ile başlıyorsa ve elemanların uzunlukları
//        5'ten küçükse, konsolda list olarak buyuk harflerle yazdırın.
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Erva Naz","Asli","Lucy","Alila","Ali")) ;
        soru1(list);
    }


    public static void soru1(List<String> list ){

         list.stream().filter(t->t.substring(0).contains("A")).filter(t->t.length()<5).forEach(System.out::println);


    }

    public static void soru1a(List<String> list ){

        list.stream().
                filter(t->t.startsWith("A")).// STATRwITH BASLA
                filter(t->t.length()<5).
                map(String::toUpperCase).
               collect(Collectors.toList()).
                forEach(System.out::println);


    }



}
