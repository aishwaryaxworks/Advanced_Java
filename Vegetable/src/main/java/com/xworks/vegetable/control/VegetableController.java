package com.xworks.vegetable.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworks.vegetable.dto.VegetableDTO;
import com.xworks.vegetable.repository.VegetableRepo;
import com.xworks.vegetable.repository.VegetableRepoImpl;
import com.xworks.vegetable.service.VegetableService;
import com.xworks.vegetable.service.VegetableServiceImpl;

@WebServlet(urlPatterns = {})
public class VegetableController extends HttpServlet{
	private VegetableRepo vrepo = new VegetableRepoImpl();
	private VegetableService vserv = new VegetableServiceImpl(vrepo);
	
	public VegetableController() {
		System.out.println("Vegetable controller servlet sunning...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int id1 = Integer.parseInt(id);
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		double price1 = Double.parseDouble(price);
		String weight = req.getParameter("weight");
		double weight1 = Double.parseDouble(weight);
		
		VegetableDTO vdto = new VegetableDTO(id1, name, price1, weight1);
		vserv.validateandsave(vdto);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet");
		String uri = req.getRequestURI();

		if (uri.endsWith("/total")) {
			req.setAttribute("total", this.vserv.total());
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		} else if (uri.endsWith("/view")) {
			req.setAttribute("view", this.vserv.getAll());
			req.getRequestDispatcher("VegetableView.jsp").forward(req, resp);
		}
	}
}
