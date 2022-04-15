package it.engineering.web.exampleWebApp51.action.mesto.edit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class MestoEditStoreAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {

		Mesto mes = new Mesto(Integer.parseInt(request.getParameter("ptt"))
								,request.getParameter("naziv"));
				
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			request.setAttribute("mesta", MestoRepository.getInstance()
								.getAll());
			return WebConstant.PAGE_MESTO_VIEW_ALL;
		}else {
			MestoRepository.getInstance()
			 .update(mes);
			request.setAttribute("mesta", MestoRepository.getInstance().getAll());
			return WebConstant.PAGE_MESTO_VIEW_ALL;	
		}
	}
	
}
