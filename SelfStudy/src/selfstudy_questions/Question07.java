package selfstudy_questions;

public class Question07 {

    static double a  ;
    static double b ;
    static double c ;

    public Question07(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   public double areaTriangle(){
       double k = (a*b)/2  ;
    return k;
    }

   public double premetherTriangle(){
        double p = a+b+c ;
        return p ;
   }


    public static void main(String[] args) {
        /*
        Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5
         units by creating a class named 'Triangle' without any parameter in its constructor.
         */
       Question07 obj = new Question07(3,4,5);
        System.out.println("Alan "+obj.areaTriangle());
        System.out.println("Cevre "+obj.premetherTriangle());


    }
}
