package com.jsp.jdbc_simple_project.controller;

//import java.beans.Statement;
import java.security.DomainCombiner;
import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class StudentInsertController {

	public static void main(String[] args) {
		 
		Connection connection=null;
		try {
			//step1 load/register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step2 Create connection
			String url = "jdbc:mysql://localhost:3360/jdbc-10am";
			String user="root";
			String pass="root";
			
			 connection=DriverManager.getConnection(url,user,pass);
			 
			 //step3 Create Statement
			 Statement statement=connection.createStatement();
			 
			 //step4 Execute Query
			 
			 String insertStudentQuery = "insert into student (id,name,email,phone)values(430,'amit','amit@gmail.com',7985536744)";
			 statement.execute(insertStudentQuery);
			 

			 
			 System.out.println("+++++++++++++++=Data--------------Stored+++++++++++++");
		} catch(ClassNotFoundException | SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				//step5 close the connection
					connection.close();
				}catch (SQLException e) {
					//TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}



