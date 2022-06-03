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
		<title>わくわくクイズ～スウィーツ編～</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/thirdStage.css">
	</head>
	
	<body>
		<div>
			<h3><%= name %>さん</h3>
		</div>
		<div class="box">
		<h1>ステージクリア！！！</h1>
		<h2>おめでとうございます！</h2>
	
		<h2><%= name %> さんの結果は</h2>
		<p><span id="result"><%= result.getName() %></span> で、見事にステージクリアです。<br>
		4thステージもがんばってください♪</p>
		</div>
		<div class="box">
		<h4 ><%= result.getDescription() %></h4>
		</div>
		<form method="post" action="${pageContext.request.contextPath}/fourthStage">
		<div>
				<img class="iruka" src="cat_tom.png"> 
				<img class="iruka1"src="cat_fukidashi_nekoko.png">
			</div>
		<div id="buttons">
			<input class="back" type="submit" value="次のステージへ">
		</div>
	
		<input type="hidden" name="name" value="<%= name %>">
		</form>
	</body>
</html>