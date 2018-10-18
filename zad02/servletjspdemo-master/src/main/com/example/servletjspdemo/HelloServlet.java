package com.example.servletjspdemo;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sayHello")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.println("<html><body><h1>Hello World</h1></body></html>");
	}
}
//aktualna data na /date
//na /about tresc html "o mnie"
//menu zawierajaca linki do tych rzeczy
