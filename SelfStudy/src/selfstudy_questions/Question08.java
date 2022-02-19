package selfstudy_questions;

import java.util.Scanner;

public class Question08 {
    static double kenar1 ;
    static double kenar2 ;
    static double kenar3 ;

    public Question08(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public Question08() {

    }


    public static void main(String[] args) {
        /*
        Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units
         by creating a class named 'Triangle' with constructor having the three sides as its parameters.

         */
        Question08 obj = new Question08(kenar1,kenar2,kenar3);
        Scanner scan = new Scanner(System.in);
        System.out.println("Ucgenin birinci kenarini giriniz");
        kenar1= scan.nextDouble();
        System.out.println("Ucgenin ikinci kenarini giriniz");
        kenar2= scan.nextDouble();
        System.out.println("Ucgenin ucuncu kenarini giriniz");
        kenar3= scan.nextDouble();
        System.out.println( "Ucgenin Alani :"+Question08A.ucgenAlan());

    }
}
