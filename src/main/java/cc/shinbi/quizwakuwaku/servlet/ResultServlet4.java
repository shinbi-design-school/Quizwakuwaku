package cc.shinbi.quizwakuwaku.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.shinbi.quizwakuwaku.model.Hantei4;
import cc.shinbi.quizwakuwaku.model.Result;

@WebServlet("/result4")
public class ResultServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ResultServlet4() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)		//　post通信
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");								//	post通信の時には文字化けを防ぐための記述をする
		
		HttpSession session = request.getSession();					//	sessionを使うときのための記述もしておく
		
		Hantei4 hantei = (Hantei4)session.getAttribute("hantei");		//	 ここではsessionになってるけどrequestで良かったかもしれません
		String name = request.getParameter("name");				//　JSPから来た"name"と名付けた変数に入ってる情報を新しく用意した変数nameの中に入れます
		
		String jsp = null;									//　jspという変数を用意しておく。（nullとして）
	
		String[] keys = {"q1", "q2", "q3", "q4", "q5"};			//　keysと名付けた配列の中に４ｔｈステージで出題された問題たちのキーを入れます
		List<Integer> answers = new ArrayList<Integer>();		//　answersと名付けたリストを用意する（中身の情報はまだ空っぽ）
		for(String key : keys) {								//	keysがあるかぎり（ここでは5個）
			String value = request.getParameter(key);			//　key(どの選択肢を選んだかがわかる）をJSPからゲットしてvalueと名付けた変数に入れて
			answers.add(Integer.parseInt(value));				//　それをString（文字列）型からInteger(数値）型に変えてanswersリストに加える
		}
		Result result = hantei.check(answers);					//	Hantei4.javaで作っておいたcheck()メソッドを使い、どの結果文を表示させるのか
																//　という情報をresultと名付けた変数に持たせておく
		int clear = 2;										//　ステージのクリア条件は3問以上なのですが、下のfor文で">="の記述をしていないので
															//　"clear = 2"と書いています。。。
		if(Hantei4.checkNum(answers) > clear) {	//　Hantei4.javaで用意しておいたcheckNum()メソッドを使って正解数を調べ、もしもプレイヤーがクリアしてたら
			request.setAttribute("result",  result);	//	表示させる結果文の情報を持たせたresultを"result"と名付けてリクエストにセットする
			request.setAttribute("name", name);			//	プレイヤーの名前の情報を持ったnameも"name"と名付けてリクエストにセットする
			jsp = "/WEB-INF/jsp/result4.jsp";			//	JSPに/WEB-INF/jsp/result4.jspのパスを持たせる
		}
		else {										//	 そうではなくてもしプレイヤーがクリアしていなかったら
			request.setAttribute("result",  result);	//	表示させる結果文の情報を持たせたresultを"result"と名付けてリクエストにセットする
			request.setAttribute("name", name);			//	プレイヤーの名前の情報を持ったnameも"name"と名付けてリクエストにセットする
			jsp = "/WEB-INF/jsp/gameover.jsp";			//	JSPに/WEB-INF/jsp/gameover.jspのパスを持たせる
		}
	
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);		//	jspの中に入っている各パス先に画面移行させる
		dispatcher.forward(request, response);
	}
}
