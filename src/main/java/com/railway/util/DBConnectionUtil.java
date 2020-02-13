package com.railway.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
	private static String url = "jdbc:sqlserver://localhost:1433;databaseName=Passengers;integratedSecurity=true;";
	private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static String username = "sharukh-pt3449";
	private static String password = "Iyya0510";
	private static Connection con = null;
	
	public static Connection OpenCon(){
		if(con!=null)
			return con;
		else{
			try{
				Class.forName(driver);
				con = DriverManager.getConnection(url,username,password);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return con;
	}
}
