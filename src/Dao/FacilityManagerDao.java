package Dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.servlet.RequestDispatcher;

import Bean.MeetingRequestBean;
import meetingroombooking.ConnectionProvider;

public class FacilityManagerDao {

	public static boolean AddUser(MeetingRequestBean mb)
	{
		try
		{
			Connection con=ConnectionProvider.getCon();  
			if(Pattern.matches("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*\\W)).{8,40}",mb.getPassword()))
			{
			PreparedStatement stmt=con.prepareStatement("insert into logindetails values(?,?,?)");
			stmt.setString(1,mb.getUsername());
			stmt.setString(2,mb.getPassword());
			stmt.setString(3, "user");
			int i=stmt.executeUpdate();
			if(i!=0)
			{
				return true;
			}
			else
			return false;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return false;
	}
		
		public static boolean DeleteUser(MeetingRequestBean mb)
		{
			try
			{
				Connection con=ConnectionProvider.getCon();  
				PreparedStatement stmt=con.prepareStatement("delete from logindetails where username=?");
				stmt.setString(1,mb.getUsername());
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

		
	public static ResultSet Accept_or_Reject(MeetingRequestBean mb)
	{
			// TODO Auto-generated method stub
			Connection con=ConnectionProvider.getCon(); 
			try
			{
			PreparedStatement stmt=con.prepareStatement("select * from meetingrequest where status=?");
			stmt.setString(1,"new");
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
	
	public static boolean Accepted(MeetingRequestBean mb)
	{
		try
		{
			
			Connection con=ConnectionProvider.getCon(); 
			ResultSet rs;
			
			PreparedStatement stmt=con.prepareStatement("update meetingrequest set status=? where id=?");
			stmt.setString(1,"approved");
			
			stmt.setInt(2,mb.getId());
			int i=stmt.executeUpdate();
			
			PreparedStatement stmt1=con.prepareStatement("select * from meetingrequest where status=? and id=?");
			stmt1.setString(1,"approved");
			stmt1.setInt(2, mb.getId());
			rs=stmt1.executeQuery();
			rs.next();
			
			String date= rs.getString("date");
			String start=rs.getString("starttime");
			String end=rs.getString("endtime");
			String room=rs.getString("mrno");
			String user=rs.getString("user");
			String resource=rs.getString("resource");
			int resno = 0;
			
			PreparedStatement stmt2=con.prepareStatement("insert into meetingroom values(?,?,?,?,?)");
			
			PreparedStatement stmt3=con.prepareStatement("insert into resourceusage values(?,?,?,?,?,?,?)");
			
			if(resource.equals("projector"))
			{
				resno=1;
			}
			if(resource.equals("whiteboard+marker"))
			{
				resno=2;
			}
			if(resource.equals("speaker"))
			{
				resno=3;
			}
			
			
			stmt2.setString(1,room);
			stmt2.setString(2,date);
			stmt2.setString(3,start);
			stmt2.setString(4,end);
			stmt2.setString(5,user);
			
			stmt2.executeUpdate();
			
			stmt3.setInt(1, resno);
			stmt3.setString(2, resource);
			stmt3.setString(3, date);
			stmt3.setString(4, start);
			stmt3.setString(5, end);
			stmt3.setString(6, user);
			stmt3.setString(7, room);
			stmt3.executeUpdate();
			
			
			
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
	
	public static boolean Rejected(MeetingRequestBean mb)
	{
		try
		{
			Connection con=ConnectionProvider.getCon(); 
			PreparedStatement stmt=con.prepareStatement("update meetingrequest set status=? where id=?");
			stmt.setString(1,"rejected");
			stmt.setInt(2,mb.getId());
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
	
	public static int CountMR(MeetingRequestBean mb)
	{
		Connection con=ConnectionProvider.getCon(); 
		int y=0;
		try
		{
			PreparedStatement stmt2=con.prepareStatement("select count(*) from meetingroom where mrno=?");
			stmt2.setString(1,mb.getMR_No());
			ResultSet rs = stmt2.executeQuery();
			while(rs.next())
			{
				y=rs.getInt(1);
			}
				return y;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public static int CountResource(MeetingRequestBean mb)
	{
		Connection con=ConnectionProvider.getCon(); 
		int x=0,y=0,z=0;;
		try
		{
			PreparedStatement stmt=con.prepareStatement("select count(*) from meetingroom");
			ResultSet rs = stmt.executeQuery();
			while(rs.next())
			{
				if(rs.getInt(1)==1)
				{
					x++;
				}
				if(rs.getInt(1)==2)
				{
					y++;
				}
				if(rs.getInt(1)==3)
				{
					z++;
				}
			}
				if(x>y && x>z)
					return x;
				if(y>x && y>z)
					return y;
				if(z>x && z>y)
					return z;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
}
	


