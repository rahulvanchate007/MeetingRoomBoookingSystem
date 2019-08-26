package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.MeetingRequestBean;
import Dao.UserDao;

/**
 * Servlet implementation class UserRequestServlet
 */
@WebServlet("/UserRequestServlet")
public class UserRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRequestServlet() {
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
		mb.setDate(request.getParameter("bookingdate"));
		mb.setStartTime(request.getParameter("starttime"));
		mb.setEndTime(request.getParameter("endtime"));
		mb.setUsername(request.getParameter("uname"));
		mb.setMR_No(request.getParameter("mroptions"));
		mb.setResource(request.getParameter("resourceoptions"));
		mb.setStatus("new");
		boolean status=UserDao.RequestMR(mb);
		if(status==true)
		{
			out.println("Booking Requested");
		}
		else
		{
			out.println("Try again");
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
