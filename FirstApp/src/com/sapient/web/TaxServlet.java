package com.sapient.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TaxServlet
 */
public class TaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("txname");
		double income = Double.parseDouble(request.getParameter("txtincome"));
		
		double tax = 0;
		if(income > 1000000)
			tax = 750000 * 0.10 + (income-1000000) * 0.15;
		else if(income>250000)
			tax = (income-250000) * 0.10;
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1 align='center'>Tax result</h1>");
		out.println("<hr/>");
		out.println("<section style='min-height:'400px'>");
		out.println("<table cellpadding='10' bgcolor='wheat' style='margin:0 auto'>");
		
		out.println("<tr>");
		out.println("<td>Name</td>");
		out.println("<td>"+ name + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Annual income</td>");
		out.println("<td>"+ income + "</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>Tax</td>");
		out.println("<td>"+ tax + "</td>");
		out.println("</tr>");
		
		out.println("</table>");
		out.println("</hr>");
		ServletContext ctx = getServletContext();
		String head = ctx.getInitParameter("headstr");
		String hstr = ctx.getInitParameter("homepg");
		
		out.println("<div align='center'>");
		out.println(head + "<br/>");  
		out.println("<a href='"+ hstr +"'>HOME</a></div>");
		
		out.println("<div align='center'><a href='Home.jsp'>Home</a></div>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
