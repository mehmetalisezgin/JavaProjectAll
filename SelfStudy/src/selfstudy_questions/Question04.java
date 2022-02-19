package selfstudy_questions;


import java.util.Scanner;

public class Question04 {

    static double uzunluk;
    static double genislik;
    static double hipotenus;

    // a ve b double variable lari ni iceren bir constructor olusturduk daha sonra class daki variable lari onlara assign ettik
    // bunun yapilmasindaki amac length ve breadth variable larini tekrar baska yerlerde kullanmak
    public Question04(double a, double b, double z) {
        uzunluk = a;
        genislik = b;

    }
    //- bir ucgenin cevresini hesaplamak icin
    public void Question(double x, double y,double z){

     uzunluk = x;
     genislik = y ;
     hipotenus = z ;
    }

    public double ucgenCevresi(){

        return uzunluk+genislik+hipotenus ;
    }

    // getArea methodumuz diktorgenin alanini hesaplamak ici olusturulmustur
    public double getArea() {

        return uzunluk * genislik;
    }

    public static void main(String[] args) {
        /*
        Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
        First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as
        'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
         */


        Scanner scan = new Scanner(System.in);
        double a, b;
        System.out.println("Diktorgenin uzun kenarini giriniz...");
        a = scan.nextDouble();

        System.out.println("Diktorgenin kisa kenarini giriniz...");
        b = scan.nextDouble();
// kullanicidan a ve b double variable larini gormesini istedik ve class imiizn ismi ile obje olusturduk
        double z = 0;
        Question04 obj = new Question04(a, b, z);
        //  a,b variable larini kullnadik cunku parametremiz a ve b oldu
        // dikdortgenin alanini obj objemizden classimizdaki ilgili method ile cekmis olduk...
        System.out.println("Dikdortgenin alani = " + obj.getArea());

        double x;
        double y;
        System.out.println("ucgenin birinci kenari");
        x = scan.nextDouble();
        System.out.println("ucgenin ikinci kenari");
        y = scan.nextDouble();
        System.out.println("ucgenin ucuncu kenari");
        z = scan.nextDouble();

        Question04 obj2 = new Question04(x, y, z);
        System.out.println("Ucgenin cevresi :"+obj2.ucgenCevresi());

    }
}
