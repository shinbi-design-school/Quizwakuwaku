<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Integer movie = (Integer)request.getAttribute("movie");	  // MovieServletから来た"movie"の値をここで用意したmovieという変数の中に入れます
%>																<%-- ここでは１～４の値が入ってます --%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>ご褒美動画</title>
		<link rel="stylesheet" type="text/css"
			  href="${pageContext.request.contextPath}/css/style2.css">
	</head>
	
	<body>
		<h1>ご褒美動画</h1>
		<p>
			全ステージクリアした方のみが観ることができる<br>
			ご褒美動画です。ごゆっくりお楽しみください。
		</p>
		<br>
		
<%
	if(movie == 1) {				//　もしもmovieの値が１のときには下の動画を表示させます
%>
		<iframe
			 width="560" height="315" src="https://www.youtube.com/embed/Ud_tA4igvAM?autoplay=1&mute=1" title="YouTube video player"
			 allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
		</iframe>
<%
	}
	else if(movie == 2) {			//　もしもmovieの値が２のときには下の動画を表示させます
%>
        <%-- <iframe>はYouTube共有から埋め込みで取ってくる --%>
		<%-- 動画リンクの最後に?autoplay=1&mute=1を付けることでページ切り替え後自動再生 --%>
		<iframe                                                                                                              
			width="560" height="315"height="315" src="https://www.youtube.com/embed/HWlJpv1sFJM?autoplay=1&mute=1" title="YouTube video player" 
		    allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
		</iframe>
<%
	}
	else if(movie == 3) {			//　もしもmovieの値が３のときには下の動画を表示させます
%>
		<iframe 
			width="560" height="315" src="https://www.youtube.com/embed/5WFgTDIqzAQ?autoplay=1&mute=1" title="YouTube video player" 
			allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
		</iframe>
<%
	}
	else if(movie == 4) {			//　もしもmovieの値が４のときには下の動画を表示させます
%>
		<iframe 
			width="560" height="315" src="https://www.youtube.com/embed/fCMffw4qq4k?autoplay=1&mute=1" title="YouTube video player" 
			allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen>
		</iframe>
<%
	}
%>
		 <br>
		  <br>
		   <br>
		    <br>
		    
		<button id="buttons" type="button" onclick="history.back()">さっきの画面に戻る</button>
				<br>
			  <br>
		<form method="get" action="${pageContext.request.contextPath}/top">		
		<div>
			<input id="buttons" type="submit" value="トップ画面に戻る">		
		</div>
		</form>
	</body>
</html>