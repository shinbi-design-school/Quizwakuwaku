<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="cc.shinbi.quizwakuwaku.model.Hantei4" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Question" %>
<%@ page import="cc.shinbi.quizwakuwaku.model.Item" %>

<%
	Hantei4 hantei = (Hantei4)session.getAttribute("hantei");	// "hantei"の名前でFourthStageServletから送られてきた問題文などの情報をhanteiと名付けた変数に入れる
	String name = (String)request.getAttribute("name");			// "name"の名前でサーブレットから送られてきたプレイヤーの名前の情報をnameと名付けた変数に入れる
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
		<header>
			<h1>わくわくクイズ</h1>
			<h2>～野球～</h2>

		</header>
	
		<main>

				<div>
					<h3><%= name %>さん</h3>
				</div>
				<div>
					<p>４ｔｈステージへようこそ！このステージでは野球に関するクイズが出題されます。<br>
						<span id="moji"> ５問中３問</span>間違えたらゲームオーバー！次のステージに進めません。</p>
				</div>
					<img class="neko" src="cat_nekoko.png" alt="neko" title="neko1">
					<img class="neko1" src="cat_tomomo.png" alt="neko2" title="neko2">

			<form method="post" action="${pageContext.request.contextPath}/result4">	<%-- post通信でResultServlet4へ --%>
<%
 int times = 0;						//	このあと記述しているidのselectをselect0,select1・・・のように複数持ちたいので、そのための変数を用意してます
 for(Question question : hantei.getQuestions()){		// 問題文があるかぎり・・・
%>
 				<div>
					 <h3><%= question.getQuestion() %></h3>		<%-- 問題文を表示させます --%>
 				</div>
 				<div class="questions" >
<%
 	for(Item item : question.getItems()){			//　選択肢があるかぎり・・・
%>
				<div>
					<input
					 class="point" 
 					 id="select<%= times %>" 
					 type="radio"						<%-- ラジオボタンで・・・ --%>
					 name="<%= question.getKey() %>"	<%-- "q1"などのquestionのキーをnameに持たせて・・・ --%>
 				  	 value="<%= item.getId() %>"		<%-- 各選択肢の０～３を値に持たせる --%>
					 required					<%-- プレイヤーがラジオボタンにチェックし忘れた際に忠告文を出す--%>
 					>
 					<label for="select<%= times %>" class="point"><%= item.getText() %></label><%-- labelタグで文章を囲むことで、プレイヤーが文章をクリックしても選択できるように --%>
 				</div>
 <%
 	times++;		 // 選択肢がひとつ表示されるたびにtimesも１つずつ加えていきます
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
					 <input type="hidden" name="name" value="<%= name %>">	<%-- この記述はsessionで名前の値を持たせる場合には必要なしです --%>
			 </form>
 		</main>
 	</body>
 </html>