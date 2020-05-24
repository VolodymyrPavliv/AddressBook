<%@ page import="com.mushroom.Rec" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show all records</title>
</head>
<body>
<%@include file="header.html"%>
<br>
<p>
    <a href="/records/ascending">ascending </a>
    <a href="/records/descending">descending </a>
</p>
<table border="1">
    <tr>
        <th>№</th>
        <th>FirstName</th>
        <th>LastName</th>
        <th>Address</th>
        <th colspan = "4">Operation</th>
    </tr>
    <%
        for (Rec rec : (List<Rec>) request.getAttribute("records")){
            %>
        <tr>
            <td><%=rec.getId()%></td>
            <td><%=rec.getFirstName()%></td>
            <td><%=rec.getLastName()%></td>
            <td><%=rec.getAddress()%></td>
            <td>
                <a href="/records/read?firstName=<%=rec.getFirstName()%>&lastName=<%=rec.getLastName()%>">Read</a>
            </td>
            <td>
                <a href="/records/update?firstName=<%=rec.getFirstName()%>&lastName=<%=rec.getLastName()%>">Update</a>
            </td>
            <td>
                <a href="/records/delete?firstName=<%=rec.getFirstName()%>&lastName=<%=rec.getLastName()%>">Delete</a>
            </td>
        </tr>
    <%
        }
    %>
</table>
</body>
</html>
