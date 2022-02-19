package selfstudy_questions;

import java.util.*;

public class Iterator01 {

    public static void main(String[] args) {
        /*
        Soru 3)
Bir listedeki istenen sayi araliginda olmayan elementleri silen bir program yaziniz …
(2. liste olusturmadan, gecerli liste uzerinde islem
Orn : [2,13,56,23,45,14,40] istenen aralik 20 ile 40 arasi (sinirlar dahil)
output: [23,40]
         */
        System.out.println("**************************List Method*******************************************");
        List<String> list = new ArrayList<>();
        list.add("Mehmet");
        list.add("Erva Naz");
        list.add("Asli");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){// hasnext true return edecek eger daha cok eleman kaldi ise kalmadiginda false olacak ve dongu sonlanmis olacak.
          String next = iterator.next(); // next bir sonrakine gecip atladigini yazdirir
            System.out.println(next);

        }
        System.out.println("****ListIteration****");
        ListIterator<String> listIterator = list.listIterator() ;
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


        System.out.println("********Set Method*********");
        Set<String> set = new HashSet<>();
        set.add("Mehmet");
        set.add("Erva Naz");
        set.add("Asli");

        Iterator<String> iterator2 = set.iterator() ;
        while(iterator2.hasNext()){
            String st1 = iterator2.next();
            System.out.println(st1);
        }

        System.out.println("************* Map ***********");

        Map<String,String> map = new HashMap<>() ;
        map.put("key1","value1") ;
        map.put("key2","value2") ;

        Iterator<String> keyIterator = map.keySet().iterator();
        Iterator<String> valueIterator = map.keySet().iterator();

        Iterator<Map.Entry<String,String>> entryIterator = map.entrySet().iterator();



    }



}
