package proje1;
import java.sql.*;
public class Tablo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	Class.forName("com.mysql.cj.jdbc.Driver") ;
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day11?serverTimezone=UTC", "root", "1234");		
	Statement st = con.createStatement();		
		
	ResultSet tablo = st.executeQuery("select * from day11.sampledata_csv")	;
	
	while(tablo.next()) {
		System.out.println(tablo.getInt(1)+" "+tablo.getString("Name")+" "+tablo.getInt("Age"));
	}
		
		

	}

}
