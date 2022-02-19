package Guru.Guru_study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Deneme1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/day11?serverTimezone=UTC", "root", "1234");
		
	    Statement st = con.createStatement();
	    st.execute("CREATE TABLE calisan("
			       + " id int,"
			       + " isim VARCHAR(10),"
			       + " fiyat double)"); 
		    
		    System.out.println("tablo olusturuldu");
		    
		//System.out.println("");    
		    
	}

}
