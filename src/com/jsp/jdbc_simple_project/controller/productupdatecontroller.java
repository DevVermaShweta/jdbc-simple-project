package com.jsp.jdbc_simple_project.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class productupdatecontroller {
	
	public static void main (String[] args) {
		Connection connection=null;
		try {
			//step1 load/register Driver
			Driver driver= new Driver();
			DriverManager.registerDriver(driver);
			//step2 create connection
			String url = "jdbc:mysql://localhost:3306/jdbc-preparedstatement";
			String user = "root";
			String pass = "12shweta";
			
			connection = DriverManager.getConnection(url,user,pass);
			//step3 create statement
			Statement statement = connection.createStatement();
			//step4 execute Query
			String updateProductQuery = "update product set price=400 where id=103";
				
			int a=statement.executeUpdate(updateProductQuery);
			System.out.println("a = "+a);
			if(a==1) {
				System.out.println("Data---update");
			}
			else {
				System.out.println("given id is not present");
			}
		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//step5 close connection
			try {
				connection.close();
			} catch (SQLException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
