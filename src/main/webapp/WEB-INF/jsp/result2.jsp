<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Result" %>

<%
	String name = (String)request.getAttribute("name");
	Result result = (Result)request.getAttribute("result");
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>わくわくクイズ～アニメ編～</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/secondstage.css">
	</head>
	
	<body>
		<div>
			<h3><%= name %>さん</h3>
		</div>
		<h1>ステージクリア！！！</h1>
		<p id="p1">おめでとうございます！</p>
		<p id="p2"><%= name %> さんの結果は</p>
		<p id="p1"><span id="result"><%= result.getName() %></span> で、見事にステージクリアです。<br>
		サードステージもがんばってください♪</p>
		<h4><%= result.getDescription() %></h4>
		<form method="post" action="${pageContext.request.contextPath}/thirdStage">
		<div id="buttons">
			<input type="submit" value="次のステージへ">
		</div>
		<input type="hidden" name="name" value="<%= name %>">
		</form>
	</body>
</html>