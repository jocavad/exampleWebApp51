package it.engineering.web.exampleWebApp51.action.mesto.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;

public class MestoViewAllAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("mesta", MestoRepository.getInstance().getAll());
		return WebConstant.PAGE_MESTO_VIEW_ALL;
	}
	
}
