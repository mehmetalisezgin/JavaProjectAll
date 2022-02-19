package OnAralik;

import java.util.Arrays;

public class Q5 {

	public static void main(String[] args) {
	// Write a Java program to arrange the elements of a given array of integers where all negative
	//integers appear before all the positive integers.
	int[] nums = {-4, 8, 6, -5, 6, -2, 1, 2, 3, -11};
	System.out.println("Orjinal Array: "+Arrays.toString(nums)); 
       sort_nums(nums);
        
    System.out.println("Yeni Array: "+Arrays.toString(nums)); 
    }
    public static void sort_nums(int[] nums){
    	
        int positive = 0;
        
        int negative = 0;
        
        int i,j;
        
        int max = Integer.MIN_VALUE;
        
        for(i=0; i<nums.length; i++){
        	
            if(nums[i]<0) 
            	negative++;
            
            else 
            	positive++;
            
            if(nums[i]>max) 
             max = nums[i];
        }
        max++;
        if(negative==0 || positive == 0) return;
        i=0;
        j=1;
        while(true){
            while(i<=negative && nums[i]<0) i++;
            while(j<nums.length && nums[j]>=0) j++;
            if(i>negative || j>=nums.length) break;
            nums[i]+= max*(i+1);
            swap_nums(nums,i,j);
        }

        i = nums.length-1;
        while(i>=negative){
            int div = nums[i]/max;
            if(div == 0) i--;
            else{
                nums[i]%=max;
                
                swap_nums(nums,i,negative+div-2); 
            }
        }

    }
    private static void swap_nums(int[] nums, int i , int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
		
		
		
		

	}

}
