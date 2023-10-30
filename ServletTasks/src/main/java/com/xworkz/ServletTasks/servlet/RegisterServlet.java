package com.xworkz.ServletTasks.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register", loadOnStartup = 1)
public class RegisterServlet extends HttpServlet{
	public RegisterServlet() {
		System.out.println("Register servlet started...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in register servlet");
		String name = req.getParameter("name");
		String surname = req.getParameter("surname");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String confirmPassword = req.getParameter("confirmPassword");
		
		PrintWriter pw = resp.getWriter();
		pw.println("Name:".concat(name).concat(" ").concat("Surname:").concat(surname).concat(" ").concat("Email:").concat(email).concat(" ").concat("Password:").concat("XXXXXX").concat(" ").concat("Confirm Password:").concat("XXXXXX"));
		pw.println("Saved successfully...!");
		}

}
