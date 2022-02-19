package monday03;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;

public class DnaRna {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //List<String> dna  = new ArrayList<>(Arrays.asList("A", "T", "C", "G"));
       // List<String> rna  = new ArrayList<>(Arrays.asList("U", "A", "G", "C"));

      // String dna[] = {"A","T","C","G"};
      // String dna1[] = new String[dna.length];

        System.out.println("Dna molekullerini giriniz");
        String dna = scan.next().toUpperCase();
        List<String> rna=new ArrayList<>();
        int count = 0 ;

        while(count<4) {
            /*if (dna.length() != 4) {
                System.out.println("Yanlis giris yaptiniz lutfen tekrar giriniz");
                break;
            }*/

            switch (dna) {
                case "A":
                    rna.add("U");
                    break;
                case "T":
                    rna.add("A");
                    break;
                case "C":
                    rna.add("G");
                    break;
                case "G":
                    rna.add("C");
                    break;
                default:
                    System.out.println("Ynalis Giris yaptiniz");
            }
               count++;
        }
        System.out.println(rna);
    }



}
