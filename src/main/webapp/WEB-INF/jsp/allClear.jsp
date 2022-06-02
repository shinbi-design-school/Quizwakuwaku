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
		<title>全ステージクリア！！</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/style.css">
	</head>
	
	<body>
		<div>
			<h3><%= name %>さん</h3>
		</div>
		<h1>全ステージクリア！！！</h1>
		<p><%= name %> さんの結果は</p>
		<p><span id="result"><%= result.getName() %></span> で、見事全ステージクリアとなりました！！<br>
		おめでとうございます！！！またの挑戦をお待ちしております。</p>
		<h4><%= result.getDescription() %></h4>
		<form method="get" action="${pageContext.request.contextPath}/top">
		<div id="faa">
				<input id="botan" type="submit" value="トップ画面に戻る">
			</div>
		</form>
	</body>
</html>