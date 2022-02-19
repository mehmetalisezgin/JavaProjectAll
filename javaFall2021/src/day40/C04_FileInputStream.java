package day40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {

	public static void main(String[] args) throws FileNotFoundException {
		// javada bir dosyaya ulasmak istedigimizde FileInputStream class indan yardim aliriz
		FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
	// java bu kodda olasi bir problemi ongoruyor
		// ve bu probleme karsi ne yapmasi gerektigini bize soruyor
		// yani alti cizilen her kod cte degildir
		// bunun icin iki durum sozkonusu
		// 1-try catch kullanarak bu problemi handle edip javanin yoluna devam etmesini saglayabiliriz
		//
	}

}
