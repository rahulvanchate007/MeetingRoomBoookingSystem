package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Bean.MeetingRequestBean;
import meetingroombooking.ConnectionProvider;

public class UserDao {

	public static boolean RequestMR(MeetingRequestBean mb)
	{
		try
		{
			Connection con=ConnectionProvider.getCon();  
			PreparedStatement stmt=con.prepareStatement("insert into meetingrequest (date,starttime,endtime,user,mrno,resource,status) values (?,?,?,?,?,?,?)");
			//stmt.setInt(1,mb.getId());
			stmt.setString(1, mb.getDate());
			stmt.setString(2, mb.getStartTime());
			stmt.setString(3, mb.getEndTime());
			stmt.setString(4,mb.getUsername());
			stmt.setString(5, mb.getMR_No());
			stmt.setString(6, mb.getResource());
			stmt.setString(7, mb.getStatus());
			int i=stmt.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			return false;	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	
	public static boolean CancelMR(MeetingRequestBean mb)
	{
		try
		{
			Connection con=ConnectionProvider.getCon(); 
			PreparedStatement stmt=con.prepareStatement("update meetingrequest set status=? where id=?");
			stmt.setString(1,"cancelled");
			stmt.setInt(2,mb.getId());
			//stmt.setString(3,mb.getUsername());
			int i=stmt.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			{
			return false;	
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
	
	public static ResultSet ViewAllRequests(MeetingRequestBean mb)
	{
			// TODO Auto-generated method stub
			Connection con=ConnectionProvider.getCon(); 
			try
			{
			PreparedStatement stmt=con.prepareStatement("select * from meetingrequest");
			ResultSet rs = stmt.executeQuery();
			if(rs!=null)
			{
				return rs;
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
		
	}
	
}
