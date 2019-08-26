<%@page import="Dao.LoginDao"%>  
<jsp:useBean id="obj" class="Bean.LoginBean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
 
<%  
String uname=(String)request.getParameter("uname");
String pwd=(String)request.getParameter("pwd");
obj.setuname(uname);
obj.setpwd(pwd);
request.setAttribute("obj", obj);
RequestDispatcher rd=request.getRequestDispatcher("LoginServlet"); 
rd.forward(request,response);
%>  



