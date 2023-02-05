<jsp:include page="header.html" />
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Cadastrar</title>
<link rel="stylesheet" href="css/style.css" />
 <script type="text/javascript">
  function cad() {
	  window.alert("Cadastro realizado com sucesso!");
}
  </script>
</head>
<body>
	<div class="container10" style="text-align: center">
		    <div class="">
        <h1 class="display-4">Cadastro</h1>
        <form action="ServletUsuario" method="post">
             <input placeholder="Nome" type="text" name="nm"><br><br/>
             <input placeholder="CPF" type="text" name="cpf"> <br> <br/>
             <input placeholder="Email" type="text" name="email"> <br><br/> 
             <input placeholder="Senha" type="password" name="senha"> <br><br/>
             <input placeholder="Telefone" type="text" name="telefone"> <br><br/> 
             <input placeholder="Endereço" type="text" name="endereco"> <br><br/>  
             <input onclick="cad();" type="submit" value="Cadastrar"> 
        </form>
        
    </div>
	</div>

</body>
</html>