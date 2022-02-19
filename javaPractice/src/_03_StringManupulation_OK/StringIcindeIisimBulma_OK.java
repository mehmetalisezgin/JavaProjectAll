package _03_StringManupulation_OK;

public class StringIcindeIisimBulma_OK {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */

		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (pickName.contains("A")&&pickName.contains("L")&&pickName.contains("I")) {
			
			System.out.println("ALI");
			
		} else {
       System.out.println("aradiginiz karekterler bulunamadi");
		}
		
		
		
		
		
	}

}
