package iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class C01 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();

        liste.add("A");
        liste.add("B");
        liste.add("C");
        liste.add("D");

        System.out.println("Listenin elemanlari");
        System.out.println(liste);

        // her elemana B ekleyelim
        for (String each : liste) {
             each+="B" ;
            System.out.print(each+ " ");
        }
        System.out.println("");
        System.out.println(liste);
        //  Collections da hrer yapi indexi desteklemez.Ornegin Set de index olmaz
        // Index olmayinca mecburen for each loop kullanilir
        // For each loop ile update veya delete yapamayiz
        // bu sebepten Iterator class i kullanilir

        Iterator it1 = liste.iterator() ; // normalde obje olustururken bu ekilde yazardik Iterator it1 = new iterator()
        // bu sekilde yapilmiyor cunku olusturulan Iterator oluaturuldugu Collection icinde gezinecek ona ait olacak ona has

       // Listedeki Tum elemanlari Iterator kullanarak silelim.

        while(it1.hasNext()){ // bu iterator icin eger daha eleman varsa calismaya devam et. artik eleman kalmadi diyene kadar calisir. en son eleman
            // kalmayinca false olacak ve loop bitecek
            it1.next(); // A ile B arasina goidecek A yi return edecek
            it1.remove(); // A yi sildi cunku retyurn etmisti

        }

        System.out.println(liste);

        List<String> isimList = new ArrayList<>();
        isimList.add("ahmet");
        isimList.add("arif");
        isimList.add("ozan");
        isimList.add("mustafa");
        isimList.add("shaban");

       ListIterator<String> l1 = isimList.listIterator();
       l1.add("Kazim");// kalici olarak ekledik
        System.out.println(isimList);

        System.out.println("***************ListIterator*****************************");
        ArrayList num= new ArrayList();
        for (int i = 0; i < 10; i++)
            num.add(i);
        System.out.println(num);
        ListIterator yenList = num.listIterator();
        while (yenList.hasNext())
        {
            int i = (Integer)yenList.next();
            System.out.print(i + " ");
            if (i%2==0) {
                i++;
                yenList.set(i);
               yenList.add(i);

            }
        }
        System.out.println();
        System.out.println(num);

        yenList.previous();
        yenList.remove();
        yenList.previous();
        yenList.remove();
        System.out.println(num);
    }
}
