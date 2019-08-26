<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="FacilityManager.jsp" />
<%
int x=(int)request.getAttribute("status");
if(x==1)
out.print("The most used resource is projector");

if(x==2)
out.print("The most used resource is projector");

if(x==3)
out.print("The most used resource is projector");

%>

</body>
</html>