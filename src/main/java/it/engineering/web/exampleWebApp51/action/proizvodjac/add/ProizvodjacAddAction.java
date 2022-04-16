package it.engineering.web.exampleWebApp51.action.proizvodjac.add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;
//import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacAddAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
//		Proizvodjac pr = ProizvodjacRepository.getInstance()
//				.findByPib(Integer.parseInt(request.getParameter("pib")));
//		request.setAttribute("przv", pr);
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			request.setAttribute("proizvodjaci", ProizvodjacRepository.getInstance().getAll());
			return WebConstant.PAGE_PROIZV_VIEW_ALL;
		}else {
			request.setAttribute("mesta", MestoRepository.getInstance()
											.getAll());
			return WebConstant.PAGE_PROIZV_ADD;	
		}
	}
	
}
