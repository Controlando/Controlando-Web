<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="pt-br">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" type="text/css" href="interface.css"/> 

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">

        <title>Controlando - Cadastro</title>

    </head>

    <body style="background-repeat:no-repeat; overflow-x: hidden; background-color: #F0F8FF;">
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
                <a class="navbar-brand" href="telaInicial.jsp"><h3>Controlando</h3></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#form" style="color: white;">Início</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#rodape" style="color: white;">Sobre</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#rodape" style="color: white;">Contato</a>
                        </li>
                    </ul>


                </div>
            </nav>


        </header>
        <br><br><br> 
        <section  style="height: 700px;">



            <div class="corpo" style="padding-left: 35%; padding-right: 35%; height: 75%; ">

                <form name="formInsereAdm" method="post" action="InserirAdm" target="_parent">
                    <fieldset class="fieldset" id="fieldsetEmpresa">

                        <legend style="text-align: center"> <b>Cadastro</b></legend>
                        <legend><b>Empresa</b></legend>

                        <!-- Default input email -->
                        <label class="grey-text" id="labelEmail">Nome:</label>
                        <input name="txtNomeEmp" type="text" class="form-control" maxlength="50">

                        <label for="defaultFormLoginEmailEx" class="grey-text" id="labelEmail">Email:</label>
                        <input name="txtEmailEmp" type="email" class="form-control">


                    </fieldset>

                    <br>

                    <fieldset class="fieldset" id="fieldsetAdm">
                        <legend> <b>Administrador</b></legend>

                        <label class="grey-text" id="labelEmail">Nome:</label>
                        <input name="txtNomeAdm" type="text" class="form-control" maxlength="50">

                        <label for="defaultFormLoginEmailEx" class="grey-text" id="labelEmail">Email:</label>
                        <input name="txtEmailAdm" type="email" id="inputEmail" class="form-control">

                        <label for="defaultFormLoginPasswordEx" class="grey-text" id="labelSenha">Senha:</label>
                        <input name="txtSenha" type="password" class="form-control">

                        <div class="text-center mt-4">
                            <button class="btn btn-light-blue btn-md" style="background-color: #8A2BE2; color: white" id="btnCancel" type="reset" ><a style="color:white">Cancelar</a></button>
                            <button class="btn btn-light-blue btn-md" style="background-color: #8A2BE2; color: white " id="btnConfirm" type="submit" onclick="msg()" > <a style="color:white">Confirmar</a></button>
                        </div>                                                                                              
                    </fieldset>
                </form>
                <!-- Default form login -->
            </div> 

        </section>  

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