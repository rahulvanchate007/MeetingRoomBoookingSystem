package Dao;

import java.sql.*;

import Bean.LoginBean;
import meetingroombooking.ConnectionProvider;

public class LoginDao {

public static String validate(LoginBean obj){  
String status=null;
int flag=0;
		try{  
		Connection con=ConnectionProvider.getCon();  
		              
		PreparedStatement ps=con.prepareStatement(  
		    "select * from logindetails ");
//		ps.setString(1, obj.getuname());
//		ps.setString(2,obj.getpwd());
		
		ResultSet rs=ps.executeQuery();  
		while(rs.next())
		{
		if(rs.getString(1).equals(obj.getuname())&&rs.getString(2).equals(obj.getpwd())&&rs.getString(3).equals("fm"))
		{
		    flag = 1;
		}
		if(rs.getString(1).equals(obj.getuname())&&rs.getString(2).equals(obj.getpwd())&&rs.getString(3).equals("user"))
		{
		    flag = 2;
		}
		}
		if(flag==1)
		return "fm";
		else if(flag==2)
		return "user";
		else
		return "error";         
		}
		catch(Exception e){
			
		}  
		  
return "";  
}
}
