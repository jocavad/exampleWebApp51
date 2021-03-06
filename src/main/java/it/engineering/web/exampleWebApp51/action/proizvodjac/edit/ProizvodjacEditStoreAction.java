package it.engineering.web.exampleWebApp51.action.proizvodjac.edit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacEditStoreAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		Mesto mes = MestoRepository.getInstance()
							.findByPtt(Integer.parseInt(request.getParameter("mesto")));
		Proizvodjac pr = new Proizvodjac(request.getParameter("pib")
										,request.getParameter("naziv")
										,request.getParameter("adresa")
										,request.getParameter("matBroj")
										,mes
										);
		
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			request.setAttribute("przv", pr);
			return WebConstant.PAGE_PROIZV_VIEW;
		}else {
			if(mes == null) {
				pr = ProizvodjacRepository.getInstance()
					.findByPib(request.getParameter("pib"));
				request.setAttribute("przv", pr);
				request.setAttribute("error", "ne postoji ptt");
				return WebConstant.PAGE_PROIZV_EDIT;
			}
			ProizvodjacRepository.getInstance()
			 .update(pr);
			request.setAttribute("proizvodjaci", ProizvodjacRepository.getInstance().getAll());
			return WebConstant.PAGE_PROIZV_VIEW_ALL;	
		}
		
	}
	
}
