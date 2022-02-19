package day40_Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_EXCEPTION {
    public static void main(String[] args) {
        // Verilen bir int array icin
        // kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
        // o index'deki elementi yazdirin

        int arr[] = {12,145,16,13,90,-30} ;

        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Listedeki kacinci indexi gormek istiyorsunuz");
            int index = scan.nextInt();
            System.out.println("girdiginiz indexdeki element : " + arr[index]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("girdiginiz index array de yok");
        }catch (InputMismatchException e){
            System.out.println("girdiginiz index pozitifi bir sayi olmali");
        }



    }
    }
