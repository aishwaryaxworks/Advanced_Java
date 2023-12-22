package com.xworkz.college;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.service.CollegeService;
import com.xworkz.college.service.CollegeServiceImpl;


@WebServlet(urlPatterns = "/save", loadOnStartup = 1)
public class CollegeServlet extends HttpServlet{
	
	private String name;
	private String location;
	private String noOfStudents;
	private String noOfStaffs;
	private CollegeDto dto;
	
	CollegeService service = new CollegeServiceImpl();
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
//		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		writer.print("<!DOCTYPE html>\r\n" + "<html>\r\n"
				+ "    <head>\r\n"
				+ "        <style>\r\n"
				+ "            input {\r\n"
				+ "                padding: 10px;\r\n"
				+ "                margin: 10px;\r\n"
				+ "            }\r\n"
				+ "        </style>\r\n"
				+ "        <title></title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "        <div style=\"text-align: center;\">\r\n"
				+ "        <h1>Create An Account for college</h1>\r\n"
				+ "        <form action=\"save\" method=\"post\" >\r\n"
				+ "            <div><input type=\"text\" name=\"name\" placeholder=\"Name\"></div>\r\n"
				+ "            <div><input type=\"text\" name=\"location\" placeholder=\"Location\"></div>\r\n"
				+ "            <div><input type=\"number\" name=\"noOfStudents\" placeholder=\"No of Students\"></div>\r\n"
				+ "            <div> <input type=\"number\" name=\"noOfStaffs\" placeholder=\"No of Staffs\"></div>\r\n"
				+ "            <div><button type=\"submit\">Create Account</button></div>\r\n"
				+ "        </form>\r\n"
				+ "    </div>\r\n"
				+ "    </body>\r\n"
				+ "</html>");
		req.getRequestDispatcher("read").include(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String location = req.getParameter("location");
		String noOfStudents = req.getParameter("noOfStudents");
		int students = Integer.parseInt(noOfStudents);
		
		String noOfStaffs = req.getParameter("noOfStaffs");
		int staff = Integer.parseInt(noOfStaffs);
		
		
		CollegeDto dto = new CollegeDto(name, location, students, staff);
//		dto=this.dto;
//		System.out.println(this.dto);
//		
		service.save(dto);
		resp.sendRedirect(req.getContextPath()+"/save");
		
	}
	
	

}
