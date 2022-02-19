package day23;

import java.util.Arrays;

public class C07 {

	public static void main(String[] args) {
		
      int arr[] = {9,8,5,2,1};
      Arrays.sort(arr);
      System.out.println(Arrays.toString(arr));
      //System.out.println(Arrays.binarySearch(arr, 7));
      
      
      System.out.println(Arrays.binarySearch(arr, 9));
      System.out.println(Arrays.binarySearch(arr,8 ));
     
      //[A,A,B,C,D,E]
      
      String str = "Java Ogrenmek, IT alaninda. yer edinmek demektir";
      
      String arr2[] = str.split(".");
      System.out.println(Arrays.toString(arr2));
     
      String arr3[] = str.split(",");
      System.out.println(Arrays.toString(arr3));
      
      String arr4[] = str.split(" ");
      System.out.println(Arrays.toString(arr4));
      
      String arr5[] = str.split("");
      System.out.println(Arrays.toString(arr5));
      
      int array[][] = {{1,2},{3,4},{5,6}};
      
      
      
      
      
	}

}
