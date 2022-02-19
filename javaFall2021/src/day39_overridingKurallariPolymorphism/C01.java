package day39_overridingKurallariPolymorphism;

public class C01 {

	public static void staticMethod() {
		System.out.println("Parent class static method calisti");

	}
    private void privateMethod() {
    	System.out.println("Parent class private method calisti");
}
    public final void finalMethod() {
    	System.out.println("Parent class final method calisti");
    }
 // child class ile parent class ayni package de olduklari icin 
 // methodlarin access modifierlari public protected veya default olsaydi hic bir sorun olmazdi 
    // final olarak tanimlanan bir method override edilemez 
}
