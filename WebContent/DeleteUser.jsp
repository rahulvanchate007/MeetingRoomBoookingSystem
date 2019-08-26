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

<form method="post" action="DeleteUserServlet">

Enter the Username to Delete:<br>
<input type="text" name="uname"><br>
<input type="submit" value="delete">
<br>


</form>


</body>
</div>

</html>
