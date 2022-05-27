<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item" %>

<%
	Hantei hantei = (Hantei)session.getAttribute("hantei");
	String name = (String)session.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>わくわくクイズ～難問編～</title>
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/css/Style.css">
</head>
<body>
<header>
<h1>わくわくクイズ</h1>
<h2>～難問～</h2>

</header>
<main>
<div>
	<h3><%= name %>さん</h3>
</div>
<div class=sumi>
<p>わくわくクイズへようこそ！このステージでは難しい問題に関するクイズが出題されます。</p>
<p>５問中３問間違えたらゲームオーバー！次のステージに進めません。</p>
</div>

<form method="post" action="${pageContext.request.contextPath}/result">
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
 </form>
 </main>
 </body>
 </html>