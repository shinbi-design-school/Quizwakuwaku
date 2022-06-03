<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei3" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item" %>

<%
	Hantei3 hantei = (Hantei3)session.getAttribute("hantei");
	String name = (String)request.getAttribute("name");
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
	<header>
		<h1>わくわくクイズ</h1>
		<h2>サードステージ～スウィーツ編～</h2>

	</header>
	<main>
		<div>
			<h3><%=name%>さん
			</h3>
		</div>
		<div class=sumi>
			<p>サードステージへようこそ！このステージでは読み方に関するクイズが出題されます。</p>
			<p>５問中３問以上正解ならファーストステージクリア！！次のステージに進めます。</p>

		</div>

		<div>
			<img class="neko" src="cat_nekoko.png"> <img class="neko1"
				src="cat_tomomo.png">
		</div>
		
		<div>
				<img class="green" src="green.png"> 
			</div>
			
			<div>
				 <img class="maguro1" src="orange.png"> 
			</div>
			
			<div>
				<img class="red" src="red.png"> 
			</div>
			
			<div>
				<img class="brown1" src="brown.png"> 
			</div>
			
			<div>
				<img class="white" src="white.png"> 
			</div>

		<form method="post" action="${pageContext.request.contextPath}/result3">
			<%
			int times = 0;
			for (Question question : hantei.getQuestions()) {
			%>
			<div class="box">
				<h3><%=question.getQuestion()%></h3>
			
				<%
				for (Item item : question.getItems()) {
				%>
				
				
					<input class="point" id="select<%=times%>" type="radio"
						name="<%=question.getKey()%>" value="<%=item.getId()%>" required>
					<label for="select<%=times%>" class="point"><%=item.getText()%></label>
				
				<%
				times++;
				}
				%>
			</div>

			<%
			}
			%>
           <div>
				<img class="sweets" src="sweets.png"> 
			</div>
			<div id="buttons">
				<input class="back" type="submit" value="回答を確認する">
			</div>
			<input type="hidden" name="name" value="<%=name%>">
		</form>
	</main>
</body>
</html>