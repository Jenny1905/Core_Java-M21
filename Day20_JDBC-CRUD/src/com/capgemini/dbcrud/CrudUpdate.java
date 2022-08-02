package com.capgemini.dbcrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudUpdate {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3306/capgemini";
		String dbUsername="root";
		String dbPassword="jenny";
		try
		{
			Connection c=DriverManager.getConnection(dbURL, dbUsername, dbPassword);
			//to update a rows
			String query="UPDATE EMPLOYEE SET NAME=?,EMAIL_ID=? WHERE ID=?";
			PreparedStatement p=c.prepareStatement(query);
			
			p.setString(1, "Parag");
			p.setString(2, "paragkulkarni@gmail.com");
			p.setInt(3, 121);
			int r=p.executeUpdate();
			//if row>0 means at-least some rows are there
			if(r>0)
			{
				System.out.println("A new user is updated successfully");
			}
			c.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}


	

}
