package day45_Collections;

import java.util.LinkedList;
import java.util.List;

public class C03_LinkedList {

	public static void main(String[] args) {
        LinkedList<Integer>ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
        System.out.println(ll);
        ll.element() ;
        
       System.out.println( ll.peek()); // silmeden ilk elemani getirir  queue dan 
       System.out.println(ll.peekFirst()); // silmeden ilk elemani getirir deque dan
       
       
       LinkedList<Integer>ll2 = new LinkedList<>();
		
       System.out.println(ll2.peekFirst());
       System.out.println(ll2.peek());
       
       System.out.println(ll.element());// 5
      // System.out.println(ll2.element()); java.util exception
       
       System.out.println(ll.poll());// 5
       
       System.out.println(ll); // 7
       
       System.out.println(ll.poll());// null
       System.out.println(ll.hashCode());// 1 java nin verdigi hashcode doner
       
       ll2.add(7) ;
       System.out.println(ll2.hashCode()); // 38
       
       
       
       
       
       
     
	}

}
