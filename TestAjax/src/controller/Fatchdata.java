package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao;

/**
 * Servlet implementation class Fatchdata
 */
@WebServlet("/Fatchdata")
public class Fatchdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fatchdata() {
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
	
		
		 String pname=request.getParameter("pname");
		dao d=new dao();
		int y=d.fatchName(pname);
		if(y!=0) 
		{
			RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
			request.setAttribute("msg", "Email Id Already exist");
			rd.forward(request,response);
			
		}
		else {
			System.out.println("Not exist");
			
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
