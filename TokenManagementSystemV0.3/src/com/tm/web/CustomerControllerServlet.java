package com.tm.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CustomerControllerServlet
 */
@WebServlet("/CustomerControllerServlet")
public class CustomerControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CustomersDataBase customersDataBase;
	
	

	@Override
	public void init() throws ServletException {
		super.init();
		customersDataBase = new CustomersDataBase();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// listing the customers in MVC style
		try {
			listCustomers(request,response);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
	
		
	}


	private void listCustomers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		// get customers
		List<Customer> customers = customersDataBase.getCustomers();
		
		//set attribute
		request.setAttribute("CUSTOMERS_LIST", customers);
		//send views
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-customers.jsp");
		dispatcher.forward(request, response);		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
