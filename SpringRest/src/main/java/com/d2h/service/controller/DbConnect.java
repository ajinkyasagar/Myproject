/**
 * 
 */
package com.d2h.service.controller;
import java.sql.*;

import org.springframework.util.StringUtils;
/**
 * @author Hemant
 *
 */
public class DbConnect {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println((StringUtils.hasLength(null)));
		String url = "jdbc:mysql://198.38.86.85:3306/"; 
		String dbName = "grocbee_homedb";
		String driver = "com.mysql.jdbc.Driver"; 
		String userName = "grocbee_admin"; 
		String password = "root1234"; 
		try { 
		Class.forName(driver).newInstance(); 
		Connection conn = DriverManager.getConnection(url+dbName,userName,password); 
		
		Statement statement = conn.createStatement();
	      // Result set get the result of the SQL query
	      ResultSet resultSet = statement
	          .executeQuery("select * from address");
	      while (resultSet.next()) {
		      // It is possible to get the columns via name
		      // also possible to get the columns via the column number
		      // which starts at 1
		      // e.g. resultSet.getSTring(2);
		      String user = resultSet.getString("addressId");
		      System.out.println("addressId: " + user);
	      }
	      
	      
		conn.close(); 
		System.out.println("I am done");
		} catch (Exception e) { 
		e.printStackTrace(); 
		}
	}

}
