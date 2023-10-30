package com.xworkz.mango.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/season", loadOnStartup = 1)

//Season servlet ---> http servlet : dynamic resource
public class SeasonServlet extends HttpServlet{
	public SeasonServlet() {
		System.out.println("no arg constructor... Season servlet started...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init in season servlet...");
		super.init(config);
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service in season servlet...");
		super.service(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in season servlet...");
		
		/*
		 * Cookie cookies[] = req.getCookies(); for(Cookie cookie[] : cookies) {
		 * System.out.println("Cookie:"+cookies); }
		 */
		
		String country = req.getParameter("country");
		System.out.println("country:"+country);
		String season = req.getParameter("season");
		System.out.println("Season:"+season);
		String months = req.getParameter("months");
		int convMonths = Integer.parseInt(months);
		if(convMonths>3) {
			req.setAttribute("Message", "Season is "+months+" months long...");
		}
		
		//adding data to request
		req.setAttribute("Key1", country);   //sending data to next servlet
		req.setAttribute("Key2", season);   //sending data to next servlet
		
		//Creating cookies
		Cookie c = new Cookie("X-workz", String.valueOf(Math.random()));
		resp.addCookie(c);
		
		//request forwarding ---> sending request from one servlet to another ---> servlet chaining
		RequestDispatcher dispatcher = req.getRequestDispatcher("Success.jsp");
		dispatcher.forward(req, resp);  //performing chaining
		
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy in season servlet...");
		super.destroy();
	}
}
