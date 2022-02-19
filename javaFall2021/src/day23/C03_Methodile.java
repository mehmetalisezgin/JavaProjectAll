package day23;

public class C03_Methodile {

	public static void main(String[] args) {

		int arr[][]={ {1,2}, {4,5}, {3,4,5},{1} };
		carpimyazdir(arr);
		
		

	}

	private static void carpimyazdir(int[][] arr) {
		
int carpim=1;
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < arr[i].length; j++) {
                
                carpim*=arr[i][j];
               // eger 3 katli array olsaydi uclu for olacakti 
            }
            
        }
        
        System.out.println(carpim);
		
		
		
		
		
		
		
	}

}
