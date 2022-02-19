package day44_iterator;

import java.util.ArrayList;
import java.util.List;

public class C01_iterator {

	public static void main(String[] args) {
		List<Integer>liste=new ArrayList<>();
		liste.add(5);
		liste.add(3);
		liste.add(7);
		liste.add(1);
		liste.add(9);
		liste.add(8);
		liste.add(2);
// index kullanmadan tum elemanlari 3 eklenmis olarak yazdirin
        System.out.println(liste);
        for(Integer each : liste) {
        System.out.print(each+3 +" ");
        }
        System.out.println("");
        System.out.println(liste);
	}

}
