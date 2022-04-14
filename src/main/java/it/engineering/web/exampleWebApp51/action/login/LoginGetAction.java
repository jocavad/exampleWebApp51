package it.engineering.web.exampleWebApp51.action.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;

public class LoginGetAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		return WebConstant.PAGE_LOGIN;
	}
	
}
