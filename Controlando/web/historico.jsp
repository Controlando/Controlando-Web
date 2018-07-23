<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="conexao" scope="page" class="bancoDados.ConexaoBancoDados"/>
<jsp:useBean id="historico" scope="page" class="bancoDados.Historico"/>


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
        <link rel = "stylesheet" type = "text/css" href = "interface.css"/>    



        <title>Controlando - Histórico</title>

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

                                            <a class="dropdown-item" href="configura%C3%A7ao.jsp"><img src="img/settings.png"> Configurações</a>

                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="telaInicial.jsp"><img src="img/out2.png"> Sair</a>
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
            <div class="container">
                <h1 style="text-align: center; border-width: 1px; border-style: solid; border-color:#DDA0DD;">Histórico</h1>
                <table class="table" style="margin-top: 5% ">
                    <%
                        ResultSet rsRegistros;

                        if (conexao.abrirConexao()) {
                            historico.configurarConexao(conexao.obterConexao());

                            rsRegistros = historico.lerHistorico();

                            if (rsRegistros != null) {
                                out.println("<tr><th>Nome do Contador</th><th>Código do contador</th><th>Data</th><th>Hora</th><th>Descrição</th></tr>");

                                while (rsRegistros.next()) {
                                    out.print("<tr>");
                                    out.print("<td scope='col'>" + rsRegistros.getString("") + "</td>");
                                    out.print("<td scope='col'>" + rsRegistros.getString("codContador") + "</td>");
                                    out.print("<td scope='col'>" + rsRegistros.getString("data") + "</td>");
                                    out.print("<td scope='col'>" + rsRegistros.getString("hora") + "</td>");
                                    out.print("<td scope='col'>" + rsRegistros.getString("descricao") + "</td>");

                                    out.print("</tr>");
                                }
                                out.println("</table>");
                                out.println("<br>");
                            } else {
                                out.println("<p>Falha na exibição dos registros!</p>");
                            }

                            conexao.fecharConexao();
                        } else {
                            out.println("<p>Falha na conexão com o banco de dados!</p>");
                        }

                    %>
                </table>
            </div>

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



        <script> src = "/jquery/dist/jquery.min.js"</script>
        <script> src = "/popper.js/dist/umd/popper.min.js"</script>
        <script> src = "/bootstrap/dist/js/bootstrap.min.js"</script>



    </body> 
</html>