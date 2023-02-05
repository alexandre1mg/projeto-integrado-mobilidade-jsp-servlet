<jsp:include page="header.html" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagamento</title>
  <link rel="stylesheet" href="css/stylemob.css" />
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
      margin-left: 10%;
      border-radius: 5%;
      display: flex;
    }
  </style>
  <script type="text/javascript">
  function pgsucesso() {
	  window.alert("Pagamento efetuado com sucesso!");
}
  </script>
</head>
<body>
	 <div>
    <h2>Pagar com Cartão de Crédito</h2>
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
      <div class="cartaobox">
		<img width="300px" height="200px" alt="" src="img/cartanubank.png">
      </div>
      <div class="infos">
        NOME:<input type="text" class="itinfo" value="Alexandre B M"></input>
        CPF:<input type="text" class="itinfo" value="123.456.789-11"></input>
        VALOR:<input type="text" class="itinfo" value="R$15,00"></input>
        NÚMERO DO CARTÃO:<input type="text" class="itinfo" value="4512 0510 9874 9905"></input>
        VALIDADE:<input type="text" class="itinfo" value="02/26"></input>
        COD:<input type="text" class="itinfo" value="321"></input>
        <p></p>
        <a href="index.jsp" onclick="pgsucesso()"><button >Pagar</button></a> 
        <p></p>
        <a href="index.jsp"><button >Voltar</button></a>
      </div>

      <div></div>
    </div>
  </div>
	
</body>
</html>