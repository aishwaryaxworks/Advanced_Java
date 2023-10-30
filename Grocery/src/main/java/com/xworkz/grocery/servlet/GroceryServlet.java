package com.xworkz.grocery.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repo.GroceryRepo;
import com.xworkz.grocery.repo.GroceryRepoImpl;
import com.xworkz.grocery.service.GroceryService;
import com.xworkz.grocery.service.GroceryServiceImpl;

@WebServlet(urlPatterns = "/cart", loadOnStartup = 1)
public class GroceryServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		System.out.println("Name:"+name);
		String type = req.getParameter("type");
		System.out.println("Type:"+type);
		String price = req.getParameter("price");
		double convPrice = Double.parseDouble(price);
		System.out.println("Price:"+convPrice);
		String quantity = req.getParameter("quantity");
		int convQuant = Integer.parseInt(quantity);
		System.out.println("Quantity:"+convQuant);
		
		//creating service
		GroceryRepo grepo = new GroceryRepoImpl();
		GroceryService gserv = new GroceryServiceImpl();
		GroceryDTO gdto = new GroceryDTO(name,type,convPrice,convQuant);
		boolean save = gserv.validateandsave(gdto);
		if (save) {
			System.out.println("Grocery is saved...");
			req.setAttribute("msg1", "Grocery is saved...");
		} else {
			System.out.println("Grocery not saved...");
			req.setAttribute("msg2", "Grocery not saved...");
		}
		
		RequestDispatcher dispatch = req.getRequestDispatcher("Item added to cart!");
	}
}
