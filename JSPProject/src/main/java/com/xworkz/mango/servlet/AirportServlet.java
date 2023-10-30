package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/airport",loadOnStartup=1)
public class AirportServlet extends HttpServlet{
	public AirportServlet() {
		System.out.println("No-arg constructor in Airport Servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in Airport Servlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost in AirportServlet");
		
		String name = req.getParameter("name");
		String country = req.getParameter("country");
		String type = req.getParameter("type");
		String city = req.getParameter("city");
		String capacity = req.getParameter("capacity");
		String width = req.getParameter("width");
		String terminal = req.getParameter("terminal");
		String opendate = req.getParameter("opendate");
		String operational = req.getParameter("operational");
		String inaugurated = req.getParameter("inaugurated");
		

		System.out.println("Name: " + name);
		System.out.println("Country: " + country);
		System.out.println("Type: " + type);
		System.out.println("City: " + city);
		System.out.println("Capacity: "+capacity);
		System.out.println("Width: "+width);
		System.out.println("Terminal: "+terminal);
		System.out.println("OpenDate: "+opendate);
		System.out.println("Operational: "+operational);
		System.out.println("Inaugurated By: "+inaugurated);
		
		

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", country);
		req.setAttribute("Key3",type);
		req.setAttribute("Key4", city);
		req.setAttribute("Key5",capacity );
		req.setAttribute("Key6",width );
		req.setAttribute("Key7",terminal);
		req.setAttribute("Key8",opendate);
		req.setAttribute("Key9",inaugurated);
		
		

		RequestDispatcher dispatcher = req.getRequestDispatcher("AirportSuccess.jsp");
		dispatcher.forward(req, resp);

	}

	@Override
	public void destroy() {
		System.out.println("Invoking destroy in Airport Servlet");
		super.destroy();
	}

}
