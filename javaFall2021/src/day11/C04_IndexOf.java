package day11;

public class C04_IndexOf {

	public static void main(String[] args) {
		String str = "Calisirsaniz, java ogrenmek cok kolay";
		System.out.println(str.indexOf('s'));// 4
		System.out.println(str.indexOf("s"));// 
		
		int index = str.indexOf('r'); // indexof metodu bize herzaman int bir deger doner
		System.out.println(index);
		
		System.out.println(str.indexOf('q'));// olmayan karekter -1 olarak print eder...
		
		
		
	}

}
