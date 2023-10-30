package com.xworkz.waste.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.repository.WasteRepositoryImpl;
import com.xworkz.waste.service.WasteService;
import com.xworkz.waste.service.WasteServiceImpl;

@WebServlet(urlPatterns = "/save", loadOnStartup = 1)
public class WasteServlet extends HttpServlet {
//constructor
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// get parameters
		String name = req.getParameter("name");
		System.out.println("Name:"+name);
		String type = req.getParameter("type");
		System.out.println("Type:"+type);
		String weight = req.getParameter("weight");
		double convWeight = Double.parseDouble(weight);
		// converted weight ---> Double.parseDouble(weight)
		req.setAttribute("Name", name);
		req.setAttribute("Type", type);
		req.setAttribute("Weight", weight);
		
		// creating service
		WasteRepository wrepo = new WasteRepositoryImpl();
		WasteService wserv = new WasteServiceImpl(wrepo);
		WasteDTO dto = new WasteDTO(name, type, convWeight);
		boolean save = wserv.validateandsave(dto);
		if (save) {
			System.out.println("Waste is saved...");
			req.setAttribute("msg1", "Waste is saved...");
		} else {
			System.out.println("Waste not saved...");
			req.setAttribute("msg2", "Waste not saved...");
		}

		RequestDispatcher dispatch = req.getRequestDispatcher("WasteSuccess.jsp");
		dispatch.forward(req, resp);
	}

}
