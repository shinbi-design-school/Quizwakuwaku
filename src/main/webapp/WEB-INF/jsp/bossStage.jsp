<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei5"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item"%>

<%
Hantei5 hantei = (Hantei5) session.getAttribute("hantei");
String name = (String) request.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>わくわくクイズ～ボスステージ編～</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bossstage.css">
</head>
<body>
	<header>
		<h1>わくわくクイズ</h1>

	</header>
	<main>

		<div>
			<h3><%=name%>さん</h3>
			<h3>ボスステージへようこそ</h3>
		</div>

		<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
		<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">


		<form method="post"
			action="${pageContext.request.contextPath}/result5">
			<%
			int times = 0;
			for (Question question : hantei.getQuestions()) {
			%>
			
			<div>
				<h3><%=question.getQuestion()%></h3>
			</div>
			
			<div class="questions">
				<%
				for (Item item : question.getItems()) {
				%>
				<div>
					<input class="point" id="select<%=times%>" type="radio"
						name="<%=question.getKey()%>" value="<%=item.getId()%>" required>
						
					<label for="select<%=times%>" class="point"><%=item.getText()%></label>
				</div>
				<%
				times++;
				}
				%>
			</div>


			<%
			}
			%>
			<br> <br>
			<div id="faa">
				<input id="botan" type="submit" value="回答を確認する">
			</div>
			<input type="hidden" name="name" value="<%=name%>">
		</form>
	</main>
</body>
</html>