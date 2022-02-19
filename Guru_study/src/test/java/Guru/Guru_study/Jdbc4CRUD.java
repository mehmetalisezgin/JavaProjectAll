package Guru.Guru_study;

import java.security.PKCS12Attribute;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxCrud.Update;

public class Jdbc4CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/day11?serverTimezone=UTC", "root", "1234");
		
	    Statement st = con.createStatement();
		
	    /*=======================================================================
		  ORNEK1: urunler adinda bir tablo olusturalim id int, 
		  isim VARCHAR(10) fiyat int 
		========================================================================*/ 
//		 
//		
	    
	/*st.execute("CREATE TABLE urunler("
		       + " id int,"
		       + " isim VARCHAR(10),"
		       + " fiyat double)"); 
	    
	    System.out.println("tablo olusturuldu");*/
	    
	    /*=======================================================================
//		  ORNEK2: urunler tablosuna asagidaki kayitlari toplu bir sekilde ekleyelim
//		========================================================================*/ 
		// Cok miktarda kayit eklemek icin PreparedStatement metodu kullanilabilir. 
		// PreparedStatement hem hizli hem de daha guvenli (SQL injection saldirilari icin) bir yontemdir. 
		// Bunun icin; 
		// 	1) Veri girisine uygun bir POJO(Plain Old Java Object) sinifi olusturulur.
		// 	2) POJO Class nesnelerini saklayacak bir collection olusturulur
		// 	3) bir dongu ile kayitlar eklenir.     
	/*List<Urun>kayitlar = new ArrayList<>();    
	kayitlar.add(new Urun(101,"laptop", 6500));
	kayitlar.add(new Urun(102,"PC", 4500));
	kayitlar.add(new Urun(103,"Telefon", 4500));
	kayitlar.add(new Urun(104,"Anakart", 1500));
	kayitlar.add(new Urun(105,"Klavye", 200));
	kayitlar.add(new Urun(106,"Fare", 100));  
	
  PreparedStatement veri=  con.prepareStatement("insert into urunler values(?,?,?)");
     
    for (Urun each : kayitlar) {
		veri.setInt(1, each.getId());
        veri.setString(2, each.getIsim());
        veri.setDouble(3, each.getFiyat());
       veri.addBatch();
	}

    veri.executeBatch();*/

    /*=======================================================================
	  ORNEK3: urunler tablosundaki PC'nin fiyatini %10 zam yapiniz
	========================================================================*/
  /* int s1 =  st.executeUpdate("update urunler set fiyat = fiyat*1.1 where isim = 'pc' ") ; 
     	System.out.println(s1+"satir guncellendi");	*/
     	/*=======================================================================
		  ORNEK6: urunler tablosuna Marka adinda ve Default degeri ASUS olan yeni 
		  bir sutun ekleyiniz.
		========================================================================*/
     	
   /* st.executeUpdate( "alter table urunler add marka varchar(10) default 'ASUS' ");
     
    System.out.println("yeni sutun eklendi");	*/
		
	
	/*=======================================================================
	  ORNEK7: urunler tablosunu siliniz.
	========================================================================*/ 
	    
	    st.executeUpdate("drop table urunler ") ; 
	    
	    System.out.println("tablo silindi");
	    
	    
	    st.close() ;
	    con.close();
	    
}
}