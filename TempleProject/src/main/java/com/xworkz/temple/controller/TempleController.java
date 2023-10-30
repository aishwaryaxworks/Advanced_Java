package com.xworkz.temple.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepo;
import com.xworkz.temple.repository.TempleRepoImpl;
import com.xworkz.temple.service.TempleService;
import com.xworkz.temple.service.TempleServiceImpl;

@WebServlet(urlPatterns = { "/visit", "/total", "/view" })
public class TempleController extends HttpServlet {
	private TempleRepo trepo = new TempleRepoImpl();
	private TempleService tserv = new TempleServiceImpl(trepo);

	public TempleController() {
		System.out.println("Created Temple Servlet...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String place = req.getParameter("place");
		String mainGod = req.getParameter("mainGod");
		String constYear = req.getParameter("constYear");
		int convYear = Integer.parseInt(constYear);
		String constBy = req.getParameter("constBy");

		TempleDTO tdto = new TempleDTO(name, place, mainGod, convYear, constBy);
		tserv.validateandsave(tdto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("Temple.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet");
		String uri = req.getRequestURI();

		if (uri.endsWith("/total")) {
			req.setAttribute("total", this.tserv.total());
			req.getRequestDispatcher("Temple.jsp").forward(req, resp);
		} else if (uri.endsWith("/view")) {
			req.setAttribute("view", this.tserv.getAll());
			req.getRequestDispatcher("TempleView.jsp").forward(req, resp);
		}
	}

}
