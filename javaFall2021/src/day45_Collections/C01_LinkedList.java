package day45_Collections;

import java.util.LinkedList;

public class C01_LinkedList {

	public static void main(String[] args) {
		//LinkedList bir classtir
		LinkedList<Integer>ll = new LinkedList<>();
		
		ll.add(5);
		ll.add(7);
		// linkedlist in iki tane interface parent i varir bunlardan birisi list oteki de Deque==>Queue
		
		System.out.println(ll); //[5,7]
		
		ll.add(0,10) ; // List interface den gelen ozellikle 0. indexe eleman ekleme
		System.out.println(ll);
		ll.addFirst(3);
		System.out.println(ll);
		
        
		
        LinkedList<Integer>ll2 = new LinkedList<>();
		
        ll2.addAll(ll) ;
        System.out.println(ll2);
		
		ll2.addAll(2,ll) ;
		System.out.println(ll2);

	}

}
