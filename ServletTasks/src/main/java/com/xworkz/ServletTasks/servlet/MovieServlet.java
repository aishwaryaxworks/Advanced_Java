package com.xworkz.ServletTasks.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/movie")
public class MovieServlet extends HttpServlet{
	public MovieServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Do get method in Movies servlet...");
		
		String name = req.getParameter("name");
		System.out.println("Movie name:"+name);
		
		String lang = req.getParameter("lang");
		System.out.println("Language:"+lang);
		
		String direct = req.getParameter("direct");
		System.out.println("Director:"+direct);
		
		String produc = req.getParameter("produc");
		System.out.println("Producer:"+produc);
		
		String budget = req.getParameter("budget");
		System.out.println("Budget:"+budget);
		
		String reldate = req.getParameter("reldate");
		System.out.println("Release Date:"+reldate);
		
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		pw.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<title>Movie Details</title>\r\n"
				+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9\" crossorigin=\"anonymous\">\r\n"
				+ "<style>\r\n"
				+ "body {\r\n"
				+ "	background-image:url(\"https://t4.ftcdn.net/jpg/06/15/65/79/240_F_615657908_oeTA7C9ytiVkYtF82yKvgl9oKFvdxV7X.jpg\"); ;\r\n"
				+ "	background-repeat: no-repeat;\r\n"
				+ "	background-size: 900px;\r\n"
				+ "	/\r\n"
				+ "	font-size: medium;\r\n"
				+ "}\r\n"
				+ ".right{\r\n"
				+ "    float: right;\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body bgcolor=\"gray\">\r\n"
				+ "<nav class=\"navbar bg-dark border-bottom border-body\" data-bs-theme=\"dark\">\r\n"
				+ "	<ul class=\"nav justify-content-center\">\r\n"
				+ "		<li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">Home</a></li>\r\n"
				+ "		<li class=\"nav-item\"><a class=\"nav-link\" href=\"Movie.html\">Movie</a></li>\r\n"
				+ "		<li class=\"nav-item\"><a class=\"nav-link\" href=\"Register.html.html\">Register</a></li>\r\n"
				+ "	</ul>\r\n"
				+ "</nav>");
		pw.print("<h3>These are the saved movie details...</h3>\r\n");
		pw.print("\r\nName:"+name);
		pw.println("<br>");
		pw.print("\r\nLanguage:"+lang);
		pw.println("<br>");
		pw.print("\r\nDirector:"+direct);
		pw.println("<br>");
		pw.print("\r\nProducer:"+produc);
		pw.println("<br>");
		pw.print("\r\nBudget:"+budget);
		pw.println("<br>");
		pw.print("\r\nRelease Date:"+reldate);
		pw.println("<br>");
		pw.print("\r\nSaved succesfully...!");
		pw.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
	}

}
