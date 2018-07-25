<!doctype html>

<html lang="pt-br">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">


        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" >
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>


        <link rel = "stylesheet" type = "text/css" href = "interflanca.css"/>    
        <link rel = "stylesheet" type = "text/css" href = "dropdown.css"/>    

        <link rel="stylesheet" type="text/css" href="interflanca.css">




        <title>Controlando</title>

        <style>

            div#cartao a{
                text-decoration: none;
                color: white;
            }

        </style>  

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
        <script>
            function msg1() {
                alert("Meta cadastrada com sucesso!");
            }

            function msg2() {
                alert("Receita cadastrada com sucesso!");
            }

            function msg3() {
                alert("Despesa cadastrada com sucesso!");
            }
        </script>     

        <!--Main Navigation-->
        <header >

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
        <br><br><br><br>



        <div class="modal fade" id="myModal1" role="dialog">
            <div class="modal-dialog">

                <!-- Card content -->
                <div class="card-body">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title" id="modalLongTitle">Adicionar receita</h3>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <form name="formInsereRec" method="post" action="InserirReceita" target="_parent">
                            <div class="modal-body" style="width:350px;">

                                <label for="defaultForm" class="grey-text" id="labelNome">Nome:</label>
                                <input type="text" name="txtNomeRec" class="form-control">

                                <label for="defaultForm" class="grey-text" id="labelValor">Valor:</label>
                                <input type="text" name="txtValorRec" class="form-control">

                                <label for="defaultForm" class="grey-text" id="labelData">Data limite:</label>
                                <input type="date" name="txtDataRec" class="form-control">


                                <br>
                                <label for="defaultForm" class="grey-text" id="labelPeriodo">Período:</label>
                                <select name="txtPeriodoDesp">
                                    <option value="Apenas uma vez">Apenas uma vez</option>
                                    <option value="Diario">Diario</option>
                                    <option value="Semanal">Semanal</option>
                                    <option value="Mensal">Mensal</option>
                                    <option value="Anual">Anual</option>
                                </select>
                            </div>

                            <div class="modal-footer">
                                <button type="submit" class="btn btn-default" style="background-color: #8A2BE2; color: white;">Salvar</button>
                                <button type="button" class="btn btn-default" style="background-color: #8A2BE2; color: white;" data-dismiss="modal">Fechar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>        


        <div class="modal fade" id="myModal2" role="dialog">
            <div class="modal-dialog">

                <!-- Card content -->
                <div class="card-body">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title" id="modalLongTitle">Adicionar Despesa</h3>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>
                        <form name="formInsereDesp" method="post" action="InserirDespesa" target="_parent">
                            <div class="modal-body" style="width:350px;">
                                <label for="defaultForm" class="grey-text" id="labelNome">Nome:</label>
                                <input type="text" name="txtNomeDesp" class="form-control">
                                <label for="defaultForm" class="grey-text" id="labelValor">Valor:</label>
                                <input type="text" name="txtValorDesp" class="form-control">
                                <label for="defaultForm" class="grey-text" id="labelData">Data limite:</label>
                                <input type="date" name="txtDataDesp" class="form-control">
                               
                                <br>
                                <label for="defaultForm" class="grey-text" id="labelPeriodo">Período:</label>
                                <select name="txtPeriodoDesp">
                                    <option value="Apenas uma vez">Apenas uma vez</option>
                                    <option value="Diario">Diario</option>
                                    <option value="Semanal">Semanal</option>
                                    <option value="Mensal">Mensal</option>
                                    <option value="Anual">Anual</option>
                                </select>
                                <br>
                                <label for="defaultForm" class="grey-text" id="labelNivel" >Nível de importância:</label>

                                <select name="txtNivelDesp">
                                    <option value="Baixo">Baixo</option>
                                    <option value="Medio">Médio</option>
                                    <option value="Alto">Alto</option>
                                </select>
                            </div>

                            <div class="modal-footer">
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-default" style="background-color: #8A2BE2; color: white;" onclick="msg3()">Salvar</button>
                                    <button type="button" class="btn btn-default" style="background-color: #8A2BE2; color: white;" data-dismiss="modal">Fechar</button>
                                </div> </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>                


        <div class="modal fade" id="myModal3" role="dialog">
            <div class="modal-dialog">

                <!-- Card content -->
                <div class="card-body">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h3 class="modal-title" id="modalLongTitle">Adicionar Meta</h3>
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                        </div>

                        <form name="formInsereMeta" method="post" action="InserirMeta" target="_parent">
                            <div class="modal-body" style="width:350px;">
                                <label for="defaultForm" class="grey-text" id="labelNome">Nome:</label>
                                <input type="text" name="txtNomeMeta" class="form-control">

                                <label for="defaultForm" class="grey-text" id="labelValor">Valor:</label>
                                <input type="text" name="txtValorMeta" class="form-control">

                                <label for="defaultForm" class="grey-text" id="labelData">Data limite:</label>
                                <input type="date" name="txtDataMeta" class="form-control">

                                <label for="defaultForm" class="grey-text" id="labelDescricao">Descrição:</label>
                                <input type="text" name="txtDescricaoMeta" class="form-control">

                                
                            </div>

                            <div class="modal-footer">
                                <button type="submit" class="btn btn-default" style="background-color: #8A2BE2; color: white;" onclick="msg1()">Salvar</button>
                                <button type="button" class="btn btn-default" style="background-color: #8A2BE2; color: white;" data-dismiss="modal">Fechar</button> </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>             


        <section id="corpoPrincipal">

            <div class="card-deck">

                <!-- Card 1 -->

                <div class="card mb-4" id="cartao1">

                    <!-- Card image -->

                    <img class="card-img-top" id="cardRec" src="img/receita.png" alt="Card image cap">
                    <div class="mask rgba-white-slight"></div>



                    <button class = "btn" type="button" id="botao1" data-toggle="modal" data-target="#myModal1">Adicionar receita</button>   
                </div>



                <div class="card mb-4" id = "cartao2">

                    <!-- Card image -->
                    <img class="card-img-top" id="cardDesp" src="img/despesa.png" alt="Card image cap">
                    <div class="mask rgba-white-slight"></div>


                    <button type="button" class="btn" id="botao2" data-toggle="modal" data-target="#myModal2">Adicionar despesa</button>

                </div>



                <div class="card mb-4" id="cartao3">

                    <!-- Card image -->

                    <img class="card-img-top" id="cardRec" src="img/meta.png" alt="Card image cap">
                    <div class="mask rgba-white-slight"></div>


                    <button type="button" class="btn" id="botao3" data-toggle="modal" data-target="#myModal3">Adicionar meta</button>   

                </div>   

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

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

    </body>

</html>