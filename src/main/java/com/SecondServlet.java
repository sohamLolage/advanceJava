package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondServlet extends GenericServlet 
{
	
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res) throws IOException
	{
		System.out.println("I am in service");
		PrintWriter pw=res.getWriter();
		String nm=req.getParameter("username");
		//String pass=req.getParameter("pass");
		pw.println("Welcome to second sevlet "+nm);
	}

}
