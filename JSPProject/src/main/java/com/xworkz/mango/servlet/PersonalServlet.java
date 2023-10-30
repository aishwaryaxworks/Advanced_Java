package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/personal",loadOnStartup=1)
public class PersonalServlet extends HttpServlet{
	
	public PersonalServlet() {
		System.out.println("No-arg constructor in PersonalServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in PersonalServlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost in PersonalServlet");
		String father = req.getParameter("father");
		String mother = req.getParameter("mother");
		String wife = req.getParameter("wife");
		String age = req.getParameter("age");
		String alive = req.getParameter("alive");
		String married = req.getParameter("married");
		String dob = req.getParameter("dob");

		System.out.println("Father name: " + father);
		System.out.println("Mother name: " + mother);
		System.out.println("Wife name: " + wife);
		System.out.println("Age:" + age);
		System.out.println("Alive: "+alive);
		System.out.println("Married: "+married);
		System.out.println("DateOfBirth: "+dob);

		req.setAttribute("Key1", father);
		req.setAttribute("Key2", mother);
		req.setAttribute("Key3", wife);
		req.setAttribute("Key4", age);
		req.setAttribute("Key5", alive);
		req.setAttribute("Key6", married);
		req.setAttribute("Key7", dob);

		RequestDispatcher dispatcher = req.getRequestDispatcher("PersonalSuccess.jsp");
		dispatcher.forward(req, resp);

	}
	
	@Override
	public void destroy() {
		System.out.println("Invoking destroy in PersonalServlet");
		super.destroy();
	}

}
