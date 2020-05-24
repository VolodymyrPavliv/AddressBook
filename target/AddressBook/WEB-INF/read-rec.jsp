<%@ page import="com.mushroom.Rec" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show information about User</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
<%
    Rec rec = (Rec) request.getAttribute("rec");
    if(rec==null){
        response.getWriter().print("Person with name "+request.getParameter("firstName")+" "+ request.getParameter("lastName")+ " not found in Address Book");
    }
%>
    <p>Id: <%=rec.getId()%></p>
    <p>First Name: <%=rec.getFirstName()%></p>
    <p>Last Name: <%=rec.getLastName()%></p>
    <p>Address: <%=rec.getAddress()%></p>
</body>
</html>
