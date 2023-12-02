package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		int kk = i+j+1;
//		PrintWriter out = res.getWriter();
//		out.println("The Result is "+k);
		
//		//ViaHTTPSession
//		HttpSession session = req.getSession();
//		session.setAttribute("k", kk);
//		session.setAttribute("fk", k);
		Cookie cookie = new Cookie("k",kk+"");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
		////via ReqDispatcher
		//req.setAttribute("kval", k);  
		//	RequestDispatcher rd = req.getRequestDispatcher("sq"); //sending data through HTTPreq
		//send redirect is also present to have an 2 sec delay and inform user or redirectin towards
		//sqServlet
//		rd.forward(req, res);
		
	}


}
