package javaProjects.hastaneOtomasyon;

public class HastaneRunner {
	
	private static Hastane hastane1 = new Hastane();
	
	public static void main(String[] args) {
	String hastaDurumu = null ;
	String unvan =doktorUnvan(hastaDurumu);
	

	}
	public static String doktorUnvan(String aktuelDurum) {
		String actuelDurum = null;
		if (actuelDurum=="Allerji") {
			
		return "Allergist" ;
			
		}if(aktuelDurum=="Bas agrisi") {
		return "Norolog" ;
		
		}if(aktuelDurum=="Diabet") {
		return "Genel cerrah" ;
		
		}if(aktuelDurum=="Soguk alginligi") {
		return "Cocuk doktoru" ;
		
		}if(aktuelDurum=="Migren") {
		return "Dahiliye";
		
		}if(aktuelDurum=="Kalp hastaliklari") {
		return "Kardiolog" ;
		}else 
		{
		return "yanlis unvan" ;
		}
	}
	
	
}
