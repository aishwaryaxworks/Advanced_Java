package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/player", loadOnStartup=1)
public class PlayerServlet extends HttpServlet{
	
	public PlayerServlet() {
		System.out.println("No-arg constructor in playerServlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking service in PlayerServlet");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Invoking doPost in PlayerServlet");
		String name = req.getParameter("name");
		String sport = req.getParameter("sport");
		String country = req.getParameter("country");
		String captain = req.getParameter("captain");
		String jerseyno = req.getParameter("jerseyno");
		String coach = req.getParameter("coach");

		System.out.println("Name: " + name);
		System.out.println("Sport: " + sport);
		System.out.println("Country: " + country);
		System.out.println("Captain:" + captain);
		System.out.println("Jersey No: "+jerseyno);
		System.out.println("Coach: "+coach);

		req.setAttribute("Key1", name);
		req.setAttribute("Key2", sport);
		req.setAttribute("Key3", country);
		req.setAttribute("Key4", captain);
		req.setAttribute("Key5", jerseyno);
		req.setAttribute("Key6", coach);

		RequestDispatcher dispatcher = req.getRequestDispatcher("PlayerSuccess.jsp");
		dispatcher.forward(req, resp);

	}

}
