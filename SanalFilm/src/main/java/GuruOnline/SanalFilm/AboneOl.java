package GuruOnline.SanalFilm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class AboneOl {
	
	String name ;
	int age ;
	Object username ;
	int passwords;
	String cartNo;
	
	
	
	
	
	
	
	
	public AboneOl(String name, int age, Object username, int passwords, String cartNo) {
		super();
		this.name = name;
		this.age = age;
		this.username = username;
		this.passwords = passwords;
		this.cartNo = cartNo;
	}
	
	public  AboneOl() {
		
	} 
		
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Object getUsername() {
		return username;
	}
	public void setUsername(Object username) {
		this.username = username;
	}
	public int getPasswords() {
		return passwords;
	}
	public void setPasswords(int passwords) {
		this.passwords = passwords;
	}
	public String getCartNo() {
		return cartNo;
	}
	public void setCartNo(String cartNo) {
		this.cartNo = cartNo;
	}
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinefilm?serverTimezone=UTC", "root",
					"1234");
	    Statement st = con.createStatement() ;
	    
	    AboneOl abone = new AboneOl();
	    AboneOl a = new AboneOl(abone.getName(),abone.getAge(),abone.getUsername(),abone.getPasswords(),abone.getCartNo());
	   
	    
	    
	    ResultSet veri = st.executeQuery("select * from onlinefilm");
	    
	    while(veri.next()){
	    	st.execute("CREATE TABLE users"+ "name varchar(20), " + "age int varchar(5)")
	    }
	    
	      

	    
	    
	    

	    
	
	    
	    
	    
	    
	}
	
	
	
	

}
