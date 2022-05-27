<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	String message = (String)request.getAttribute("message");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>クイズわくわく</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<h1>クイズわくわく</h1>
		<form method="post" action="${pageContext.request.contextPath}/stage">
		<h3>あなたのお名前は?</h3>
		<input type="text" name="name">
<%
	if(message != null) {
%>
		<div><%= message %></div>
<%
	}
%>
		<div id="buttons">
			<input type="submit" value="クイズに挑戦する">
		</div>
		</form>
</body>
</html>