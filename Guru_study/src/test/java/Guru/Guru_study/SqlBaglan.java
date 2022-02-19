package Guru.Guru_study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlBaglan {
	Statement st;
	Connection con ;
	public void sqlBagla() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver") ;
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day11?serverTimezone=UTC", "root", "1234");		
				Statement st = con.createStatement();	
	}
	public void tabloOlustur(String tabloadi,String degiskenler) throws SQLException {
		
		String olustur = "create table isciler(id int primary ley,brim varchar(10).maas int";
		String tablo = "create"+tabloadi+" "+degiskenler;
	 st.execute(olustur);
	}

}
