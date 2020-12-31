<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page session ="false" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
Display From Model Object
<br/>
<P>The Time of the Server is ${serverTime} </P>
 <br/>
<form action ="user" method="post">
<input type ="text" name ="userName" /> <br/>
<input type ="submit" value="Login" />  <br/>
</form>
</body>
</html>