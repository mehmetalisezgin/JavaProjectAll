package day20;

import java.util.Arrays;

public class C04 {

	public static void main(String[] args) {
		int [][][] arrr = {{{1,2},{3,4},{5,6}} ,{{7,8},{9,1},{2,3}}} ;
		
		//Arrays.sort(arrr);
		System.out.println(Arrays.toString(arrr[0][0]));
		System.out.println(Arrays.toString(arrr[0][1]));
		System.out.println(Arrays.toString(arrr[0][2]));
		System.out.println(Arrays.toString(arrr[1][0]));
		System.out.println(Arrays.toString(arrr[1][1]));
		System.out.println(Arrays.toString(arrr[1][2]));
		System.out.println("************************");
		int age [] = new int[5];
		age[0] = 12;
		age[1] = 14;
		age[2] = 21;
		age[3] = 14 ;
		age[4] = 10 ;
		
		System.out.println(Arrays.toString(age));
	}

}
