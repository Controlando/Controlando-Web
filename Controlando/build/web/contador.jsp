<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="conexao" scope="page" class="bancoDados.ConexaoBancoDados"/>
<jsp:useBean id="contador" scope="page" class="bancoDados.Contador"/>
<%@page import="model.C_Contador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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


        <!-- Bootstrap CSS -->
        <!-- <link rel="style" type="text/css" href="interf.css"> -->
        <!--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        -->
        <title>Controlando - Contador</title>

    </head>

    <body>

        <%
        String senha = (String) session.getAttribute("password");
        String emailIndividual = (String) session.getAttribute("emailIndividual");
        String emailEmp = (String) session.getAttribute("emailEmpresa");
        int id = (int) session.getAttribute("idPessoa");
                 
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
                                            <a class="dropdown-item"href="telaInicial.jsp"><img src="img/out2.png"> Sair</a>
                                        </div>
                                    </div>
                                </form>
                            </li>
                        </ul>  
                    </ul>
                </div>
            </nav>    

        </header>

        <!-- Modal -->
        <div class="modal fade" id="modal1" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document" style="width:400px;">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title" id="exampleModalLongTitle">Cadastro Contador</h3>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body" style="width: 400px;">
                        <form name="formInsereAdm" method="post" action="InserirContador" target="_parent">
                            <div>
                                <p>Nome:</p>
                                <input type="text"  name="txtNomeCont"  class="form-control" style="margin-bottom: 3%">

                                <p>Email:</p>
                                <input type="email" name="txtEmailCont" class="form-control" style="margin-bottom: 3%">

                                <p> Senha:</p>
                                <input type="password" name="txtSenhaCont" class="form-control" style="margin-bottom: 3%">   

                                 

                            </div>

                    </div>
                    <div class="modal-footer">
                        <button type="reset" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter" style="background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;" > Cancelar</button>
                        <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter2" style="background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;" > Cadastrar</button>

                    </div>
                    </form>
                </div>
            </div>
        </div>

        <div class="modal fade" id="modal2" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document" style="width:400px;">
                <div class="modal-content">
                    <div class="modal-header">
                        <h3 class="modal-title" id="exampleModalLongTitle">Alteração do Contador</h3>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body" style="width: 400px;">
                        <%C_Contador Cont = new C_Contador();%>
                        <div>
                            <p>Código:</p>
                            <input type="text"  name="txtCodCont"  class="form-control" style="margin-bottom: 3%">
                            <button type="submit"  class="btn btn-primary" name="btnPesquisar" data-target="#exampleModalCenter2">Pesquisar</button>

                            <% if (request.getParameter("btnPesquisar") != null) {
                                    Cont = contador.getContadorByCodigo(request.getParameter("txtCodCont").toString());
                                }
                            %>
                            <form name="formInsereAdm" method="post" action="AtualizarContador" target="_parent">

                                <p>Nome:</p>
                                <input type="text" value="<%=Cont.getNome()%>" name="txtNomeCont"  class="form-control" style="margin-bottom: 3%">

                                <p>Email:</p>
                                <input type="email" value="<%=Cont.getEmailAdm()%>"name="txtEmailCont" class="form-control" style="margin-bottom: 3%">

                                <p> Senha:</p>
                                <input type="password" value="<%=Cont.getSenha()%>" name="txtSenhaCont" class="form-control" style="margin-bottom: 3%">   

                                <br>
                                <input type="text" name="txtEmailAdm" class="form-control" style="margin-bottom: 3%">  

                                </div>

                                </div>
                                <div class="modal-footer">
                                    <button type="reset" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter" style="background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;" > Cancelar</button>
                                    <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter2" style="background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;" > Cadastrar</button>

                                </div>
                            </form>

                        </div>
                    </div>
                </div>
            </div>


            <div class="modal fade" id="modal3" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered" role="document" style="width:400px;">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title" id="exampleModalLongTitle">Confirmação de Exclusão</h3>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body" style="width: 400px;">
                            <div>
                                <form name="formExcluirCont" method="post" action="ExcluirContador" target="_parent">
                                    <p>Código:</p>
                                    <input type="text"  name="txtCodCont"  class="form-control" style="margin-bottom: 3%">
                                    </div>

                                    </div>
                                    <div class="modal-footer">
                                        <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#exampleModalCenter2"> Excluir</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>


                    <br><br><br><br>

                    <section id = "corpoPrincipal" >
                        <div class="container">
                            <h1 style="text-align: center">Contador</h1> 
                            <table class="table">

                                <tr>
                                    <td></td>
                                    <td scope="col"> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal1" style="background-color: white; border-color: white; color: black"><img src="img/plus.png">  Adicionar contador </button></td>

                                    <td scope="col"> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal2" style="background-color: white; border-color: white; color: black"><img src="img/edit.png">  Alterar contador </button></td>

                                    <td scope="col"> <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modal3" style="background-color: white; border-color: white; color: black"><img src="img/trash.png">  Excluir contador </button></td>

                                </tr>

                            </table>
                            <br>

                            <table class="table" style="margin-top: 2%">
                                <%
                                    ResultSet rsRegistros;

                                    if (conexao.abrirConexao()) {
                                        contador.configurarConexao(conexao.obterConexao());

                                        rsRegistros = contador.lerContadorGeral();

                                        if (rsRegistros != null) {
                                            out.println("<tr><th>Código</th><th>Nome</th><th>Senha</th><th>Email</th></tr>");

                                            while (rsRegistros.next()) {
                                                out.print("<tr>");
                                                out.print("<td scope='col'>" + rsRegistros.getString("codigo") + "</td>");
                                                out.print("<td scope='col'>" + rsRegistros.getString("nome") + "</td>");
                                                out.print("<td scope='col'>" + rsRegistros.getString("senha") + "</td>");
                                                out.print("<td scope='col'>" + rsRegistros.getString("email") + "</td>");

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
                                    <img src="img/bank%20(1).png>
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


                    <!-- 
                    <script> src="/jquery/dist/jquery.min.js"</script>
                    <script> src="/popper.js/dist/umd/popper.min.js"</script>
                    <script> src="/bootstrap/dist/js/bootstrap.min.js"</script>
                    -->
                    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" ></script>
                    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" ></script>
                    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" ></script>


                    </body> 
                    </html>