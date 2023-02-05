<jsp:include page="header.html" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="br.com.mobilidade.model.Usuario"%>
<%@page import="br.com.mobilidade.model.Movimentacao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="br.com.mobilidade.dao.MovimentacaoDao"%>
<!DOCTYPE html>

<%
    boolean logado = session.getAttribute("cpf") == null ? false : true;
    String idUsuarioLogado = String.valueOf(session.getAttribute("id_usuarios"));
    int id_user = Integer.parseInt(idUsuarioLogado);
%>
<html>
<head>
  <title>Movimentação</title>
  <link rel="stylesheet" href="css/stylemob.css" />
  <style>
    #ctbox2 {
      text-align: left;
      border: 2px solid black;
      width: 70em;
      height: 500px;
      padding-top: 5px;
      padding-left 5px;
      align-content: center;
      margin: auto auto;
      margin-top: 20px;
      border-radius: 5%;
    }
  </style>
</head>
<body>
	  <div>
    <h2>Movimenteções</h2>
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
    <div id="ctbox2">
    	
    	     <%
				MovimentacaoDao moviDAO = new MovimentacaoDao();
      			Movimentacao movi = new Movimentacao();
      			moviDAO.pesquisar(id_user);
				ArrayList<Movimentacao> listait = moviDAO.pesquisar(id_user);
				for (int i = 0; i < listait.size(); i++) {
					movi = listait.get(i);
			
			%>
		<div >
            
            
        </div>
        <div class="itemmov">
			<h4><p>Passe Estudantil<output></output></p></h4>
			<h5><%=movi.getDescricao()%></h5>      
      	</div>      
			<%
			}
			%>

      

    </div>
  </div>
	
</body>
</html>