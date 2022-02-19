package day40_Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05 {
    public static void main(String[] args) throws FileNotFoundException {

       try {
           FileInputStream fis = new FileInputStream("src\\day40\\yazi.txt");
        int k = 0;
        while ((k=fis.read())!=-1) {
            System.out.print((char)k);
        }
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }catch (IOException e){
           e.printStackTrace();
       }
        System.out.println(" ");
        System.out.println("gorev tamamlandi");
    }




}
