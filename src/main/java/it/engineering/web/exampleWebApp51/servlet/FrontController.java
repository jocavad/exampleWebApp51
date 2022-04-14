package it.engineering.web.exampleWebApp51.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.exampleWebApp51.controller.ApplicationController;


/**
 * Servlet implementation class FrontController
 */
@WebServlet("/application/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationController applicationController;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String page = applicationController.processRequest(request, response);
//		vratio stranicu korisniku - string
		request.getRequestDispatcher(page).forward(request, response);
	}
	
	@Override
	public void init() throws ServletException {
		super.init();
		applicationController = new ApplicationController();
		System.out.println("===========(created application controller)");
	}
}
