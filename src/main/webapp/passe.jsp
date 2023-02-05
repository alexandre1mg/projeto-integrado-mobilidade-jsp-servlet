<jsp:include page="header.html" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Tipo de Passe</title>
  <link rel="stylesheet" href="css/stylemob.css" />
  <style>
    #ctbox1 {
      text-align: center;
      border: 2px solid black;
      width: 50em;
      height: 400px;
      padding-top: 5px;
      align-content: center;
      margin: auto;
      margin-top: 20px;
      border-radius: 5%;
      display: flex;
    }
  </style>
</head>
<body>
	  <div>
    <h2>Meus Passes</h2>
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
    <div id="ctbox1">
      <div class="passitem">
        <h3>Passe Estudatil</h3>
        <img alt="" width="190px" height="230px" src="img/passeestudantil.jpg">
      </div>
      <div class="passitem">
        <h3>+Mobilidade</h3>
        <p>Não Possui</p>
      </div>
    </div>
  </div>
</body>
</html>