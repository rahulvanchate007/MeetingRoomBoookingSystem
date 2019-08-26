<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:include page="User.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<div style="background-color:gray;text-align:center">
<body style="text-align:center;background-color:silver;font-size:20px;">

<form method="post" action="UserRequestCancel">
Enter the ID:<br>
<input type="text" name="id"><br>
<input type="submit" value="Cancel">

</form>

</body>
</div>
</html>