
package monday03;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Q03 {


    public static void main(String[] args) {

        /*   Belirli bir DNA dizisini RNA'ya çeviren bir method oluşturun. Input DNA=AGG output RNA=UCC
    Asagida DNA kodlarina karsilik gelen RNA kodlari verilmistir*/


        List<String> rnaList = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        while (count < 4) {
            System.out.println(count + 1 + ". DNA molekulunu giriniz");
           String dna = scan.next().toUpperCase();
            rnaList.add(dnaRna(dna));
            count++;
        }
        System.out.println(rnaList);



    }

        private static String dnaRna (String dna){
            String rna = "";
            if (!dna.contains("A")) {
                System.out.println("Girdiginiz karekter dna molekulu degil...");

            }
            if (!dna.contains("T")) {
                System.out.println("Girdiginiz karekter dna molekulu degil...");
            }
            if (!dna.contains("C")) {
                System.out.println("Girdiginiz karekter dna molekulu degil...");
            }
            if (!dna.contains("G")) {
                System.out.println("Girdiginiz karekter dna molekulu degil...");
            }
            //==========================
            if (dna.contains("A")) {
                rna = "U";
            }
            if (dna.contains("T")) {
                rna = "A";
            }
            if (dna.contains("C")) {
                rna = "G";
            }
            if (dna.contains("G")) {
                rna = "C";
            }
            return rna;
        }

        }
