package it.engineering.web.exampleWebApp51.action.proizvodjac.add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.domain.Proizvodjac;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;
import it.engineering.web.exampleWebApp51.repository.ProizvodjacRepository;

public class ProizvodjacAddStoreAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		
		Mesto mes = MestoRepository.getInstance()
							.findByPtt(Integer.parseInt(request.getParameter("mesto")));
//		Mesto mes = new Mesto();
//		mes.setPtt(Integer.parseInt(request.getParameter("mesto")));
//		
//		
		Proizvodjac pr = new Proizvodjac(request.getParameter("pib")
										,request.getParameter("naziv")
										,request.getParameter("adresa")
										,request.getParameter("matBroj")
										,mes
										);
		
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			request.setAttribute("przv", pr);
			return WebConstant.PAGE_PROIZV_ADD;
		}else {
			if(ProizvodjacRepository.getInstance()
					.findByPib(request.getParameter("pib")) != null) {
				request.setAttribute("przv", pr);
				request.setAttribute("error", "proizvodjac vec postoji");
				return WebConstant.PAGE_PROIZV_ADD;
			}
			ProizvodjacRepository.getInstance()
			 .save(pr
//					 new Proizvodjac(request.getParameter("pib")
//						,request.getParameter("naziv")
//						,request.getParameter("adresa")
//						,request.getParameter("matBroj")
//						,mes
//						)
					 );
			request.setAttribute("proizvodjaci", ProizvodjacRepository.getInstance()
					.getAll());
			return WebConstant.PAGE_PROIZV_VIEW_ALL;	
		}
		
	}
	
}
