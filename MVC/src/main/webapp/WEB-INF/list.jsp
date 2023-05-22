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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h1>All product</h1>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px; background-color: aquamarine; border: 1px solid">
                    <a style="color: black; text-decoration: none" href="/product?action=create">Create new product</a>
                </button>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px; background-color: blanchedalmond; border: 1px solid">
                    <a style="color: black; text-decoration: none" href="/product?action=update">Update a product</a>
                </button>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px; background-color: darkseagreen; border: 1px solid">
                    <a style="color: black; text-decoration: none" href="/product?action=delete">Delete a product</a>
                </button>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px; background-color: khaki; border: 1px solid">
                    <a style="color: black; text-decoration: none" href="/product?action=detail">Detail of product</a>
                </button>
                <button type="button" class="btn btn-primary" style="margin-top: 20px; margin-bottom: 20px; background-color: lavender; border: 1px solid">
                    <a style="color: black; text-decoration: none" href="/product?action=search">Search a product</a>
                </button>
                <fmt:setLocale value="vi_VN"/>
                <table class="table table-hover">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Detail</th>
                    <th>Producer</th>
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
            </div>
        </div>
    </div>
</body>
</html>
