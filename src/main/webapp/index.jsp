<jsp:include page="header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.mobilidade.model.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.mobilidade.dao.UsuarioDAO"%>

<%
    boolean logado = session.getAttribute("cpf") == null ? false : true;
    String idUsuarioLogado = String.valueOf(session.getAttribute("id_usuarios"));
    int id_user = Integer.parseInt(idUsuarioLogado);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<div>
    <h2>Acompanhamento de Cadastro</h2>
  </div>
  <div id="cttatble">
    <table>
      <tr>
        <th class="itemtable"><a href="pixform.jsp"> Pagar com PIX </a></th>
        <th class="itemtable"><a href="cartaoform.jsp"> Pagar com Cartão de Crédtio </a></th>
        <th class="itemtable"><a href="passe.jsp"> Meus Passes </a></th>
        <th class="itemtable"><a href="movimentacao.jsp"> Movimentações </a></th>
        <th class="itemtable"><a href="pedirpasse.jsp"> Pedir Passe </a></th>
      </tr>
    </table>
  </div>
  <div id="ctbody">
    <div id="ctfoto">
      <div><img src="img/boneco.png" height="200" alt=""></div>
      		<%
				UsuarioDAO usuarioDAO = new UsuarioDAO();
      			Usuario usuario = new Usuario();
      			usuarioDAO.pesquisar(id_user);
				ArrayList<Usuario> listait = usuarioDAO.pesquisar(id_user);
				for (int i = 0; i < listait.size(); i++) {
				usuario = listait.get(i);
			
			%>
		<div >
            <p>Nome: <output><%=usuario.getNome()%></output></p>
            <p>CPF:<output><%=usuario.getCpf()%></output></p>
        </div>
			<%
			}
			%>
      
    </div>

    <div id="ctbox">
      <div>
        <h3>Segue abaixo a descrição do status do seu cadastro e data da última atualização:</h3>
      </div>
      <div>
        <p>Status: Pendente</p>
      </div>
      <div>
        <p>Data: 08/08/2022 11:00</p>
      </div>
    </div>

  </div>
</body>
</html>