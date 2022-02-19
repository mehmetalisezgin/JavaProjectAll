package Constructors;

public class Family {
	
	public static String fathername ;
	public static String mothername ;
	public static String wifename ; 
	public static int numberofkids ;

	Family(){
		
	}
	public static void added(){
		System.out.println("Family information is added..");
	}
	public static void removed() {
		System.out.println("Family information is removed..");
	}
	public static void setFathername(String setFathername) {
		fathername = setFathername; 
	}
	public static void setMothername(String setMothername) {
		mothername = setMothername ; 
	}
	public static void setWifename(String setWifename) {
		wifename = setWifename ; 
	}
	public static void setnumberofkids(int setnumberofkids) {
		numberofkids = setnumberofkids ; 
	}
	
	
	
	
	
	
	
}
