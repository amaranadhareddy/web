package com.sapient.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class QuizServlet
 */
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuizServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ans1 = request.getParameter("ques1");
		String ans2 = request.getParameter("ques2");
		String ans3 = request.getParameter("ques3");
		String ans4 = request.getParameter("ques4");
		
		int score = 0;
		String res = "fail";
		if(ans1 != null && ans1.equals("4"))
			++score;
		if(ans2 != null && ans2.equals("1"))
			++score;
		if(ans3 != null && ans3.equals("list"))
			++score;
		if(ans4 != null && ans4.equals("set"))
			++score;
		
		double per = score/4.0 *100;
		ServletConfig cfg = getServletConfig();
		double pslab = Double.parseDouble(cfg.getInitParameter("passper"));
		if(per >= pslab)
			res = "pass";
		
		request.setAttribute("score", score);
		request.setAttribute("per", score/4.0 *100);
		request.setAttribute("result", res);
		
		RequestDispatcher rd = request.getRequestDispatcher("QuizResult.jsp");
		rd.forward(request, response);
	}

}
