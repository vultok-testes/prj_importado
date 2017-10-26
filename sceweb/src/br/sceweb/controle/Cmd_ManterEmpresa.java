package br.sceweb.controle;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cmd_ManterEmpresa implements ICommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		RequestDispatcher view = request.getRequestDispatcher("FormEmpresa.jsp");
        view.forward(request, response); 	
		
	}

}
