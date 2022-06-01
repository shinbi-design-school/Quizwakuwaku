//ファーストステージ



package cc.shinbi.quizwakuwaku.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cc.shinbi.quizwakuwaku.model.Hantei;

@WebServlet("/stage")
public class StageServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public StageServlet1() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		Hantei hantei = Hantei.createHantei();
		
		String jsp = null;
		if(name == null || name.isEmpty()) {
			request.setAttribute("message", "名前を入力してください");
			request.setAttribute("hantei", hantei);
			session.setAttribute("hantei", hantei);
			jsp = "/WEB-INF/jsp/top.jsp";
		}
		else {
			request.setAttribute("hantei",  hantei);
			request.setAttribute("name", name);
			session.setAttribute("hantei", hantei);
			jsp = "/WEB-INF/jsp/firstStage.jsp";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}
}
