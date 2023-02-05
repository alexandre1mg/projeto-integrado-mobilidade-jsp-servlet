<jsp:include page="header.html" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    boolean logado = session.getAttribute("cpf") == null ? false : true;
    String idUsuarioLogado = String.valueOf(session.getAttribute("id_usuarios"));
    int id_user = Integer.parseInt(idUsuarioLogado);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagamento</title>
  <link rel="stylesheet" href="stylemob.css" />
  <style>
    #ctbox2 {
      text-align: center;
      border: 2px solid black;
      width: 80em;
      height: 500px;
      padding-top: 10px;
      padding-left: 20px;
      align-content: center;
      margin: auto auto;
      margin-top: 20px;
      margin-left: 5%;
      border-radius: 5%;
      display: flex;
    }
  </style>
</head>
<body>
	 <div>
    <h2>Pagar com PIX</h2>
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
      <div class="qrcodebox">
        <div id="qrcode"><img alt="" src="img/qrcode.png"></div>
        <div id="chavepix"> 4562-1C32-Cdg3-G2td </div>
      </div>
      

      <div></div>
    </div>
  </div>
</body>
</html>