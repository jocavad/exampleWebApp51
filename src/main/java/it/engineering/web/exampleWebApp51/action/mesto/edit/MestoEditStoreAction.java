package it.engineering.web.exampleWebApp51.action.mesto.edit;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

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
			
			//test only
//			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
//			Validator validator = factory.getValidator();
//			Set<ConstraintViolation<Mesto>> violations = validator.validate(mes);
//			for (ConstraintViolation<Mesto> violation : violations) {
//				request.setAttribute(violation.getPropertyPath()+"_error", violation.getMessage());
//			}
//			if (!violations.isEmpty()) {
//				request.setAttribute("mes", mes);
//				return WebConstant.PAGE_MESTO_EDIT;
//			}
			MestoRepository.getInstance()
			 .update(mes);
			request.setAttribute("mesta", MestoRepository.getInstance().getAll());
			return WebConstant.PAGE_MESTO_VIEW_ALL;	
		}
	}
	
}
