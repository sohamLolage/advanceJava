package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ThirdServlet implements Servlet {

	private ServletConfig cfg;
    public ThirdServlet() {
    	
    	System.out.println("I am in const");
    }

	public void init(ServletConfig config) throws ServletException {
		this.cfg=config;
		System.out.println("I am in init");
	}
	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Distroy object...");
	}
	
	public ServletConfig getServletConfig() {
		
		return cfg;
	}
	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("I am in service method..... ");
		
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String name=req.getParameter("username");
		pw.println("Welcome to third servlet "+name);
		
	}

}
