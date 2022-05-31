<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question"%>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item"%>

<%
Hantei hantei = (Hantei) session.getAttribute("hantei");
String name = (String) request.getAttribute("name");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>わくわくクイズ～読み方編～</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/firststage.css">
</head>
<body>
	<header>
		<h1>わくわくクイズ</h1>
		<h2>ファーストステージ</h2>

	</header>
	<main>
		<div>
			<h3><%=name%>さん
			</h3>
		</div>
		<div class=explanatory>
			<p>ファーストステージへようこそ！このステージでは読み方に関するクイズが出題されます。</p>
			<p>５問中３問間違えたらゲームオーバー！次のステージに進めません。</p>

		</div>

		<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
		<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">


		<form method="post" action="${pageContext.request.contextPath}/result">
			<%
			for (Question question : hantei.getQuestions()) {
			%>
			<div class=questionbox>
				<h3><%=question.getQuestion()%></h3>
			</div>
			<div class=answerbox>
				<%
				for (Item item : question.getItems()) {
				%>
				<div>
					<input type="radio" name="<%=question.getKey()%>"
						value="<%=item.getId()%>">
					<%=item.getText()%>
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

			<div id="faa">
				<input id="botan" type="submit" value="回答を確認する">
			</div>

		</form>
	</main>
</body>
</html>