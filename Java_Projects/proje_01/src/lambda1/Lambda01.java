package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        printElStructured(list) ;
        System.out.println();
        System.out.println("************");
        printElfunctional(list) ;
        System.out.println();
        System.out.println("************");
        printElfunctional1(list) ;
        System.out.println();
        System.out.println("************");
        printCiftElStuructured( list) ;
        System.out.println();
        System.out.println("************");
        printCiftElFunctional1(list);
        System.out.println();
        System.out.println("************");
        printCiftElFunctional2( list) ;
        System.out.println();
        System.out.println("************");
        printCiftAltmısKucuk( list) ;
        System.out.println();
        System.out.println("************");
        tekYirmidenbuyukPrint(list);
        System.out.println();
        System.out.println("************");
        tekYirmidenbuyukPrint(list) ;
        System.out.println();
        System.out.println("************");
        logaritmaCiftfunctional(list) ;
        System.out.println();
        System.out.println("************");
        maxElfunction(list) ;
    }

    /*
    1) Lambda "Functional Programming"
 		"Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
 	2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
 	3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
 	ve hatasiz code yazma acilarindan cok faydalidir.
 	4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
    Lambda kullanmak hatasız code kullanmaktır.
     */

    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElStructured(List<Integer> list) { //12 13 65 3 7 34 22 60 42 55

        for (Integer w : list) {
            System.out.print(w + " ");

        }
    }
    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list) {
        list.stream().forEach(t-> System.out.print(t+" "));//Lambda Expression :Lambda ifadesi

        //stream() : datalari yukaridan asagiya akis sekline getirir.
        //forEach() :datanin parametresine gore her bir elemanı isler
        //t-> : Lambda operatoru
        // Lambda Expression  yapisi cok tavsiye edilmez daha cok METHOD REFERENCE kullanilir
    }
//Method Reference --> kendi create ettigimiz veya java'dan aldigimiz method ile
// ClassName::MethodName--> ez- ber- leeeeee

 public static void printEl(int t){
     System.out.print(t+" ");

 }

public static void printElfunctional1(List<Integer> list){
        list.stream().forEach(Lambda01::printEl);

}
//structured Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void printCiftElStuructured(List<Integer> list){
        for(Integer w:list){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
}
//Functional Programming ile list elemanlarinin  cift olanalrini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void printCiftElFunctional1(List<Integer> list) {
        list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);
//filter()--> ais icersindeki elemanlari istenen sarta göre filtreleme yapar
}
public static boolean ciftBul(int i){

        return i%2==0 ;
}
public static void printCiftElFunctional2(List<Integer> list){
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
}
//Functional Programming ile list elemanlarinin  cift olanalrinin 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

public static boolean kucuk60(int i){
  return i<60 ;
}




public static void     printCiftAltmısKucuk(List<Integer> list){
      list.stream().filter(Lambda01::ciftBul).filter(Lambda01::kucuk60).forEach(Lambda01::printEl);
}
//Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
// olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz
public static boolean buyuk20(int i) {
        return i>20 ;
}
public static boolean buyuk20veyatek(int i){
       return (i%2!=0||i>20) ;
}
public static void tekYirmidenbuyukPrint(List<Integer> list){
      //  list.stream().filter(t-> t%2!=0|| t>20).forEach(Lambda01::printEl);
    list.
            stream().
            filter(Lambda01::buyuk20veyatek).
            forEach(Lambda01::printEl);
}
//Functional Programming ile list elemanlarinin  tek olanlarinin
// kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void kupBirFazlaTekFunction(List<Integer> list){
        list.
                stream().
                filter(t->t%2!=0).
                map(t->(t*t*t)+1).
                forEach(Lambda01::printEl);
    }
//Functional Programming ile list elemanlarinin  cift olanlarinin
// karekoklerini ayni satirda aralarina bosluk birakarak yazdiriniz
public static void logaritmaCiftfunctional(List<Integer> list){
    list.
            stream().
            filter(Lambda01::ciftBul).
            map(Math::log10).
            forEach(t->System.out.println(t+" "));
}
    //list'in en buyuk elemanini yazdiriniz
    public static void maxElfunction(List<Integer> list){
        Optional<Integer> maxEl =   list.stream().reduce(Math::max);
        System.out.println(maxEl);
        //reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir

    }



}
