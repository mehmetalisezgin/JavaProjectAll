package Guru.Guru_study;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Guru {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver") ;
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day11?serverTimezone=UTC", "root", "1234");		
Statement st1 = con.createStatement();		
ResultSet veri = st1.executeQuery("SELECT * from day11.sampledata_csv ");			
while(veri.next()) {
    System.out.println("Name : "+ veri.getString("Name")+"     Country : "+veri.getString("Country")+
   		 "      Age :"+veri.getInt("Age")+"      Salary :"+veri.getInt("Salary")+"     JobTitle: "+veri.getString("JobTitle")) ;  
     		
      }		
while(veri.next()) {
	
}

	}



}
