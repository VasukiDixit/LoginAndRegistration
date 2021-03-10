<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
 response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
//response.setHeader("pragma","no-cache");

 if(session.getAttribute("user")==null)
	 response.sendRedirect("login.jsp");
	 
  %>
<h2>Welcome to  ${ user }</h2>
<form action="login.jsp" method="post">
<div class="container">
<a href=login.jsp>login</a>
<a href=registration.jsp>Registration</a>
<a href=aboutus.jsp>About</a>
<a href=admin.jsp>Admin</a>
</div>
<form action="logout" >
<input type="submit" value="logout">
</form>

</body>
</html>
</form>