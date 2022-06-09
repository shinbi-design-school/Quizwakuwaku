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
			  href="${pageContext.request.contextPath}/css/allClear.css">
	</head>
	
	<body>
	    <div class="fade"><h1>All Clear</h1></div>
	    <div class="box">
		<h2>全ステージクリア！！！</h2>
		<p><%= name %> さんの結果は</p>
		<p><span id="result"><%= result.getName() %></span> で、見事全ステージクリアとなりました！！<br>
		おめでとうございます！！！
		</p>
		</div>
		
		<div class="box16">
		<h4><%= result.getDescription() %></h4>
		
		
		<h4>ここで、全ステージクリアされた<%= name %>さんのために、ご褒美動画をご用意しました。<br>
		さっそく下の４つの中から選んで、ボタンをクリックして観に行ってみてください！またの挑戦をお待ちしております。</h4>
		</div>
		<form method="get" action="${pageContext.request.contextPath}/movie">	<%-- MovieServletに飛ばします --%>
			<span id="faa">
				<button id="botan1" type="submit"  name="movie" value=1>  <%-- このボタンが押されたら"movie"という名前の変数の中にvalueで設定した値の１を入れます --%>
				ご褒美動画①</button>
			</span>
			<span id="faa">
			<button id="botan2" type="submit"  name="movie" value=2>	<%-- このボタンが押されたら"movie"にvalueで設定した値の２を入れます --%>
				ご褒美動画②</button>
			</span>
			<span id="faa">
				<button id="botan3" type="submit"  name="movie" value=3>	<%-- このボタンが押されたら"movie"にvalueで設定した値の３を入れます --%>
				ご褒美動画③</button>
			</span>
			<span id="faa">
				<button id="botan4" type="submit"  name="movie" value=4>	<%-- このボタンが押されたら"movie"にvalueで設定した値の４を入れます --%>
				ご褒美動画④</button>
			</span>	
		</form>
		<br>
		<form  method="get" action="${pageContext.request.contextPath}/top">	<%-- こっちのボタンが選択されたらTopServletに飛ばします --%>
			<div id="buttons">
 					<input id="push" type="submit" value="動画を見ないでトップ画面に戻る">	
 			</div>
 			<div>
			<img class="neko" src="cat_nekoko.png"> <img class="neko1"
				src="cat_tomomo.png">
		</div>
 		</form>
	</body>
</html>