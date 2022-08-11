<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.product.Product_Class"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Profile</title>
</head>
<body>
<%
ArrayList<Product_Class> p1 = (ArrayList)request.getAttribute("data");
%>
<div align="center">
<table border="1">
<tr>
<th>ID</th>
<th>Name</th>
<th>Colour</th>
<th>Price</th>
</tr>
<%
if (request.getAttribute("data") != null) {
Iterator<Product_Class> iterator = p1.iterator();
while (iterator.hasNext()) {
Product_Class pc = iterator.next();
%>
<tr>
<td><%=pc.getId()%></td>
<td><%=pc.getName()%></td>
<td><%=pc.getColour()%></td>
<td><%=pc.getPrice()%></td>
</tr>
<%
}
}
%>
</table>
</div>
</body>
</html>
