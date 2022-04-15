package it.engineering.web.exampleWebApp51.action.mesto.add;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.action.AbstractAction;
import it.engineering.web.exampleWebApp51.constant.WebConstant;
import it.engineering.web.exampleWebApp51.domain.Mesto;
import it.engineering.web.exampleWebApp51.repository.MestoRepository;

public class MestoAddStoreAction extends AbstractAction{

	@Override
	public String executeRequest(HttpServletRequest request, HttpServletResponse response) {
		String action = request.getParameter("action");
		if("cancel".equals(action)) {
			return WebConstant.PAGE_HOME;
		}else {
			Mesto mes = new Mesto(Integer.parseInt(request.getParameter("ptt"))
								 , request.getParameter("naziv"));
			MestoRepository.getInstance().save(mes);
			request.setAttribute("mesta", MestoRepository.getInstance().getAll());
			return WebConstant.PAGE_MESTO_VIEW_ALL;	
		}
	}
	
}
