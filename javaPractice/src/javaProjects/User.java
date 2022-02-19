package javaProjects;

import java.time.LocalDateTime;

public class User {
     String name; // instance variable 
     LocalDateTime  registerDate ;
     public User() {
    	 
     }
     // bu class dan bir obje olsuturalim
     // egr obje olusturcaksak bir constructor olusturmamiz gerekir// suan icin defaul ama parametreli
     //istiyorsak kendimiz yapacagiz
      
     public User(String name,LocalDateTime  registerDate ) {
    	this.name = name ;
    	this.registerDate = registerDate;
    	 
    	 
     }
      
      
      
}
