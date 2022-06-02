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

import cc.shinbi.quizwakuwaku.model.Hantei5;
import cc.shinbi.quizwakuwaku.model.Result;

@WebServlet("/result5")
public class ResultServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ResultServlet5() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		
		Hantei5 hantei = (Hantei5)session.getAttribute("hantei");
		String name = request.getParameter("name");
		
		String jsp = null;
	
		String[] keys = {"q1", "q2", "q3", "q4", "q5"};
		List<Integer> answers = new ArrayList<Integer>();
		for(String key : keys) {
			String value = request.getParameter(key);
			answers.add(Integer.parseInt(value));
		}
		Result result = hantei.check(answers);
		
		int clear = 2;
		if(Hantei5.checkNum(answers) > clear) {
			request.setAttribute("result",  result);
			request.setAttribute("name", name);
			jsp = "/WEB-INF/jsp/allClear.jsp";
		}
		else {
			request.setAttribute("result",  result);
			request.setAttribute("name", name);
			jsp = "/WEB-INF/jsp/gameover.jsp";
		}
	
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}
}
