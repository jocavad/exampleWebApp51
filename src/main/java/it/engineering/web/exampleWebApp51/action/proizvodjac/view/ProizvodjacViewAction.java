package it.engineering.web.exampleWebApp51.action.proizvodjac.view;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacViewAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Proizvodjac pr = ProizvodjacRepository.getInstance()
				.findByPib(request.getParameter("pib"));
		request.setAttribute("przv", pr);
		return WebConstant.PAGE_PROIZV_VIEW;
	}
	
}
