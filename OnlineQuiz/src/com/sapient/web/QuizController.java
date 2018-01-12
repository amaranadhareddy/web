package com.sapient.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;

/**
 * Servlet implementation class QuizController
 */
public class QuizController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IExamSer ser = ExamSerImpl.getInstance();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = request.getRequestURI();
		String view = "";
		RequestDispatcher rd = null;
		HttpSession sess = request.getSession();
		ServletConfig cfg = getServletConfig();
		int nos = Integer.parseInt(cfg.getInitParameter("questions"));
		List<Question> qlist = null;

		switch (url) {
		case "/OnlineQuiz/start":
			qlist = ser.generateQuestions(nos);
			sess.setAttribute("qlist", qlist);
			sess.setAttribute("currques", 0);
			request.setAttribute("question", qlist.get(0));
			view = "QuizView.jsp";
			break;
		case "/OnlineQuiz/quiz":
			String btnvalue = request.getParameter("btn");
			int cq = (int) sess.getAttribute("currques");
			qlist = (List<Question>) sess.getAttribute("qlist");
			if (btnvalue.equals("next")) {
				request.setAttribute("question", qlist.get(++cq));
			} else if (btnvalue.equals("prev")) {
				request.setAttribute("question", qlist.get(--cq));
			}
			sess.setAttribute("currques", cq);

			view = "QuizView.jsp";
		}
		rd = request.getRequestDispatcher(response.encodeURL(view));
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
