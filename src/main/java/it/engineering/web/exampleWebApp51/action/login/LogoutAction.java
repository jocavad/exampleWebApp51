package it.engineering.web.exampleWebApp51.action.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.User;

public class LogoutAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		
		List<User> lUsers = (List<User>)request.getServletContext().getAttribute("logged_in_users");
		User user = (User)session.getAttribute("loginUser");
		lUsers.remove(user);
		
		session.removeAttribute("loginUser");
		session.invalidate();
		session = request.getSession(false);
		
		return WebConstant.PAGE_INDEX;
	}
	
}
