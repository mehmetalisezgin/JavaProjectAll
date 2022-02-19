package day35_encapsulation_inheritance;

import com.sun.tools.javac.Main;

public class C02 {
    public static void main(String[] args) {
        // ogretmen ogrencinin notunu gorebilsin
        // ama tum notlaro goremesin
        // sadece gecip gecemedigini gorsun

       C01 ogr1 = new C01() ;
        System.out.println(ogr1.isGecerMi()); //false
        ogr1.setNot(60);
        System.out.println("ogr1 objesine setGecermi value ya 60 eklendikten sonra");
        System.out.println(ogr1.isGecerMi());// true



    }
}
