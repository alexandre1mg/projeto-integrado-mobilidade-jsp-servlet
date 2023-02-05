<jsp:include page="header.html" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
    boolean logado = session.getAttribute("cpf") == null ? false : true;
    String idUsuarioLogado = String.valueOf(session.getAttribute("id_usuarios"));
    int id_user = Integer.parseInt(idUsuarioLogado);
%>
<html>
<head>

  <title>Pagamento</title>
  <link rel="stylesheet" href="stylemob.css" />
  <style>
    #ctbox4 {
      text-align: center;
      border: 2px solid black;
      width: 50em;
      height: 500px;
      padding-top: 10px;
      padding-left: 20px;
      align-content: center;
      margin: auto auto;
      margin-top: 20px;
      margin-left: auto;
      margin-right: auto;
      border-radius: 5%;
      display: flex;
    }
  </style>
  <script>
    function pedido() {
      window.alert("Seu pedido foi enviado com sucesso!")
    }

  </script>
</head>

<body>
  <div>
    <h2>Pedir Passe</h2>
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
    <div id="ctbox4">
      <div class="infos">
        <form action="ServletPedirPasse" method="post">
        	<input type="hidden" name="id_usuario" value="<%=id_user %>">
        	 Selecione o tipo de passe:
        <select name="passe" id="">
          <option value="passe_estudantil">Passe Estudantil</option>
          <option value="cartao_mobilidade">Cartão +Mobilidade</option>
        </select>
        <p></p>
        <a href="index.jsp" onclick="pedido();"><button type="submit">Pedir</button></a>
        <p></p>
        <a href="index.jsp"><button>Voltar</button></a>
        </form>
       
        
      </div>

      <div></div>
    </div>
  </div>


</body>
</html>