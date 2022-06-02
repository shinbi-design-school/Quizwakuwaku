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
		<title>わくわくクイズ～野球編～</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/fourthStage.css">
	</head>
	
	<body>
				<h1>ステージクリア！！！</h1>
			
				<h3>おめでとうございます！</h3>
				<h4><%= name %> さんの結果は</h4>
					<h4>
						<span id="result"><%= result.getName() %></span> で、見事にステージクリアです。<br>
						次はいよいよBOSSステージ！オールクリアは目前です！
					</h4>
		
				<h5><%= result.getDescription() %></h5>
				<br>
		<form method="post" action="${pageContext.request.contextPath}/bossStage">
			<div>
				<input id="push" type="submit" value="次のステージへ">
			</div>
			<input type="hidden" name="name" value="<%= name %>">
		</form>
	</body>
</html>