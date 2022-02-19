package day40_Exception;

public class C01_exception {

    public static void main(String[] args) {
        int a = 20 ;
        int b = 0;

       try {
           System.out.println("Sayilarin bolumu : "+ a/b);
       }catch (ArithmeticException e){
           System.out.println("Sifira bolum yapilamaz");
           System.out.println("problemin kaynagi: "+e.getMessage()); //    / by zero  exception'in kaynagini
           e.printStackTrace();
           // java.lang.ArithmeticException: / by zero
           //		at day40.C01_exception.main(C01_exception.java:12)
       }
        System.out.println("gorev tamamlandi");
    }
}
