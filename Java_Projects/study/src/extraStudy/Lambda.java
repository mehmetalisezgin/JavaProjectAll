package extraStudy;

package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda01 {

	/*
	   1) Lambda "Functional Programming"
	      "Functional Programming" de "Nasil yaparim?" degil "Ne yaparim?" dusunulur.
	   2) "Structured Programming" de "Ne yaparim?" dan cok "Nasil Yaparim?" dusunulur
	   3) "Functional Programming" hiz, code kisaligi, code okunabilirligi
	   ve hatasiz code yazma acilarindan cok faydalidir.
	   4) Lambda sadece collections'larda(List, Queue ve Set) ve array'lerde kullanilabilir ancak map'lerde kullanılmaz.
	      Lambda kullanmak hatasız code kullanmaktır.
	*/





   public static void main(String[] args) {

      List <Integer> list = new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,60,42,55));

      //structure programiing ile list elemanlarinin tamamini aralarina bosluk birakarak yazdiriniz
      printElStructured(list);// method call
      System.out.println("\n");
      printElFunctional(list);// lambda expression
      System.out.println("\n");
      printElfunctional1(list) ; // method reference calisti
      System.out.println("\n");
      printCiftStructured(list);
      System.out.println("\n");
      printCiftfunctional(list);
      System.out.println("\n");
      printCiftfunctional1(list) ;
      System.out.println("\n");
      printCiftAltmisKucukfunctional1(list) ;
      System.out.println("\n");
      printPislik(list);
      System.out.println("\n");
      printTeklik1(list);
      System.out.println("\n");
      ciftKarePrint(list) ;
      System.out.println("\n");
      ciftKarePrint1(list) ;
      System.out.println("\n");
      tekKupBirFazlasi(list);
      System.out.println("\n");
      ciftKarakok(list);
      System.out.println("\n");
      maxElFunctional(list);
   }
   public static void printElStructured(List <Integer> list) { //12 13 65 3 7 34 22 60 42 55

      for (Integer w : list) {
         System.out.print(w+" ");

      }

      //Functional programiing ile list elemanlarinin tamamini aralarina bosluk birakarak yazdiriniz

   }
   public static void printElFunctional(List <Integer> list) {
      list.stream().forEach(t->System.out.print(t+" ")) ;	//lambda expression: lambda ifadesi
      // stream() : datalari yukaridan asagiya akis sekline getirir. Lambda methodu dur
      // forEach() data nin paremetresine gore her bir elemani isler
      // t-> Lambda operatoru
      // Lambda Expression yapisi cok tavsiye edilmez daha cok Method Reference kullanir

   }
   // Method Rference ==>> kendi create ettigimiz veya javadan aldigimiz method ile

   // ClassName : : MethodName

   public static void printEl(int t) {// refere edilecek method create edildi
      System.out.print(t + " ");
   }

   public static void printElfunctional1(List<Integer>list) {
      list.stream().forEach(Lambda01::printEl) ;



   }
   // structure programiing ile list elemanlarinin cift elemanlarini ayni satirda aralarina bosluk birakarak yazdiriniz

   public static void printCiftStructured(List<Integer>list) {
      for (Integer w : list) {
         if(w%2==0) {
            System.out.print(w+" ");
         }

      }
   }
// Functional programiing ile list elemanlarinin cift elemanlarini ayni satirda aralarina bosluk birakarak yazdiriniz


   public static void printCiftfunctional(List<Integer>list) {
      list.stream().filter(t->t%2==0).forEach(Lambda01::printEl);;
      // filter()--> ais icerisindeki elemanlari istenen sarta gore filtreleme yapar
   }

   public static boolean ciftBul(int i) {// refere edilecek tohum method yaptik




      return i%2==0 ;
   }

   public static void printCiftfunctional1(List<Integer>list) {
      list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);;
      // filter()--> ais icerisindeki elemanlari istenen sarta gore filtreleme yapar
   }

//// Functional programiing ile list elemanlarinin cift elemanlarini 60 dan kuycuk olani ayni satirda aralarina bosluk birakarak yazdiriniz

   public static void printCiftAltmisKucukfunctional1(List<Integer>list) {
      list.stream().filter(t->t%2==0 && t<60).forEach(Lambda01::printEl);
   }

   public static void printPislik(List<Integer>list) {
      list.stream().filter(t->t%2==1 || t>20).forEach(Lambda01::printEl);
   }

   public static void printTeklik(List<Integer>list) {
      list.stream().filter(t->t%2!=0).forEach(Lambda01::printEl);
   }


   public static boolean printTeklikmethod(int i) {



      return i%2!=0;
   }
   public static void printTeklik1(List<Integer>list) {
      list.stream().filter(Lambda01::printTeklikmethod).forEach(Lambda01::printEl);
   }

   public static int printkareli(int i) {

      if(i%2==0) {

      }


      return i*i ;
   }
   public static void ciftKarePrint1(List<Integer>list) {

      list.stream().filter(Lambda01::ciftBul).map(Lambda01::printkareli).forEach(Lambda01::printEl);
   }




   public static void ciftKarePrint(List<Integer>list) {

      list.stream().filter(Lambda01::ciftBul).map(t->t*t).forEach(Lambda01::printEl);
   }

   public static boolean tekBul(int i) {// refere edilecek tohum method yaptik




      return i%2!=0 ;

   }


   public static int printkuplu(int i) {

      if(i%2!=0) {

      }


      return (((i*i)*i)+1) ;

   }
   public static void tekKupBirFazlasi(List<Integer>list) {

      list.stream().filter(Lambda01:: tekBul).map(Lambda01::printkuplu).forEach(Lambda01::printEl);
   }

   public static int karakok(int i) {




      return (int) Math.sqrt(i) ;

   }



   public static void ciftKarakok(List<Integer>list) {

      list.
              stream().
              filter(Lambda01:: ciftBul).
              map(Lambda01::karakok).
              forEach(Lambda01::printEl);
   }


   public static void maxElFunctional(List<Integer>list) {

      Optional<Integer>  max =  list.stream().reduce(Math::max) ;

      System.out.println(max);

   }




}
