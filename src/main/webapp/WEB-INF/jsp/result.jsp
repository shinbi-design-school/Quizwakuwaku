<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Result" %>

<!-- このimport文は不要 -->
<%@ page import="cc.shinbi.quizwakuwaku.model.User" %>


<%
	String name = (String)request.getAttribute("name");
	Result result = (Result)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>わくわくクイズ～読み方編～</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/firststage.css">
	</head>
	
	<body>
		<h1>ステージクリア！！！</h1>
		<p>おめでとうございます！</p>
		<p><span id="result"><%= result.getName() %></span> で、見事にステージクリアです。<br>
		セカンドステージもがんばってください♪</p>
		<h4><%= result.getDescription() %></h4>
		<form method="post" action="${pageContext.request.contextPath}/secondStage">
		
		<div id="faa">
				<input id="botan" type="submit" value="セカンドステージへ">
			</div>
		
		</form>
	</body>
</html>