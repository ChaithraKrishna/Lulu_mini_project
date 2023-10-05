package com.lulu.database.crud_product;
import java.sql.SQLException;


public class ControllerTester {

			

			public static void main(String[] args) throws SQLException {

				// TODO Auto-generated method stub

		 

				BusinessLogic bl= new BusinessLogic();
				
				
				
				//bl.readData();
		     	bl.createData();

				bl.readData();

		     	bl.deletData();

		    	bl.readData();

				bl.updateData();

				bl.readData();

		 

		 

			}

			

		 

		
		// TODO Auto-generated method stub

	}


