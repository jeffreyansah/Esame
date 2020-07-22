package it.enaip.cinema;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceFactory {
	private Connection conn=null;
	
	

	private DataSourceFactory() {
	}
	public Connection getOracleDBConnection() {
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");

	        conn = DriverManager.getConnection(
	        		"jdbc:oracle:thin:@localhost:1521:xe"
	        		,"JEFF"
	        		,"1234"
	        		);
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	        System.out.println("ERRORE");
	    }
	   
	 return  conn;
	}
	
	public static class DataSourceSingleton{
		private static final DataSourceFactory INSTANCE= new DataSourceFactory();
	}
	public static DataSourceFactory getInstance() {
		return DataSourceSingleton.INSTANCE;
	}
}
