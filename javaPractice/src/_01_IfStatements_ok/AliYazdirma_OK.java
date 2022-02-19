package _01_IfStatements_ok;

public class AliYazdirma_OK {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		
		int A=pickName.indexOf("A");
		
        int L=pickName.indexOf("L");
        int I=pickName.indexOf("I");
        
        char A1=pickName.charAt(A);
        char L1=pickName.charAt(L);
        char I1=pickName.toLowerCase().charAt(I);
        System.out.println(A1+" "+L1+ " "+I1);
        System.out.println(""+A1+L1+I1); 
		
	}

}
