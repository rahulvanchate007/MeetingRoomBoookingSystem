<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="User.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME</title>
</head>
<body style="text-align:center;background-color:gray;font-size:20px;">
<div style="background-color:gray;text-align:center">
<form method="post" action="UserRequestServlet">
<h2 style="text-align:center;background-color:white;font-size:25px;">WELCOME:</h2>

<h2 style="text-align:center;background-color:grey;font-size:20px;">To Request for a Meeting Room,Please fill the below details:</h2><br>
Username to be displayed to Facility Manager while Booking:<br>
<input type="text" name="uname"><br><br>

Booking Date for the Meeting:<br>
<input type="date" name="bookingdate"><br><br>

Which Meeting Room do you want?:<br>
<select name="mroptions">
<option value="1">Meeting Room 1</option>
<option value="2">Meeting Room 2</option>
<option value="3">Meeting Room 3</option>
</select><br><br>

Start Time:<br>
<input type="time" name="starttime"><br><br>

End Time:<br>
<input type="time" name="endtime"><br><br>

Resource Required for the Meeting:<br>
<select name="resourceoptions">
<option value="Projector">Projector</option>
<option value="WhiteBoard+marker">WhiteBoard+marker</option>
<option value="Speaker">Speaker</option>
</select><br><br>

<input type="submit" value="REQUEST">




</form>
</div>
</body>
</html>
