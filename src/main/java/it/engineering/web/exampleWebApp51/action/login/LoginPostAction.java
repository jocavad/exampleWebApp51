package it.engineering.web.exampleWebApp51.action.login;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.repository.UserRepository;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.User;

public class LoginPostAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {

		
		//ovo posle otkomentarisi
//		User user = login(request);
		
		
		//ovo posle brisi
		User user = new User();
		user.setUsername("admin");
		user.setPassword("admin");
		
		
		
		
		if(user != null) {
			
			HttpSession session = request.getSession(true);
//			ovo posle otkoment
//			if(session.getAttribute("loginUser")!=null) {
//				request.setAttribute("error_message", "vec ste ulogovani kao "+((User)session.getAttribute("loginUser")).getUsername());
//				return WebConstant.PAGE_LOGIN;
//			}
			
			
			
			//ovo brisi
//			System.out.println(session.getAttribute("loginUser"));
//			System.out.println(user);
			
			
			//postojeci korisnik sistema ima password, napravi novog bez password-a
			
			User loginUser = user.clone();
			
			//			user.setPassword(null);
			session.setAttribute("loginUser", loginUser/*user.getFirstname()+", "+user.getLastname()*/);
			return WebConstant.PAGE_HOME;
		}else {
			//ubaciti poruku za korisnika
			request.setAttribute("error_message", "korisnik ne postoji/pogresna sifra");
			return WebConstant.PAGE_LOGIN;
		}

	}
	
	private User login(HttpServletRequest request) {
		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		
//		User user = new User();
//		user.setUsername(username);
//		user.setPassword(password);
//		
		
		
		
		
//		List<User> users = UserStorage.getInstance().getUsers();
//		for (User current : users) {
//			if(current.equals(user)) {
//				return current;
//			}
//		}
		User u = UserRepository.getInstance().findByUsername(username);
		if (u!=null && u.getPassword().equals(request.getParameter("password"))) {
			return u;
		}else {
			return null;
		}
	}
	
}
