<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Thu Nguyen
  Date: 5/15/2023
  Time: 7:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
    <h1>All product</h1>
    <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px">
        <a style="color: white; text-decoration: none" href="/product?action=create">Create new product</a>
    </button>
    <fmt:setLocale value="vi_VN"/>
    <table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
        <th>Origin</th>
        <th></th>
    </tr>
    <c:forEach items="${products}" var="p">
    <tr>
        <td>${p.id}</td>
        <td>${p.name}</td>
        <td><fmt:formatNumber value="${p.price}" type="currency"/></td>
        <td style="text-align: center">${p.detail}</td>
        <td>${p.producer}</td>
    </tr>
    </c:forEach>
    </table>
</body>
</html>
