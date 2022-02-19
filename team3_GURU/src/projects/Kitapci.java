package projects;

public class Kitapci {
private 	int no ;
private	String kitapAdi ; 
private	String yazarAdi ;
private	int yayinyili ; 
/**
 * 
 */
public Kitapci(int no, String kitapAdi,String yazarAdi,int yayinyili,double fiyat) {
	this.no=no;
	this.kitapAdi=kitapAdi;
	this.yazarAdi=yazarAdi;
	this.yayinyili=yayinyili;
	this.fiyat=fiyat ;
}
private	double fiyat ;
	
	// 
	

	public int getNo() {
	return no;
}

   public void setNo(int no) {
	this.no = no;
}

   public String getKitapAdi() {
	return kitapAdi;
}

  public void setKitapAdi(String kitapAdi) {
	this.kitapAdi = kitapAdi;
}

  public String getYazarAdi() {
	return yazarAdi;
}

   public void setYazarAdi(String yazarAdi) {
	this.yazarAdi = yazarAdi;
}

  public int getYayinyili() {
	return yayinyili;
}

  public void setYayinyili(int yayinyili) {
	this.yayinyili = yayinyili;
}

  public double getFiyat() {
	return fiyat;
}

public void setFiyat(double fiyat) {
	this.fiyat = fiyat;
}

	public static void main(String[] args) {
		

	}

}
