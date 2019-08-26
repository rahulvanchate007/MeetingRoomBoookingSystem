<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<marquee direction="right" scrollamount="20" bgcolor="gray" behavior="scroll">Welcome User</marquee>
<body style="text-align:center;background-color:silver;font-size:20px;">

<form method="post" action="RequestMR.jsp">
To Request or Cancel a Meeting Room:<br>
<input type="submit" value="Request"><br>
</form>

<form method="post" action="UserRequestCancel">
To Cancel a booking:<br>
<input type="submit" value="Cancel"><br>
<br>
</form>

</body>
</html>