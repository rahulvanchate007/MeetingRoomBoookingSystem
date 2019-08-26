package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MeetingRequestBean;
import Dao.FacilityManagerDao;

/**
 * Servlet implementation class CountMRServlet
 */
@WebServlet("/CountMRServlet")
public class CountMRServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountMRServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		MeetingRequestBean mb=new MeetingRequestBean();
		mb.setMR_No(request.getParameter("mrno"));
		int status=FacilityManagerDao.CountMR(mb); 
		if(status!=0)
		{
			RequestDispatcher rd=request.getRequestDispatcher("MRCount.jsp"); 
			request.setAttribute("status",status);
			request.setAttribute("mrno", request.getParameter("mrno"));
			rd.forward(request,response);
			//out.println("No of requests in a Day"+status);
		}		
		else
		{
			out.println("NO Records");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
