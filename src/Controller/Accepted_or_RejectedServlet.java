package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MeetingRequestBean;
import Dao.FacilityManagerDao;

/**
 * Servlet implementation class Accepted_or_RejectedServlet
 */
@WebServlet("/Accepted_or_RejectedServlet")
public class Accepted_or_RejectedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accepted_or_RejectedServlet() {
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
		mb.setId(Integer.parseInt(request.getParameter("id")));
		String option=request.getParameter("acceptreject");
		if(option.equals("ACCEPT"))
		{
			
			boolean status=FacilityManagerDao.Accepted(mb);
			if(status==true)
			{
				out.println("Request Accepted");
			}
			else
				out.println("Request not accepted");
		}
		if(option.contentEquals("REJECT"))
		{
			boolean status=FacilityManagerDao.Rejected(mb);
			if(status==true)
			{
				out.println("Request rejected");
			}
			else
				out.println("Request not rejected");
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
