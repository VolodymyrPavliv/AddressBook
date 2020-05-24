<%@ page import="com.mushroom.Rec" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update existing Record</title>
</head>
<body>
<%@include file="header.html"%>
<br><br>
<form action="/records/update" method="post">
    <%
        Rec rec = (Rec) request.getAttribute("rec");
        if(rec==null){
            response.getWriter().print("Person with name "+request.getParameter("firstName")+" "+ request.getParameter("lastName")+ " not found in Address Book");
        }
    %>
    <table>
        <tr>
            <td>
                <label for="firstName">First Name</label>
            </td>
            <td>
                <input type="text" id="firstName" name="firstName" value="<%=rec.getFirstName()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for="lastName">Last Name</label>
            </td>
            <td>
                <input type="text" id="lastName" name="lastName" value="<%=rec.getLastName()%>" disabled>
            </td>
        </tr>
        <tr>
            <td>
                <label for="address">Address</label>
            </td>
            <td>
                <input type="text" id="address" name="address" value="<%=rec.getAddress()%>">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Update">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
    </form>
</body>
</html>
