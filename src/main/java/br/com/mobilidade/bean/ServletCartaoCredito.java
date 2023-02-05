package br.com.mobilidade.bean;

import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mobilidade.dao.MovimentacaoDao;
import br.com.mobilidade.dao.PagamentosDao;
import br.com.mobilidade.dao.UsuarioDAO;
import br.com.mobilidade.model.CartaoCredito;
import br.com.mobilidade.model.FormaPg;
import br.com.mobilidade.model.Movimentacao;
import br.com.mobilidade.model.Usuario;

/**
 * Servlet implementation class EditarPerfilServlet
 */
@WebServlet(urlPatterns = "/ServletCartaoCredito")
public class ServletCartaoCredito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		 	int id_usuario = Integer.parseInt(request.getParameter("id_usuario"));
		 	String nome=request.getParameter("nome");
			String num_cartao=request.getParameter("num_cartao");
			Integer cod_seguranca=Integer.parseInt(request.getParameter("cod_seguranca"));
			
			
			
			Double valor=Double.parseDouble(request.getParameter("valor"));
			
			FormaPg pg =new FormaPg();
			pg.setForma("Cartão de Crédito");
			pg.setValor(valor);
			
			CartaoCredito ct = new CartaoCredito();
			ct.setNome(nome);
			ct.setNum_cartao(num_cartao);
			ct.setCod_seg(cod_seguranca);
			
			
			
			PagamentosDao pgdao = new PagamentosDao();
			pgdao.pgCartao(pg, id_usuario);
			
			Movimentacao m = new Movimentacao();
			m.setTipo("Creditado");
			m.setValor(valor);
			m.setDescricao("Foi depositado com Cartão");
			
			MovimentacaoDao movi = new MovimentacaoDao();
			movi.novaMovimentacao(m, id_usuario);
         
         request.getRequestDispatcher("index.jsp").forward(request, response);
	}

}
