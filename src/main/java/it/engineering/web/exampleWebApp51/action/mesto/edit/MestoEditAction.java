package it.engineering.web.exampleWebApp51.action.mesto.edit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;

public class MestoEditAction extends AbstractAction {

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		Mesto mes = MestoRepository.getInstance()
				.findByPtt(Integer.parseInt(request.getParameter("ptt")));
			request.setAttribute("mes", mes);
			return WebConstant.PAGE_MESTO_EDIT;	
	}
	
}
