package selfstudy_questions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("mali");
        list.add("erva naz");
        list.add("asli");

        Iterator<String> iterator = list.iterator() ;

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
