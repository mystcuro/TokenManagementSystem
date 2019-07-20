package com.tm.web;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class CustomersDataBase {
	
	//List<Customer> customers = new ArrayList<>(); was here log1
	
	public List<Customer> getCustomers() throws Exception {
		
		List<Customer> customers = new ArrayList<>(); //moved here
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

	public void addCustomer(Customer theCustomer) throws Exception {
		//Data Base Connecting objects
		Connection myCon = null;
		PreparedStatement myStat = null;
		try {
			// load class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    //Declare Property
			String url = "jdbc:mysql://localhost:3306/db0";
			String username = "root";
			String password = "rotospin";
			myCon = DriverManager.getConnection(url, username, password);
			
			// 2. Create Statements
			String sql = "insert into users0 "
					   + "(id, name) "
					   + "values (?, ?)";
			
			myStat = myCon.prepareStatement(sql);
			
			// set the param values for the student
			myStat.setInt(1, theCustomer.getId());
			myStat.setString(2, theCustomer.getcName());
			
			// execute sql insert
			myStat.execute();
			
			
		}
		
		
		finally {
			close(myCon,myStat,null);
		}
		
		
	}

	public void deleteCustomer() throws Exception {
		
		//Data Base Connecting objects
		Connection myCon = null;
		PreparedStatement myStat = null;
		try {
			// load class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		    //Declare Property
			String url = "jdbc:mysql://localhost:3306/db0";
			String username = "root";
			String password = "rotospin";
			myCon = DriverManager.getConnection(url, username, password);
			
			// 2. Create Statements
			String sql = "delete from users0 limit 1;";
			
			myStat = myCon.prepareStatement(sql);
					
			// execute sql delete
			myStat.execute();	
		}
		
		
		finally {
			close(myCon,myStat,null);
		}		
	}
	
	
	
	
	
}

