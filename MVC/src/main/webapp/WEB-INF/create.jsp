<%--
  Created by IntelliJ IDEA.
  User: Thu Nguyen
  Date: 5/15/2023
  Time: 7:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<h1>Create new product</h1>
<c:if test="${error != null}">
    <h2 style="color: red">${error}</h2>
</c:if>
<form action="/product" method="post">
    <table>
        <tr>
            <td>ID: </td>
            <td><input type="number" name="id" /></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" /></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="number" name="price" /></td>
        </tr>
        <tr>
            <td>Detail:</td>
            <td><input type="text" name="detail"></td>
        </tr>
        <tr>
            <td>Producer</td>
            <td><input type="text" name="producer"></td>
        </tr>
        <tr>
            <td><input type="reset" value="Reset"/></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
    <input type="hidden" name="action" value="create"/>
</form>
</body>
</html>
