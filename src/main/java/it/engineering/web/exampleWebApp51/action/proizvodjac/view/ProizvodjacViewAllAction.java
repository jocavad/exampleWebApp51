package it.engineering.web.exampleWebApp51.action.proizvodjac.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacViewAllAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("proizvodjaci", ProizvodjacRepository.getInstance().getAll());
		return WebConstant.PAGE_PROIZV_VIEW_ALL;
	}
	
}
