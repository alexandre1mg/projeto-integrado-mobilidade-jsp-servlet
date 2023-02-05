package br.com.mobilidade.bean;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mobilidade.dao.PagamentosDao;
import br.com.mobilidade.dao.PedirPasseDao;
import br.com.mobilidade.model.FormaPg;
import br.com.mobilidade.model.TipoCartao;

/**
 * Servlet implementation class ServletPedirPasse
 */
@WebServlet(urlPatterns = "/ServletPedirPasse")
public class ServletPedirPasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
		String tipo=request.getParameter("passe");
		
		TipoCartao passe = new TipoCartao();
		passe.setTipo(tipo);
		Random gerador = new Random();
		passe.setNum_identificacao(gerador.nextInt(9999999));
		
		PedirPasseDao pedir = new PedirPasseDao();
				pedir.pedirPasse(passe, id_usuario);
		
        response.sendRedirect("index.jsp");
	}

}
