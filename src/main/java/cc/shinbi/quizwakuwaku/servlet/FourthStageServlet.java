package cc.shinbi.quizwakuwaku.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.shinbi.quizwakuwaku.model.Hantei4;

@WebServlet("/fourthStage")
public class FourthStageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FourthStageServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)  	//　post通信
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");							//	post通信の時には文字化けを防ぐための記述をする
		
		HttpSession session = request.getSession();					//	sessionを使うときのための記述もしておく
		
		String name = request.getParameter("name");			// JSPから来た"name"と名付けた変数に入ってる情報を新しく用意した変数nameの中に入れます
		Hantei4 hantei = Hantei4.createHantei();			// Hantei4.javaで用意しておいたcreateHantei()を使って問題文や解説文などの情報を
															// hanteiと名付けた変数に入れます		
		String jsp = null;
		request.setAttribute("hantei",  hantei);			// 問題文や解説文の情報を持たせたhanteiを"hantei"と名付けてリクエストにセットする
		request.setAttribute("name", name);					//	プレイヤーの名前の情報を持ったnameも"name"と名付けてリクエストにセットする
		session.setAttribute("hantei", hantei);
		jsp = "/WEB-INF/jsp/fourthStage.jsp";				//	JSPに/WEB-INF/jsp/fourthStage.jspのパスを持たせる
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);		//	jspの中に入っているパス先に画面移行させる
		dispatcher.forward(request, response);
	}
}
