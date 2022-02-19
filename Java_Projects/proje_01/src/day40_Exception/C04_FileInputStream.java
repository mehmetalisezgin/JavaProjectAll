package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_FileInputStream {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        // Java'da bir dosyaya ulasmak istedigimizde FileInputStream class'indan yardim aliriz
        try {
            FileInputStream fis =new FileInputStream("src\\day40\\yazi.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // java bu kodda olasi bir problem ongoruyor
        // ve bu probleme karsi ne yapmasi gerektigini bize soruyor
        // (Yani alti cizilen her kod CTE degildir)

        // Bunun icin iki durum sozkonusu
        // 1- try catch kullanarak bu problemi HANDLE edip java'nin yoluna devam etmesini saglayabiliriz
        // 2- Eger dosya okunamiyorsa kod calismasin istiyorsak olayin farkinda oldugumuzu
        //    ve sorumlulugun bizde oldugunu Java'ya soylemeliyiz
        System.out.println("Gorev tamamlandi");
    }
}