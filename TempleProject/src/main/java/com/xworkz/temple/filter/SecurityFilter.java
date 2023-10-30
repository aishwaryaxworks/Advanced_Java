//package com.xworkz.temple.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebFilter(urlPatterns = "/*")
//public class SecurityFilter implements Filter{
//	
//	public SecurityFilter() {
//		System.out.println("Created Security filter...");
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		System.out.println("Running do filter in security filter...");
//		
//		HttpServletRequest req = (HttpServletRequest) request;
//		HttpServletResponse res = (HttpServletResponse) response;
//		String uri = req.getRequestURI();
//		System.out.println("URI is :"+ uri);
//		
//		//Head first servlet & jsp
//		if(uri.endsWith("login") || uri.endsWith("/index.jsp") || uri.endsWith("/")) {
//			System.out.println("URI is default or index");
//			if(uri.endsWith("login")) {
//				String userId = req.getParameter("userId");
//				String password = req.getParameter("secret");
//				if(userId.equals("Xworkz") && password.equals("btm")) {
//					System.out.println("User is valid, go to grocery page...");
//					Cookie cookie = new Cookie("Xworkz",String.valueOf(Math.random()));
//					res.addCookie(cookie);
//					res.sendRedirect("Temple.jsp");
//					return;
//				}else {
//					req.setAttribute("error", "User id or password is not matching...");
//					res.sendRedirect("Login.jsp");
//					return;
//				}
//			}
//			chain.doFilter(request, response);
//		}else {
//			Cookie[] cookies = req.getCookies();
//			for(Cookie cookie : cookies) {
//				if(cookie.getName().equals("Xworkz")) {
//					System.out.println("User already logged in...");
//					chain.doFilter(request, response);
//					return;
//				}
//			}
//			System.err.println("You cannot access the page");
//			res.sendRedirect("Login.jsp");
//		}
//	}
//
//}
