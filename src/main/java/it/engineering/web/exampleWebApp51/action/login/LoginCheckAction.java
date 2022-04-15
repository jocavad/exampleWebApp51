package it.engineering.web.exampleWebApp51.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;

public class LoginCheckAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
//		System.out.println("loginCheckAction*****");
		return WebConstant.PAGE_INDEX;
	}
	
}
