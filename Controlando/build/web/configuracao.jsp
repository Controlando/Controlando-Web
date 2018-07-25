<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" ></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>

        <link rel = "stylesheet" type = "text/css" href = "interface.css"/> 
        <link rel = "stylesheet" type = "text/css" href = "dropdown.css"/> 
        <title>Controlando-Configuração</title>
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
        <header id=cabecalho>

            <nav class="navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar" style="background-color: #8A2BE2">
                <a class="navbar-brand" href="telaPrincipal.jsp"><h3>Controlando</h3></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">

                        <li class="nav-item">
                            <button id = "botao" type="button" class="btn btn-primary" data-toggle="modal" style="background-color: #8A2BE2; border-color: #8A2BE2;"> <a href="lancamentos.jsp" style="color: white">Lançamentos</a></button>
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
                                            <a class="dropdown-item" href="configura%C3%A7ao.jsp"><img src="img/settings.png"> Configurações</a>

                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="telaInicial.html"><img src="img/out2.png"> Sair</a>
                                        </div>
                                    </div>
                                </form>
                            </li>
                        </ul>  
                    </ul>
                </div>
            </nav>    

        </header>

        <div class="container" style="margin-top: 10%">

            <div class="row">
                <div class="col-sm">
                    <b class="name" style="color:#8A2BE2" aria-controls="config"><strong>Contador</strong></b>
                </div>
                <div class="col-sm">
                    <b class="name" style="color:#8A2BE2" aria-controls="config"><strong>Empresa</strong></b>
                </div>

            </div>

            <div class="row">
                <div class="col">
                    <div class="config" id="config">
                        <div class="card card-body" style="margin-top:3%">
                            <img src="img/bank.png" style="background-color: #8A2BE2" class="rounded-circle" width="10%" height="10%">
                            <form>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationDefault01">Nome</label>
                                        <input type="text" class="form-control" id="validationDefault01" placeholder="Fulano" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationDefault03">Email</label>
                                        <input type="email" class="form-control" id="validationDefault03" placeholder="user@email.com" required>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="validationDefault05">Senha</label>
                                        <input type="password" class="form-control" id="validationDefault05" placeholder="***" required>
                                    </div>
                                </div>
                                <button class="btn btn-primary" type="submit" style="background-color:#8A2BE2 ">Atualizar contador</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="config2" id="config2">
                        <div class="card card-body" style="margin-top:3%" >
                            <img src="img/bank.png" style="background-color:#8A2BE2" class="rounded-circle" width="10%" height="10%">
                            <form>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationDefault01">Nome da Empresa</label>
                                        <input type="text" class="form-control" id="validationDefault01" placeholder="Controlando" width="10px" required>
                                    </div>
                                </div>
                                <div class="form-row">
                                    <div class="col-md-6 mb-3">
                                        <label for="validationDefault03">Email</label>
                                        <input type="email" class="form-control" id="validationDefault03" placeholder="user@email.com" required>
                                    </div>
                                    <div class="col-md-3 mb-3">
                                        <label for="validationDefault05">Senha</label>
                                        <input type="password" class="form-control" id="validationDefault05" placeholder="***" required>
                                    </div>
                                </div>
                                <button class="btn btn-primary" type="submit" style="background-color:#8A2BE2">Atualizar empresa</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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

        <script> src = "/jquery/dist/jquery.min.js"</script>
        <script> src = "/popper.js/dist/umd/popper.min.js"</script>
        <script> src = "/bootstrap/dist/js/bootstrap.min.js"</script>

    </body>
</html>