<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei2" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item" %>

<%
	Hantei2 hantei = (Hantei2)session.getAttribute("hantei");
	String name = (String)request.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>わくわくクイズ～アニメ・漫画編～</title>
<link rel="stylesheet" type="text/css"
href="${pageContext.request.contextPath}/css/secondstage.css">
</head>
<body>
<header>
<h1>わくわくクイズ</h1>
<h2>～アニメ～</h2>

</header>
<main>
<div>
	<h3><%= name %>さん</h3>
</div>
<div class=sumi>
	<p>2ndステージへようこそ！このステージではアニメに関するクイズが出題されます。</p>
	<p>５問中３問間違えたらゲームオーバー！次のステージに進めません。</p>
</div>

<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">

<form method="post" action="${pageContext.request.contextPath}/result2">
<%
 int times = 0;
 for(Question question : hantei.getQuestions()){
%>
<div class=box24>
 <h3><%= question.getQuestion() %></h3>
</div>

<div class=box25>
<%
 for(Item item : question.getItems()){
%>
<div>
  <input
   class="point" 
   id="select<%= times %>" 
   type="radio"						
   name="<%= question.getKey() %>"	
   value="<%= item.getId() %>"required>
<label for="select<%= times %>" class="point"><%= item.getText() %></label>
</div>
 <%
 times++;
   }
 %>
 </div>
 <%
 }
 %>

<br>
	<br>
<div id="buttons">
	<input id="push" type="submit" value="結果を見る">
</div>
	<input type="hidden" name="name" value="<%= name %>">
</form>
</main>
</body>
</html>