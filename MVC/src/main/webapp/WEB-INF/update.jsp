<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
    <title>Update Product</title>
</head>
<body>
<h1>Create new product</h1>
<fmt:setLocale value="vi_VN"/>
<a href="/product?action=list"></a>
<form action="/product" method="post">
    <table>
        <tr>
            <td>ID: </td>
            <td><input type="number" name="id" value="${requestScope["product"].getId()}"/></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" value="${requestScope["product"].getName()}"/></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="number" name="price" value="${requestScope['product'].getPrice()}"/></td>
        </tr>
        <tr>
            <td>Quantity:</td>
            <td><input type="number" name="quantity" value="${requestScope["product"].getQuantity()}"></td>
        </tr>
        <tr>
            <td>Origin</td>
            <td><input type="text" name="origin" value="${requestScope["product"].getOrigin()}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="Update"/></td>
        </tr>
    </table>
    <input type="hidden" name="action" value="update"/>
</form>
</body>
</html>
