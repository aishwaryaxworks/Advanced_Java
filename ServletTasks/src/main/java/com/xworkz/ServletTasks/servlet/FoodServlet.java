package com.xworkz.ServletTasks.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/food", loadOnStartup = 1)
public class FoodServlet extends HttpServlet {
	public FoodServlet() {
		System.out.println("Food servlet servlet...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do post in Food servlet...");

		String name = req.getParameter("name");
		System.out.println("Name:" + name);
		String vnv = req.getParameter("vnv");
		System.out.println("Vegetarian or Non-Vegetarian:" + vnv);
		String hotel = req.getParameter("hotel");
		System.out.println("Hotel Name:"+hotel);
		String quantity = req.getParameter("quantity");
		System.out.println("Quantity:"+quantity);
		String price = req.getParameter("price");
		
		int convPrice = Integer.parseInt(price);
		
		
		int convQuant = Integer.parseInt(quantity);
		req.setAttribute("Quantity", "Quantity is:" + convQuant);
		
		int total=0;
		if(convPrice>0 && convQuant>0) {
			total = convPrice * convQuant;
		}
		req.setAttribute("Price", "Price is:" + total);

		// adding data to request
		req.setAttribute("Key1", name); // sending data to next servlet
		req.setAttribute("Key2", vnv); // sending data to next servlet
		req.setAttribute("Key3", hotel);
		
		// request forwarding ---> sending request from one servlet to another --->
		// servlet chaining
		RequestDispatcher dispatcher = req.getRequestDispatcher("FoodSuccess.jsp");
		dispatcher.forward(req, resp); // performing chaining
	}
}
