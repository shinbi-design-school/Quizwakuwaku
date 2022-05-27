package cc.shinbi.quizwakuwaku.servlet;

import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.bcel.Const;

import cc.shinbi.quizwakuwaku.model.User;



public abstract class JspServlet  {
		
	@Override
	protected void action(HttpServletRequest request, HttpServletResponse response,Connection connection) throws Exception {
		request.setCharacterEncoding("UTF-8");
		
		HttpSession session = request.getSession();
		User user = (User)session.getAttribute(Const.LOGIN_USER_KEY);
		
		String jsp = null;
		if(this.checkLogin && user == null) {
			jsp = "/WEB-INF/jsp/login.jsp";
		}
		else {
			jsp = this.view(request, response, connection, user);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(jsp);
		dispatcher.forward(request, response);
	}
	
	protected abstract String view(
			HttpServletRequest request,
			HttpServletResponse response,
			Connection connection,
			User loginUser
	)throws Exception;
}