package com.DemoApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {

       
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		Map<String,String> user = new HashMap<>();
		user.put("vedant","vedu");
		user.put("sakshi","sani");

		String uname = req.getParameter("num1");
		String pass = req.getParameter("num2");
		
		for(Map.Entry<String,String> userMapEntry : user.entrySet()) {
			if(userMapEntry.getKey().equals(uname)) {
				if(userMapEntry.getValue().equals(pass)) {
					System.out.println("login Successfull");
					res.sendRedirect("sq");
				}
			}
		}
		
		PrintWriter pw = res.getWriter();
		pw.println("WrongCredentials");
		
}

}
