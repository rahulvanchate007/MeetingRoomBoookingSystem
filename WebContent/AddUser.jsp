<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="FacilityManager.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div style="background-color:gray;text-align:center">
<body style="text-align:center;background-color:silver;font-size:20px;">

<form name="adduser" method="post" action="AddUserServlet">
To Add a User:
<br>
Enter the Username:<br>
<input type="text" name="uname"><br>
Enter the password:<br>
<input type="password" name="pwd"><br>

<input type="submit" value="Add">
<br>

</form>



</body>
</div>
</html>
