package br.com.mobilidade.bean;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mobilidade.control.Login;
import br.com.mobilidade.dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cpf = request.getParameter("cpf");
        String senha = request.getParameter("senha");

        Login login = new Login();
        login.setCpf(cpf);
        login.setSenha(senha);

        LoginDao loginDAO = new LoginDao();

        Login loginBuscado = loginDAO.pesquisar(login);

        if (loginBuscado.getCpf() != null) {
            HttpSession session = request.getSession();
            session.setAttribute("cpf", loginBuscado.getCpf());
            session.setAttribute("id_usuarios", loginBuscado.getId());
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

		
		
	}
	
}
