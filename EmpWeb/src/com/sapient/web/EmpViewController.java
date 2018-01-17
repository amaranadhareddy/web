package com.sapient.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;
import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

/**
 * Servlet implementation class EmpViewController
 */
public class EmpViewController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDao dao = DaoFactory.getDaoInstance();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpViewController() {
        super();
        // TODO Auto-generated constructor stub
    }

   
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext ctx = getServletContext();
		List<Emp> lst = dao.viewEmployee();
		ctx.setAttribute("elist", lst);
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri = request.getRequestURI();
		RequestDispatcher rd = null;
		String view = null;
		
		switch(uri){
		case "/EmpWeb/viewall":
			view = viewAll(request);
			break;
		case "/EmpWeb/update":
			view = updateEmp(request);
			break;
			
		}
		rd = request.getRequestDispatcher(response.encodeURL(view));
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private String viewAll(HttpServletRequest request){
		String strpg = request.getParameter("pg");
		int pgno = 0;
		ServletContext ctx = getServletContext();
		if(strpg == null)
			pgno = 1;
		else
			pgno = Integer.parseInt(strpg);
		int end = pgno * 3;
		int start = end - 3;
		List<Emp> lst = (List<Emp>) ctx.getAttribute("elist");
		if(end >= lst.size())
			end = lst.size();
		List<Emp> sublst = lst.subList(start, end);
		request.setAttribute("emplist", sublst);
		request.setAttribute("pgno", pgno);
		ctx.setAttribute("esize", Math.ceil(lst.size()/3.0));
		String view = "EmpView.jsp";
		return view;
	}
	
	private String updateEmp(ServletRequest request){
		int eid = Integer.parseInt(request.getParameter("hideid"));
		double sal = Double.parseDouble(request.getParameter("txtsal"));
		ServletContext ctx = getServletContext();
		int pgno = Integer.parseInt(request.getParameter("pgid"));
		try{
			dao.updateEmployee(eid, sal);
			request.setAttribute("msg", "employye salary for "+ eid + " is updated");
			ctx.setAttribute("elist", dao.viewEmployee());
		}catch(NotFoundException e){
			request.setAttribute("msg", "employee salary not updated");
			e.printStackTrace();
		}
		return "viewall?pg="+pgno;
	}

}
