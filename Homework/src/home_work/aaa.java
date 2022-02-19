package home_work;

import java.util.Scanner;

    public class aaa {
	public static void main(String[] args) {
		Scanner ekran = new Scanner(System.in);
        System.out.println("bir tarih giriniz :");
        int tarih = ekran.nextInt();
        
        
        if (tarih>=0) {
        if (tarih % 4 != 0) {
            System.out.println("Girilen tarih \"" + tarih + "\" artık yıl degildir.");
        } else if (tarih % 100 != 0) {
            System.out.println("girilen tarih \"" + tarih + "\" artık yıldır.");
        } else if (tarih % 400 != 0) {
            System.out.println("girilen tarih \"" + tarih + "\" artık yıl degildir.");
        } else {
            System.out.println("Girilen tarih \"" + tarih + "\" artık yıldır.");
        }
        }else {System.out.println("Girdiginiz tarih milattan önce artık yıl hesabı o zaman yoktu..");
        }
        
        ekran.close();
    }

		
		
		
		
		
		
		
		
		
		
    
    } 
	



