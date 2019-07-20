package com.tm.web;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class CustomersDataBase {
	
	List<Customer> customers = new ArrayList<>();
	
	public List<Customer> getCustomers() throws Exception {
		
		 	
		//Data Base Connecting objects
		Connection myCon = null;
		Statement myStat = null;
		ResultSet myRs = null;
		
		try{
			// load class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    //Declare Property
			String url = "jdbc:mysql://localhost:3306/db0";
			String username = "root";
			String password = "********";
			myCon = DriverManager.getConnection(url, username, password);
		
			// 2. Create Statements
			String sql = "SELECT * FROM users0;";
			myStat = myCon.createStatement();
			
			
			// 3. Execute
			myRs = myStat.executeQuery(sql);
			
			
			// 4. Processing Data
			while(myRs.next()) {
				int id = myRs.getInt("id");
				String cName = myRs.getString("name");
				
			// 5. Create customer object
				Customer tCustomer = new Customer(id,cName);
			// 6. Add this customer info to list
				customers.add(tCustomer);
			}
		return customers;
		}
		finally {
			
			// 5. Closing Objects
			close(myCon,myStat,myRs);
		}
		
		
	}

	private void close(Connection myCon, Statement myStat, ResultSet myRs) {
		// TODO Auto-generated method stub
		try {
			if(myCon!=null) {
				myCon.close();
			}
			if(myStat!=null) {
				myStat.close();
			}
			if(myRs!=null) {
				myRs.close();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
}

