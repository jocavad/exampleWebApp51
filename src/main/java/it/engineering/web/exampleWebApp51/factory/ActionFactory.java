package it.engineering.web.exampleWebApp51.factory;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.action.login.LoginCheckAction;
import it.engineering.web.exampleWebApp51.action.login.LoginGetAction;
import it.engineering.web.exampleWebApp51.action.login.LoginPostAction;
import it.engineering.web.exampleWebApp51.action.login.LogoutAction;
import it.engineering.web.exampleWebApp51.action.mesto.add.MestoAddAction;
import it.engineering.web.exampleWebApp51.action.mesto.add.MestoAddStoreAction;
import it.engineering.web.exampleWebApp51.action.mesto.view.MestoViewAllAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.add.ProizvodjacAddAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.add.ProizvodjacAddStoreAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.del.ProizvodjacDelAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.del.ProizvodjacDelStoreAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.edit.ProizvodjacEditAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.edit.ProizvodjacEditStoreAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.view.ProizvodjacViewAction;
import it.engineering.web.exampleWebApp51.action.proizvodjac.view.ProizvodjacViewAllAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.User;

public class ActionFactory {

	public static AbstractAction createAction(HttpServletRequest request, HttpServletResponse response) {
		AbstractAction action = null;
		String method = request.getMethod();
		String path = request.getPathInfo();

		List<User> lUsers = (List<User>) request.getServletContext().getAttribute("logged_in_users");
		
		
//		System.out.println("action---------"
//		+request.getSession(false).getAttribute("loginUser")+"/"+path);

		if (request.getSession(false).getAttribute("loginUser") == null 
				&& (!path.equals(WebConstant.PATH_LOGIN))) {
			
			action = new LoginCheckAction();
		} else {
			switch (path) {
			case WebConstant.PATH_LOGIN:
				if (method.equalsIgnoreCase("get")) {
					action = new LoginGetAction();
					break;
				}
				if (method.equalsIgnoreCase("post")) {
					action = new LoginPostAction();
					break;
				}
			case WebConstant.PATH_LOGOUT:
				action = new LogoutAction();
				break;
			case WebConstant.PATH_PROIZV_VIEW_ALL:
				action = new ProizvodjacViewAllAction();
				break;
			case WebConstant.PATH_PROIZV_VIEW:
				action = new ProizvodjacViewAction();
				break;
			case WebConstant.PATH_PROIZV_EDIT:
				action = new ProizvodjacEditAction();
				break;
			case WebConstant.PATH_PROIZV_EDIT_STORE:
				action = new ProizvodjacEditStoreAction();
				break;
			case WebConstant.PATH_PROIZV_ADD:
				action = new ProizvodjacAddAction();
				break;
			case WebConstant.PATH_PROIZV_ADD_STORE:
				action = new ProizvodjacAddStoreAction();
				break;
			case WebConstant.PATH_PROIZV_DEL:
				action = new ProizvodjacDelAction();
				break;
			case WebConstant.PATH_PROIZV_DEL_STORE:
				action = new ProizvodjacDelStoreAction();
				break;
			case WebConstant.PATH_MESTO_VIEW_ALL:
				action = new MestoViewAllAction();
				break;
			case WebConstant.PATH_MESTO_ADD:
				action = new MestoAddAction();
				break;
			case WebConstant.PATH_MESTO_ADD_STORE:
				action = new MestoAddStoreAction();
				break;
			default:
				break;
			}
		}
		return action;
	}

}
