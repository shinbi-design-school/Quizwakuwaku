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
		<title>ゲームオーバー</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/gameover.css">
	</head>
	
	<body>
	
		<div>
			<h3><%= name %>さん</h3>
		</div>
		<div class="fade"><h1>Game Over</h1></div>
        
        <div class="box">
		<p><%= name %> さんの結果は<span id="result"><%= result.getName() %></span>です。</p>
		<p> 残念ながらステージクリアになりませんでした。<br>
		またの挑戦をお待ちしております。</p>
		</div>
		
		<div class="box16">
		<h4><%= result.getDescription() %></h4>
		<form method="get" action="${pageContext.request.contextPath}/top">
		</div>
		<div>
			<img class="neko" src="cat_fukidashi_tomomo.png"> <img class="neko1"
				src="cat_nekoko_hansei.png">
		</div>
		<div id="faa">
				<input id="back" type="submit" value="トップ画面に戻る">
			</div>
		</form>
	</body>
</html>