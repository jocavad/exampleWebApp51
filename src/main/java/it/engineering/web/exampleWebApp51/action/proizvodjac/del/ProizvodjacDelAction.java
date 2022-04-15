package it.engineering.web.exampleWebApp51.action.proizvodjac.del;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacDelAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Proizvodjac pr = ProizvodjacRepository.getInstance()
				.findByPib(request.getParameter("pib"));
		request.setAttribute("przv", pr);
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			request.setAttribute("proizvodjaci", ProizvodjacRepository.getInstance().getAll());
			return WebConstant.PAGE_PROIZV_VIEW_ALL;
		}else {
//			request.setAttribute("przv", pr);
			return WebConstant.PAGE_PROIZV_DEL;	
		}
	}
	
}
