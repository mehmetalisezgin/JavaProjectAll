package projects;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List <Integer>list = new ArrayList<>(Arrays.asList(12,13,65,3,7,34,22,60,42,55)) ;
        printElEtructured(list) ;
        System.out.println();
        System.out.println("***********");
        printElfunctional(list) ;



    }
    //structured Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElEtructured(List<Integer> list) {
        for (Integer w:list){
            System.out.print(w + " ");
        }
    }
    //Functional Programming ile list elemanlerinin  tamamini aralarina bosluk birakarak yazdiriniz
    public static void printElfunctional(List<Integer> list){
    list.stream().forEach(t-> System.out.print(t+" ")); //Lambda Expression :Lambda ifadesi
}

}




