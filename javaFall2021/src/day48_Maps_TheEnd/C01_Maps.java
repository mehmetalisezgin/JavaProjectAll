package day48_Maps_TheEnd;

import java.util.HashMap;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		/*Verilen bir String’deki harfleri ve harflerin kacar kez kullanildigini
        return eden bir method yaziniz
	    Ornek : Input : Hellooo  output : H=1, e=1, l=2, o=3*/

		String input = "Hellooo";
		
		Map<String,Integer>mainMap=harfsay(input);
		System.out.println(mainMap);
		
		
		
	}

	private static Map<String,Integer> harfsay(String input) {
		
		Map<String,Integer>harfsayilariMap = new HashMap<>();
		
	String inputArr[] = input.split("")	; //[H, e, l, l, o o o]
		
	for(String each : inputArr)	{
		if(!harfsayilariMap.containsKey(each)) {
			harfsayilariMap.put(each, 1);
		}else {
			// harfsayilariMap.get(each)+1 bu girilen harfin value sunu bulup 1 artirir
			harfsayilariMap.put(each,harfsayilariMap.get(each)+1) ;
		}
	}
		
		return harfsayilariMap ;
	}

}
