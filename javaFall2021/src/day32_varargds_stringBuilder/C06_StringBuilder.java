package day32_varargds_stringBuilder;

public class C06_StringBuilder {

	public static void main(String[] args) {
		String str = "Ali Can" ;
		String str2 = new String("Veli Cem");
		
		StringBuilder sb = new StringBuilder("yasasin Java") ;
		sb.append("!!!");
        System.out.println(sb);
        sb.append(3);
        System.out.println(sb);
        sb.deleteCharAt(5);
        System.out.println(sb);
        sb.toString().toUpperCase();
        System.out.println(sb);
        
        System.out.println(str.toString().toUpperCase());
        
    
	}

	
}   
