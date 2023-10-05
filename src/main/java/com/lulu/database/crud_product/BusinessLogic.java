package com.lulu.database.crud_product;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;

public class BusinessLogic {
	
	
	
	
		void createData() {

		}

		void readData() throws SQLException {
			Connection connection=ConnectDB.setupConnection();
			
			 Statement statement;
			 statement = connection.createStatement();
	         ResultSet resultSet;
	         resultSet = statement.executeQuery(
	             "select * from product_01 where id>=111");
	        
	         int id;
	         
	         int cost;

	         String name;

	         String  description;
	         
	         

	         while (resultSet.next()) {

	             id = resultSet.getInt("id");
	             
	             cost = resultSet.getInt("cost");

	             name = resultSet.getString("name");

	             description =resultSet.getString("description");

	             System.out.println("id : " + id

	                                + " cost : " + cost +" name : " + name +" description:"+ description);

	             
	             
			
	         }
		}
		
		
		void insertData() throws SQLException {

			Connection connection = ConnectDB.setupConnection();

			String query = "INSERT INTO  product_01(id,cost,name,description) VALUES (666, 300,'LipStick','Good Product')";

			PreparedStatement myStmt = connection.prepareStatement(query);

			boolean success = myStmt.execute();

			System.out.println("insert Successfully " + success);

		}

		
		
		
			void updateData() throws SQLException   {

				Connection connection = ConnectDB.setupConnection();

				String query = "update product_01 set name= ? where id = ? ";

				PreparedStatement myStmt = connection.prepareStatement(query);

				myStmt.setString(1, "Sports Wear");

				myStmt.setInt(2, 222);

				boolean success = myStmt.execute();

				System.out.println("Updated Successfully " + success);

		 
			
			
			
			
			
			
		}
		
			
			void deletData() throws SQLException  {

				Connection connection = ConnectDB.setupConnection();

				String query = "delete from product_01 where id = ? ";

				PreparedStatement myStmt = connection.prepareStatement(query);

				myStmt.setInt(1, 333);

				boolean success = myStmt.execute();

				System.out.println("Deleted Successfully " + success);

		 

			
		}
}
	


	
