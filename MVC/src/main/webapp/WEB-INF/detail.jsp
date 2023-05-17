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
    <title>Product's Detail</title>
</head>
<body>
<h1>Detail product</h1>
<fmt:setLocale value="vi_VN"/>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Price</th>
    <th>Quantity</th>
    <th>Origin</th>
</tr>
<tr>
    <td>${requestScope["product"].getId()}</td>
    <td>${requestScope["product"].getName()}</td>
    <td><fmt:formatNumber value="${requestScope['product'].getPrice()}" type="currency"/></td>
    <td>${requestScope["product"].getQuantity()}</td>
    <td>${requestScope["product"].getOrigin()}</td>
</tr>
</table>
</body>
</html>
