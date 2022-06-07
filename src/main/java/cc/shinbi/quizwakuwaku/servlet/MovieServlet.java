package cc.shinbi.quizwakuwaku.servlet;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/movie")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	public MovieServlet() {
        super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {			
		
		Integer movie = Integer.parseInt(request.getParameter("movie"));	// allClear.jspのformから送られてきた"movie"の中の値（１～４のどれか）を
																			// 新しく用意したmovieという名前の変数の中に入れます
		request.setAttribute("movie", movie);  // さっき作ったmovie変数の値を、"movie"と名付けてJSP側へ送るためにリクエストをセットします
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/movie.jsp");	//　movie.jspへ
		dispatcher.forward(request, response);
	}
}
