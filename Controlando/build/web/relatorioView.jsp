<jsp:useBean id="conexao" scope="page" class="bancoDados.ConexaoBancoDados"/>
<jsp:useBean id="despesa" scope="page" class="bancoDados.Despesa"/>
<jsp:useBean id="receita" scope="page" class="bancoDados.Receita"/>
<jsp:useBean id="meta" scope="page" class="bancoDados.Meta"/>
<%@page import="java.sql.ResultSet"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Controlando - Relatórios</title>

        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js"></script>

        <link rel="stylesheet" type="text/css" href = "relatorioview.css">
        <link rel = "stylesheet" type = "text/css" href ="interface.css"/> 
        <link rel = "stylesheet" type = "text/css" href = "dropdown.css"/> 

        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js></script>



        <script src="js/easypiechart.js"></script>
        <script src="js/easypiechart-data.js"></script>
        <script src="./js/chart-data.js"></script>
        <script src="./js/chart.min.js"></script>
    </head>
    <body >
        <%
            
            String senha = (String) session.getAttribute("password");
            String emailIndividual = (String) session.getAttribute("emailIndividual");
            String emailEmp = (String) session.getAttribute("emailEmpresa");
            

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


        <div class="container" style="margin-top: 7%">
            <div class="row">
                <div class="col-8">
                    <div class="jumbotron jumbotron-fluid">
                        <div class="container">
                            <h1 class="display-4">Receitas</h1>
                            <div class="canvas-wrapper">
                                <canvas class="main-chart" id="line-chart" height="80" width="250"></canvas>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="col">
                    <div class="card border-success mb-3" style="max-width: 18rem;margin-top: 5%">
                        <div class="card-header">Relatório</div>
                        <div class="card-body text-success">
                            <h5 class="card-title">Receitas e Despesas</h5>
                            <p class="card-text">Receitas desde Janeiro até o dia corrente.</p>
                            <p class="card-text">Despesas desde Janeiro até o dia corrente.</p>
                        </div>
                    </div>
                </div>

            </div>
            <div class="row">
                <div class="col-8">
                    <div class="jumbotron jumbotron-fluid">
                        <div class="container">
                            <h1 class="display-4">Lucros</h1>
                            <div class="canvas-wrapper">
                                <canvas class="main-chart" id="line-chart1" height="80" width="250"></canvas>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card border-primary mb-3" style="max-width: 18rem;">
                        <div class="card-header">Lucros</div>
                        <div class="card-body text-primary">
                            <h5 class="card-title">Balança</h5>
                            <p class="card-text">Lucros consistentes.</p>
                            <p class="card-text">Possiveis riscos finaneiros.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="container">
            <h2>Despesas</h2>
            <table class="table table-hover">
                <%
                    ResultSet rsRegistros;
                    
                    int id = (int) session.getAttribute("idPessoa");

                    if (conexao.abrirConexao()) {
                        despesa.configurarConexao(conexao.obterConexao());

                        rsRegistros = despesa.lerDespesas(id);
                       
                        if (rsRegistros != null) {
                            out.println("<tr><th>Código</th><th>Nome</th><th>Valor</th><th>Nível</th><th>Período</th><th>Data</th></tr>");

                            while (rsRegistros.next()) {
                                out.print("<tr>");
                                out.print("<td scope='col'>" + rsRegistros.getString("codigo") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros.getString("nome") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros.getString("valor") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros.getString("nivel") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros.getString("periodo") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros.getString("data") + "</td>");
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
        <br>
        <br>
        <br>
        <br>
        <br>

        <div class="container">
            <h2>Receitas</h2>
            <table class="table table-hover">
                <%                   
                    ResultSet rsRegistros2;
                     int id2 = (int) session.getAttribute("idPessoa");

                    if (conexao.abrirConexao()) {
                        receita.configurarConexao(conexao.obterConexao());

                        rsRegistros2 = receita.lerReceitas(id2);

                        if (rsRegistros2 != null) {
                            out.println("<tr><th>Código</th><th>Nome</th><th>Valor</th><th>Período</th><th>Data</th></tr>");

                            while (rsRegistros2.next()) {
                                out.print("<tr>");
                                out.print("<td scope='col'>" + rsRegistros2.getString("codigo") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros2.getString("nome") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros2.getString("valor") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros2.getString("periodo") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros2.getString("data") + "</td>");
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

        <br>
        <br>
        <br>
        <br>
        <br>

        <div class="container">
            <h2>Metas</h2>
            <table class="table table-hover">
                <%                   
                    ResultSet rsRegistros3;

                    if (conexao.abrirConexao()) {
                        meta.configurarConexao(conexao.obterConexao());
                        int id3 = (int) session.getAttribute("idPessoa");
                        rsRegistros3 = meta.lerMetas(id3);

                        if (rsRegistros3 != null) {

                            out.println("<tr><th>Código</th><th>Nome</th><th>Data</th><th>Valor</th><th>Descrição</th></tr>");

                            while (rsRegistros3.next()) {
                                out.print("<tr>");
                                out.print("<td scope='col'>" + rsRegistros3.getString("codigo") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros3.getString("nome") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros3.getString("data") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros3.getString("valor") + "</td>");
                                out.print("<td scope='col'>" + rsRegistros3.getString("descricao") + "</td>");
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
            <br>
            <br>
            <br>
            <br>
            <br>
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
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/custom.js"></script>


        <script>
        window.onload = function () {
            var chart1 = document.getElementById("line-chart").getContext("2d");
            window.myLine = new Chart(chart1).Line(lineChartData, {
            responsive: true,
                    scaleLineColor: "rgba(0,0,0,.2)",
                    scaleGridLineColor: "rgba(0,0,0,.05)",
                    scaleFontColor: "#c5c7cc"
        });
        
        var chart11 = document.getElementById("line-chart1").getContext("2d");
        window.myLine = new Chart(chart11).Line(secondLineChartData, {
                    responsive: true,
                    scaleLineColor: "rgba(0,0,0,.2)",
                    scaleGridLineColor: "rgba(0,0,0,.05)",
                    scaleFontColor: "#c5c7cc"
        });
        var chart2 = document.getElementById("bar-chart").getContext("2d");
        window.myBar = new Chart(chart2).Bar(barChartData, {
                    responsive: true,
                    scaleLineColor: "rgba(0,0,0,.2)",
                    scaleGridLineColor: "rgba(0,0,0,.05)",
                    scaleFontColor: "#c5c7cc"
            });
            var chart3 = document.getElementById("doughnut-chart").getContext("2d");
                window.myDoughnut = new Chart(chart3).Doughnut(doughnutData, {
                    responsive: true,
                    segmentShowStroke: false
            });
            var chart4 = document.getElementById("pie-chart").getContext("2d");
                window.myPie = new Chart(chart4).Pie(pieData, {
                    responsive: true,
                    segmentShowStroke: false
                });
                var chart5 = document.getElementById("radar-chart").getContext("2d");
                window.myRadarChart = new Chart(chart5).Radar(radarData, {
                    responsive: true,
                    scaleLineColor: "rgba(0,0,0,.05)",
                    angleLineColor: "rgba(0,0,0,.2)"
                        });
                        var chart6 = document.getElementById("polar-area-chart").getContext("2d");
                            window.myPolarAreaChart = new Chart(chart6).PolarArea(polarData, {
                    responsive: true,
                    scaleLineColor: "rgba(0,0,0,.2)",
                    segmentShowStroke: false
                    });
                            };
        </script>	

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    </body>
</html>