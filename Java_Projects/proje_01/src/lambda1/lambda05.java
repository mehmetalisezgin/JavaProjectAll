package lambda1;

import lambda1.Lambda02;

import java.util.stream.IntStream;

public class lambda05 {






//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz

//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz

//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yazin
    //TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
    public static void main(String[] args) {
       System.out.println(topla(10));
        System.out.println("********");
        System.out.println(topla1(10));
        System.out.println("********");
        System.out.println(topla2(10));
        System.out.println("********");
        System.out.println(toplaCift(10));
        System.out.println("********");
        System.out.println(toplaCift1(10));
        System.out.println("********");
        System.out.println(toplatek1(5));
        System.out.println("********");
        ilkXkuvvet(5);
        System.out.println("********");
        istenenSayiIlkXkuvvet(5,3);
        System.out.println("********");



        System.out.println(powerOfIntA(0, 1));
    }
    public static int powerOfIntA(int a, int x) {

        return IntStream.iterate(a, t -> t * a).//a a^2 a^3 a^4...
                limit(x).
                reduce(0,(t,u)->u);

    }

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
    public static int topla(int x){
        int toplam = 0;
        for(int i = 0 ; i<x ; i++){
            toplam+= i ;
        }
        return toplam ;
    }
    public static int topla1(int x){

        return IntStream.
                range(1,x).
                sum();
    }
//TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
    public static int topla2(int x){

        return IntStream.rangeClosed(1,x).sum();
    }
//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
public static int toplaCift(int x){

    return IntStream.
            rangeClosed(1,x).filter(t->t%2==0).
            sum();
}


    public static int toplaCift1(int x){

        return IntStream.
             iterate(2,t->t+2).
                limit(x).
                sum();
    }

    public static int toplatek1(int x){

        return IntStream.
                iterate(1,t->t+2).
                limit(x).
                sum();
    }
    public static void ilkXkuvvet(int x){

        IntStream.
                iterate(2,t->t*2).
                limit(x).forEach(Lambda01::printEl);
    }
    public static void istenenSayiIlkXkuvvet(int a,int x){

        IntStream.
                iterate(a,t->t*a).
                limit(x).forEach(Lambda01::printEl);
    }


  //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi yaziniz

}
