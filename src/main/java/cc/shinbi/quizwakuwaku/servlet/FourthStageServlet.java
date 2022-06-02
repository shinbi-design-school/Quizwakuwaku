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

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		
		String name = request.getParameter("name");
		Hantei4 hantei = Hantei4.createHantei();
		
		String jsp = null;
		request.setAttribute("hantei",  hantei);
		request.setAttribute("name", name);
		session.setAttribute("hantei", hantei);
		jsp = "/WEB-INF/jsp/fourthStage.jsp";
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}
}
