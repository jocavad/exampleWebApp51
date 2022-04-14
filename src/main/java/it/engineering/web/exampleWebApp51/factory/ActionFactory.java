package it.engineering.web.exampleWebApp51.factory;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.action.login.LoginGetAction;
import it.engineering.web.exampleWebApp51.action.login.LoginPostAction;
import it.engineering.web.exampleWebApp51.action.login.LogoutAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;

public class ActionFactory {
	
	public static AbstractAction createAction(String method, String path) {
AbstractAction action = null;
		
		switch (path) {
		case WebConstant.PATH_LOGIN:
			if(method.equalsIgnoreCase("get")) {
				action = new LoginGetAction();
				break;
			}
			if(method.equalsIgnoreCase("post")) {
				action = new LoginPostAction();
				break;
			}
		case WebConstant.PATH_LOGOUT:
			action = new LogoutAction();
			break;
		default:
			break;
		}
		
		return action;
	}
	
}
