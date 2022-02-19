package Arrays09Aralik;

import java.util.Arrays;

public class Q3_ok {
	


	public static void main(String[] args) {
		// Write a Java program to find the duplicate values of an array of integer values.
		
		int[] array = {1, 2, 5, 5, 6, 6, 7, 2,6,2};
		int depo;
        depo = array[0];
        
        for (int i = 0; i < array.length; i++){
            if (array[i] > depo) {
                depo = array[i];
            }
        }
        
        System.out.println("Dizideki en büyük değer: " + depo);
		 
        for (int i = 0; i < array.length-1; i++)
        {
            for (int j = i+1; j < array.length; j++)
            {
                if ((array[i] == array[j]) && (i != j))
                {
                    System.out.println("tekrar eden : "+array[j]);
                }
            }
        }
		
		
		
		
	}

}
