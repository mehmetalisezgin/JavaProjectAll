package lambda1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class ExerciseLambda {
  /*  kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
    // ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
    // java programi yazin */


    public static <arr> void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("arrayiniz icin eleman sayisi belirleyin:");
        int arrBoyutu = scan.nextInt();

        int arr[] = new int[arrBoyutu];

     for(int i = 0  ; i<arrBoyutu ; i++){
         System.out.println("Arrayin "+ (i+1) +". elemanini giriniz");
         arr[i]= scan.nextInt();



     }
        System.out.println( " Max num "+Arrays.stream(arr).max());
        System.out.println( " Min num "+ Arrays.stream(arr).min());
        int str=Arrays.stream(arr).reduce(Integer.MIN_VALUE,Integer::max);
        int str1=Arrays.stream(arr).reduce(Integer.MAX_VALUE,Integer::min);

        System.out.println("Max-Min"+(str-str1));
    }

















}
