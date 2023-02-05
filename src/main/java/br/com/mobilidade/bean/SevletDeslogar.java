package br.com.mobilidade.bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SevletDeslogar
 */
@WebServlet(urlPatterns = "/ServletDeslogar")
public class SevletDeslogar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            session.invalidate();
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
	}



}
