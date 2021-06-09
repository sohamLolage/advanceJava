package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletConfigEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletConfigEx() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		ServletConfig cfg=getServletConfig();
		String name=cfg.getInitParameter("Myname");
		pw.println("My name is "+name);
		
	}

}
