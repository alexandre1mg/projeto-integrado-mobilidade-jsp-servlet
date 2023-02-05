package br.com.mobilidade.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mobilidade.dao.MovimentacaoDao;
import br.com.mobilidade.dao.PagamentosDao;
import br.com.mobilidade.model.FormaPg;
import br.com.mobilidade.model.Movimentacao;


@WebServlet(urlPatterns = "/ServletPix")
public class ServletPix extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
		String nome=request.getParameter("nome");
		String cpf=request.getParameter("cpf");
		Double valor=Double.parseDouble(request.getParameter("valor"));
		
		FormaPg pg =new FormaPg();
		pg.setForma("Pix");
		pg.setValor(valor);
		
		PagamentosDao pgdao = new PagamentosDao();
		pgdao.pgPIX(pg, id_usuario);
		
		Movimentacao m = new Movimentacao();
		m.setTipo("Creditado");
		m.setValor(valor);
		m.setDescricao("Foi depositado com Pix");
		
		MovimentacaoDao movi = new MovimentacaoDao();
		movi.novaMovimentacao(m, id_usuario);
 
        response.sendRedirect("pix.jsp");
	}

}
