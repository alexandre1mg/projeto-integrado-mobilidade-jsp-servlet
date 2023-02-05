<jsp:include page="header.html" />
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
  <link rel="stylesheet" href="css/stylemob.css" />
</head>
<body>
	
  <div id="onze">
    <h2>Acesso</h2>
  </div>
  <div id="onze">
    <img width="50%" src="img/onze.png" alt="">
  </div>
  <div id="ctlogin">
    <h2>Login</h2>
    <form action="ServletLogin" method="post">
      <div>Login* :<input type="text" name="cpf">
        <p></p>
      </div>
      <div>Senha* :<input type="password" name="senha">
        <p></p>
      </div>
      <input type="submit" name="" id="" value="Entrar">
      <p></p>
    </form>
    <a href="cadastrar.jsp">Cadastrar-se</a>
  </div>
	
</body>
</html>