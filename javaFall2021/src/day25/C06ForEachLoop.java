package day25;

import java.util.ArrayList;
import java.util.List;

public class C06ForEachLoop {

	public static void main(String[] args) {
		
		
		
		int arr[]= {1,2,3,5,3,2,7} ; 
		
		List<Integer> yenilist = new ArrayList<>();
		
		for (int each : arr) {// arr deki herbir(each) int i bana getir 
			
			yenilist.add(each);
			
		}
		
		System.out.println(yenilist);
		// multy dimensiaonal da olmaz her bir array getir deriz ama her bir arrayin icindeki datalari getiremez

	}

}
