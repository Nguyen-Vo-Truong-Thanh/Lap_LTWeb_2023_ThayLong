<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 21-10-2022
  Time: 1:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Login</h2>
<% String error = (String) (request.getAttribute("error")!=null?(String) request.getAttribute("error"):"");
String uname = request.getParameter("uname")!=null?request.getParameter("uname"):"";
if(error==null)error="";
if (error==uname)uname="";
%>
<p style="color: red; text-align: center"><%= request.getAttribute("error")%></p>
<form method="post" action="/Servlet">
    Username: <input type="text" name="uname"><br/>
    Password: <input type="password" name="pass"><br/>

    <input type="submit" value="GUI">
</form>

</body>
</html>
