package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SingletonConnection {
    private static Connection connection;

    static {
    	try {  
    		   Class.forName("com.mysql.cj.jdbc.Driver"); 
    		   connection= DriverManager.getConnection 
    		     ("jdbc:mysql://localhost:3306/DB_MVC_CAT","root",""); 
    		  } catch (Exception e) { 
    		    
    		   e.printStackTrace(); 
    		  } 
    }

    public static Connection getConnection() {
        return connection;
    }
    public static void main(String[] args) {
        System.out.println(getConnection() != null ? "Connexion réussie !" : "Échec de connexion !");
    }
}
