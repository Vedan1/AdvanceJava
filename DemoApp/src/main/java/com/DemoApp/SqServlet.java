package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet{

public void doGet(HttpServletRequest req, HttpServletResponse res) 
	throws IOException, ServletException{
	//Via-Cookie
	Cookie cookie[]=req.getCookies();
	int k=0;
	for(Cookie c : cookie) {
		if(c.getName().equals("k"))
			k=Integer.parseInt(c.getValue());
	}
	
	//via ReqDispatcher
	//	int k =(Integer) req.getAttribute("kval");	
	
	//HTTPSessionData Fetch
//	HttpSession session = req.getSession();
//	int k = (Integer) session.getAttribute("fk");
//	int newk = (Integer) session.getAttribute("k");
	
	PrintWriter pw = res.getWriter();
//	pw.println("The Addition and Square is : "+ (k*k));
	pw.print("<html><body bgcolor = cyan>");
	pw.println("The Addition and Square with Cookie is : "+ (k*k));
	pw.print("</body></html>");
	
	
	
	//pw.println("Welcummm Asshole : ");
//	pw.println("The Addition and Square with + 1 is : "+ (newk*newk));
	}
	
}
