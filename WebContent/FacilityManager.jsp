<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<marquee direction="right" scrollamount="20" bgcolor="gray" behavior="scroll">Welcome Facility Manager</marquee>
<body style="text-align:left;background-color:silver;font-size:20px;">

<form method="post" action="AddUser.jsp">
To Add a user:<br>
<input type="submit" value="add"><br>
</form>

<form method="post" action="DeleteUser.jsp">
To Delete user:<br>
<input type="submit" value="delete"><br>
</form>

<form method="post" action="Accept_or_RejectServlet">
To accept or decline a request:<br>
<input type="submit" value="Permit"><br>
<br>
</form>

<form method="post" action="ViewAllRequestServlet">
To view all the requests<br>
<input type="submit" value="view"><br>
<br>
</form>

<form method="post" action="CountMRServlet">
Enter the Meeting Room number to view bookings:<br>
<input type="text" name="mrno"><br>
<input type="submit" value="view" name="view"><br>
</form>

<form method="post" action="CountResourceServlet">
The resource that is used most:<br>
<input type="submit" value="view" name="viewresource"><br>
</form>


</body>
</html>
