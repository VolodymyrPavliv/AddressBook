<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Creat new record</title>
</head>
<body>
<%@include file="header.html"%>
<br>
    <p><%=request.getAttribute("error")%></p>
    <form action="/records/create" method="post">
        <table>
            <tr>
                <td>
                    <label for="firstName">First Name</label>
                </td>
                <td>
                    <input type="text" id="firstName" name="firstName">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="lastName">Last Name</label>
                </td>
                <td>
                    <input type="text" id="lastName" name="lastName">
                </td>
            </tr>
            <tr>
                <td>
                    <label for="address">Address</label>
                </td>
                <td>
                    <input type="text" id="address" name="address">
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="Create">
                </td>
                <td>
                    <input type="reset" value="Clear">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>