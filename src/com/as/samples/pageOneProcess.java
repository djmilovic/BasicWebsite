package com.as.samples;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class pageOneProcess
 */
public class pageOneProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String add = request.getParameter("add");
		String phone = request.getParameter("phone");
	
		System.out.println("the name is:" + name);
		System.out.println("the address is:" + add);
		System.out.println("the phone is:" + phone);
	
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("add", add);
		request.getSession().setAttribute("phone", phone);

		response.sendRedirect("html/pageTwo.html");
	}
}
