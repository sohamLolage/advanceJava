package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ContextServletEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public ContextServletEx() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext ctx=getServletContext();
		String mail=ctx.getInitParameter("ComapanyMail");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("username");
		pw.println("Welcome to context demo "+name);
		pw.println("Comapny mail " +mail);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
