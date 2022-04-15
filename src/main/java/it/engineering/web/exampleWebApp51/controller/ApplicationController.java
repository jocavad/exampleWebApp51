package it.engineering.web.exampleWebApp51.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.factory.ActionFactory;


public class ApplicationController {
		public String processRequest(HttpServletRequest request, HttpServletResponse response) {
			String method = request.getMethod();
			String path = request.getPathInfo();
			System.out.println("method: "+method);
			System.out.println("path: "+path);

			AbstractAction action = ActionFactory.createAction(request, response/*request.getMethod(), request.getPathInfo()*/);
			return action.executeRequest(request, response);
		}
}
