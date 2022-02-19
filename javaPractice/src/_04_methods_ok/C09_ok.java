package _04_methods_ok;

import java.util.Scanner;

public class C09_ok {

	public static void main(String[] args) {
		/*
	    Problem tanımı:
	    Kullanıcıdan aldığınız bir String'deki kelimeleri sondan başa doğru yerleştiren
	    String parametreli return type li reverseWord isminde bir method yazınız

	     Test DAta :
	    İnput : Allah Javacı arkadaşlara  zihin açıklığı versin
	    Output : versin açıklığı zihin arkadaşlara Javacı Allah
	     */
		System.out.println("Please write your word");
		Scanner scan = new Scanner(System.in);
		
		String word = scan.nextLine();
		reverseword(word);
		System.out.println(reverseword(word));
	scan.close();	
	}

	public static String reverseword(String word) {
		String arr[] = word.trim().split(" ");
		
		String tersstr = "";
		for (int i =arr.length-1;i>=0; i--) {
			tersstr+=arr[i]+" ";
		}
		
		
		
		
		
		return tersstr;
		
		
	}
		
		
		
	

}
