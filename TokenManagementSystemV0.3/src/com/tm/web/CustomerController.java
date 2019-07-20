package com.tm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;


@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	
    public CustomerController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out  = response.getWriter();
		response.setContentType("text/plain");
		
		//connection
		//load class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Declare Property
		String url = "jdbc:mysql://localhost:3306/db0";
		String username = "root";
		String password = "rotospin";
		
		Connection myCon = null;
		Statement myStat = null;
		ResultSet myRs = null;
		
			// Connection
		try {
			myCon = DriverManager.getConnection(url, username, password);
			
			// statement & query
			myStat = myCon.createStatement();
			String sql = "select * from users0";
			myRs = myStat.executeQuery(sql);
			
			//process result
			while(myRs.next()) {
				int id = myRs.getInt("id");
				out.print(id);
				String name = myRs.getString("name");
				out.print(name);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				myRs.close();
				myStat.close();
				myCon.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
