<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8"> 
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
      
    <link rel = "stylesheet" type = "text/css" href = "interface.css"/> 
    <link rel = "stylesheet" type = "text/css" href = "dropdown.css"/> 
      
  
    <title>Controlando - Bem-vindo!</title>
         
  </head>
    
<body>
    
    <%
        String senha = (String) session.getAttribute("password");
        String emailIndividual = (String) session.getAttribute("emailIndividual");
        String emailEmp = (String) session.getAttribute("emailEmpresa");
        int id = (int) session.getAttribute("id");
        
        if (senha == null) {
            response.sendRedirect("telaInicial.html");
        }
    %>
<!--Main Navigation-->
        <header id=cabecalho>

            <nav class="navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar" style="background-color: #8A2BE2">
                <a class="navbar-brand" href="telaPrincipal.jsp"><h3>Controlando</h3></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        
                        <li class="nav-item">
                            <button id = "botao" type="button" class="btn btn-primary" data-toggle="modal" style="background-color: #8A2BE2; border-color: #8A2BE2;"> <a href="lancamentos.html" style="color: white">Lançamentos</a></button>
                        </li>

                        <li class="nav-item">
                            <button id = "botao" type="button" class="btn btn-primary" data-toggle="modal" style="background-color: #8A2BE2; border-color: #8A2BE2;"> <a href="relatorioView.jsp" style="color: white">Relatório</a></button>
                        </li>

                        <li class="nav-item">
                            <button id = "historico" type="button" class="btn btn-primary" data-toggle="modal" style="background-color: #8A2BE2; border-color: #8A2BE2;"> <a href="historico.jsp" style="color: white">Histórico</a></button>
                        </li>

                        <li class="nav-item">
                            <button id = "contador" type="button" class="btn btn-primary" data-toggle="modal" style="background-color: #8A2BE2; border-color: #8A2BE2;"> <a href="contador.jsp" style="color: white">Contador</a></button>
                        </li>
                    </ul>
                    <ul class="md-form left ml-auto">
                       <ul class="navbar-nav mr-auto">
                            <li> 
                                <form class="form-inline">
                                    <div class="dropdown">
                                       <button type="button" class="dropbtn btn btn-primary btn-default btn-md my-sm-0 mr-5 ml-5 mt-3 dropdown-toggle" style="background-color:#311b92; color: white;" data-toggle="dropdown" ><img src="img/user.png" class="rounded-circle"></button>
                                      <div class="dropdown-content">
                            
                                            <a class="dropdown-item" href="configuracao.jsp"><img src="img/settings.png"> Configurações</a>
                                            
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="Deslogar.jsp"><img src="img/out2.png"> Sair</a>
                                      </div>
                                    </div>
                                </form>
                        </li>
                        </ul>  
                    </ul>
                </div>
            </nav>    
    
    </header>
    <br><br><br><br>
    <article id = "corpoPrincipal" >
        
        <section id="coluna_esquerda"  >
        <br><br>
        <div class="card card-body" style="width: 100%; height: 80%; background:#4B088A;width: 120%; height: 80%;">
            <p class="card-title" style="color:white; font-size:120%">Boa tarde, @NomeUsuário! </p>
            <p class="card-text" style="text-align:center; color:white; font-size:200%; margin-top:10%">R$ 0,00 <br> Saldo Geral</p>
            
        </div>
            
        <br>
            
        <div class="card card-body" style="width: 120%; height: 80%;">
            
            <h4 class="card-title" style="font-size: 130%; font-family:Calibri Light;"> 
                <b>Contas a pagar <input type="image" src="img/plus2.png" alt="Submit" style="margin-left:40%"> <input type="image" src="img/trash.png" alt="Submit"></b>
            </h4>
            <p class="card-text"><br>Não há despesas inseridas.</p>
            <p class="card-text"><a href="lancamentos.jsp">Adicione suas despesas aqui!</a></p>
            
        </div>
            
        <br>
            
        <div class="card card-body"  style="width: 120%; height: 80%;" >
    
            <h4 class="card-title" style="font-size: 130%; font-family:Calibri Light;"> 
                <b>Contas a receber<input type="image" src="plus2.png" alt="Submit" style="margin-left:40%"> <input type="image" src="img/trash.png" alt="Submit"></b>
            </h4>    
            <p class="card-text"><br>Não há contas a receber.</p>
             <p class="card-text"><a href="lancamentos.jsp">Adicione suas receitas aqui!</a></p>
            
        </div>
            
        <br>    
        <div class="card card-body" style="width: 120%; height: 65%;" >
            <h4 class="card-title" style="font-size: 130%; font-family:Calibri Light;"><b>Dúvidas</b></h4>
            <p class="card-text"><a href="Link Aqui">Pergunta 1</a></p>
            <p class="card-text"><a href="Link Aqui">Pergunta 1</a></p>
            <p class="card-text"><a href="Link Aqui">Pergunta 1</a></p>
            
        </div>
        
        </section>
        
        
        
        <section id="coluna_direita">
        <br><br>
        

        <div class="card card-body" id = "botoes" style="width: 120%; height: 60%;" >
            <h4 class="card-title" style="font-size: 130%; font-family:Calibri Light;"><b>Acesso rápido</b></h4>
            <br>
          
            <div style="display: inline;">
                
            <div class="botao" style="float: left; margin-right: 2%">
                <button type="button" class="btn btn-outline-success"><a href="lancamentos.jsp"> Despesas </a></button>
                                                                       
               
            </div>
                
            <div class="botao" style="float: left;">
                <button type="button" class="btn btn-outline-primary"><a href="lancamentos.jsp">Receitas </a></button>
            </div>
                
            <div class="botao" style="float: left; margin-left: 2%">
                <button type="button" class="btn btn-outline-secondary"><a href="relatorioView.jsp">Relatórios</a></button>
            </div>
                
            </div>
             
        </div>
            
        <br>
        <br>
            
        <div class="card card-body" style="width: 120%; height: 80%;" >
            <h4 class="card-title" style="font-size: 130%; font-family:Calibri Light;"><b>Urgências</b></h4>
            <p class="card-text">Aqui serão listadas as contas a serem pagas com um nível de urgência mais alto.</p>
            
            <div class="flex-row">
                <p class="card-text"><a href="lancamentos.jsp">Adicione despesas aqui!</a></p>
                
            </div>
        </div>
            
        <br>
            
        <div class="card card-body" style="width: 120%; height: 80%;">
            <h4 class="card-title" style="font-family:Calibri Light;"><b>Metas do mês</b></h4>
            <p class="card-text">Nenhuma meta adicionada ainda.</p>
            <p class="card-text"><a href="lancamentos.jsp">Adicione suas metas aqui!</a></p>
            
            
            
        </div>    
            
        </section>
    </article>
    
    <footer class="page-footer font-small blue pt-4 mt-4" style="color: white;" id="rodape">
        <div class="container-fluid text-center text-md-left">
            <div class="row" style="background-color: #8A2BE2;">
                <div style="margin-left: 2%">
                    <h5 class="text-uppercase">Sobre</h5>
                    <h6>O Controlando é uma plataforma de controle de</h6>
                    <h6>finanças para sua empresa ou startup.</h6>
                    
                </div>
                
                <div style="margin-left:20%; margin-top: 1% ">
                    <img src="img/bank.png">
                </div>
                
                <div style="margin-left: 25%">
                   
                    <h6 class="text-uppercase" >Confira nossas redes sociais</h6>
                    <ul class="list-unstyled">
                        <li ><a href="https://www.instagram.com/?hl=pt-br"><img src="img/instagram.png"> <b>Instagram.com/Controlando</b> </a> </li>
                        <li><a href="https://pt-br.facebook.com/"><img src="img/facebook.png"><b> Facebook.cm/Controlando </b> </a> </li>
                        <li><a href="https://twitter.com/?lang=pt-br"><img src="img/twitter.png"> <b> Twitter.com/Controlando </b> </a> </li>
                    </ul>
                </div>
                
            </div>
        </div>
        
        <div class="footer-copyright py-3 text-center" style="background-color:#4B0082 ">
            © 2018 Copyright: Controlando
        </div>    
    </footer>
    
    <script> src="/jquery/dist/jquery.min.js"</script>
    <script> src="/popper.js/dist/umd/popper.min.js"</script>
    <script> src="/bootstrap/dist/js/bootstrap.min.js"</script>
    
</body> 
</html>