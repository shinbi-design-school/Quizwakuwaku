<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei5" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item" %>

<%
	Hantei5 hantei = (Hantei5)session.getAttribute("hantei");
	String name = (String)request.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>わくわくクイズ～ボスステージ編～</title>
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/css/Style.css">
</head>
<body>
<header>
<h1>わくわくクイズ</h1>
<h2>～ボスステージ～</h2>

</header>
<main>

<div>
	<h3><%= name %>さん</h3>
</div>
<div class=sumi>
<p>ボスステージへようこそ！このステージではいろんな問題に関するクイズが出題されます。</p>
<p>５問中３問以上正解すれば見事クリアとなります！！</p>
<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
		<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">
</div>

<form method="post" action="${pageContext.request.contextPath}/result5">
<%
 for(Question question : hantei.getQuestions()){
%>
 <div class=box>
 <h3><%= question.getQuestion() %></h3>
 </div>
 <div>
<%
 for(Item item : question.getItems()){
%>
<div>
<input type="radio"
 name="<%= question.getKey() %>"
 value="<%= item.getId() %>"

 >
 <%= item.getText() %>
 </div>
 <%
 }
 %>
 </div>
 
 <%
 }
 %>
 
 <div id="buttons">
 <input class=back type="submit" value="結果を見る">
 </div>
 <input type="hidden" name="name" value="<%= name %>">
 </form>
 </main>
 </body>
 </html>