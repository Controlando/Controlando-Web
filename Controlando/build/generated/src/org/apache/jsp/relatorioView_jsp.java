package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class relatorioView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      bancoDados.ConexaoBancoDados conexao = null;
      synchronized (_jspx_page_context) {
        conexao = (bancoDados.ConexaoBancoDados) _jspx_page_context.getAttribute("conexao", PageContext.PAGE_SCOPE);
        if (conexao == null){
          conexao = new bancoDados.ConexaoBancoDados();
          _jspx_page_context.setAttribute("conexao", conexao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      bancoDados.Despesa despesa = null;
      synchronized (_jspx_page_context) {
        despesa = (bancoDados.Despesa) _jspx_page_context.getAttribute("despesa", PageContext.PAGE_SCOPE);
        if (despesa == null){
          despesa = new bancoDados.Despesa();
          _jspx_page_context.setAttribute("despesa", despesa, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      bancoDados.Receita receita = null;
      synchronized (_jspx_page_context) {
        receita = (bancoDados.Receita) _jspx_page_context.getAttribute("receita", PageContext.PAGE_SCOPE);
        if (receita == null){
          receita = new bancoDados.Receita();
          _jspx_page_context.setAttribute("receita", receita, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      bancoDados.Meta meta = null;
      synchronized (_jspx_page_context) {
        meta = (bancoDados.Meta) _jspx_page_context.getAttribute("meta", PageContext.PAGE_SCOPE);
        if (meta == null){
          meta = new bancoDados.Meta();
          _jspx_page_context.setAttribute("meta", meta, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Controlando - Relatórios</title>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.6.0/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href = \"relatorioview.css\">\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href =\"interface.css\"/> \n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"dropdown.css\"/> \n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/easypiechart.js\"></script>\n");
      out.write("        <script src=\"js/easypiechart-data.js\"></script>\n");
      out.write("        <script src=\"./js/chart-data.js\"></script>\n");
      out.write("        <script src=\"./js/chart.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");

            String senha = (String) session.getAttribute("password");
            String emailIndividual = (String) session.getAttribute("emailIndividual");
            String emailEmp = (String) session.getAttribute("emailEmpresa");
            int id = (int) session.getAttribute("id");

            if (senha == null) {
                response.sendRedirect("telaInicial.html");
            }
        
      out.write("\n");
      out.write("        <header id=cabecalho>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar\" style=\"background-color: #8A2BE2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"telaPrincipal.html\"><h3>Controlando</h3></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <button id = \"botao\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" style=\"background-color: #8A2BE2; border-color: #8A2BE2;\"> <a href=\"lancamentos.html\" style=\"color: white\">Lançamentos</a></button>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <button id = \"botao\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" style=\"background-color: #8A2BE2; border-color: #8A2BE2;\"> <a href=\"relatorioView.jsp\" style=\"color: white\">Relatório</a></button>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <button id = \"historico\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" style=\"background-color: #8A2BE2; border-color: #8A2BE2;\"> <a href=\"historico.jsp\" style=\"color: white\">Histórico</a></button>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <button id = \"contador\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" style=\"background-color: #8A2BE2; border-color: #8A2BE2;\"> <a href=\"contador.jsp\" style=\"color: white\">Contador</a></button>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"md-form left ml-auto\">\n");
      out.write("\n");
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                            <li> \n");
      out.write("                                <form class=\"form-inline\">\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <button type=\"button\" class=\"dropbtn btn btn-primary btn-default btn-md my-sm-0 mr-5 ml-5 mt-3 dropdown-toggle\" style=\"background-color:#311b92; color: white;\" data-toggle=\"dropdown\" ><img src=\"img/user.png\" class=\"rounded-circle\"></button>\n");
      out.write("                                        <div class=\"dropdown-content\">\n");
      out.write("\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"configura%C3%A7ao.html\"><img src=\"img/settings.png\"> Configurações</a>\n");
      out.write("\n");
      out.write("                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"telaInicial.html\"><img src=\"img/out2.png\"> Sair</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>  \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>    \n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"margin-top: 7%\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <div class=\"jumbotron jumbotron-fluid\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"display-4\">Receitas</h1>\n");
      out.write("                            <div class=\"canvas-wrapper\">\n");
      out.write("                                <canvas class=\"main-chart\" id=\"line-chart\" height=\"80\" width=\"250\"></canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card border-success mb-3\" style=\"max-width: 18rem;margin-top: 5%\">\n");
      out.write("                        <div class=\"card-header\">Relatório</div>\n");
      out.write("                        <div class=\"card-body text-success\">\n");
      out.write("                            <h5 class=\"card-title\">Receitas e Despesas</h5>\n");
      out.write("                            <p class=\"card-text\">Receitas desde Janeiro até o dia corrente.</p>\n");
      out.write("                            <p class=\"card-text\">Despesas desde Janeiro até o dia corrente.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-8\">\n");
      out.write("                    <div class=\"jumbotron jumbotron-fluid\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"display-4\">Lucros</h1>\n");
      out.write("                            <div class=\"canvas-wrapper\">\n");
      out.write("                                <canvas class=\"main-chart\" id=\"line-chart1\" height=\"80\" width=\"250\"></canvas>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <div class=\"card border-primary mb-3\" style=\"max-width: 18rem;\">\n");
      out.write("                        <div class=\"card-header\">Lucros</div>\n");
      out.write("                        <div class=\"card-body text-primary\">\n");
      out.write("                            <h5 class=\"card-title\">Balança</h5>\n");
      out.write("                            <p class=\"card-text\">Lucros consistentes.</p>\n");
      out.write("                            <p class=\"card-text\">Possiveis riscos finaneiros.</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Despesas</h2>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                ");

                    ResultSet rsRegistros;

                    if (conexao.abrirConexao()) {
                        despesa.configurarConexao(conexao.obterConexao());

                        rsRegistros = despesa.lerDespesas();

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

                
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Receitas</h2>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                ");
                   ResultSet rsRegistros2;

                    if (conexao.abrirConexao()) {
                        receita.configurarConexao(conexao.obterConexao());

                        rsRegistros2 = receita.lerReceitas();

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

                
      out.write("                    \n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>Metas</h2>\n");
      out.write("            <table class=\"table table-hover\">\n");
      out.write("                ");
                   ResultSet rsRegistros3;

                    if (conexao.abrirConexao()) {
                        meta.configurarConexao(conexao.obterConexao());

                        rsRegistros3 = meta.lerMetas();

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

                
      out.write("            \n");
      out.write("            </table>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("        </div>\n");
      out.write("        <footer class=\"page-footer font-small blue pt-4 mt-4\" style=\"color: white;\" id=\"rodape\">\n");
      out.write("            <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("                <div class=\"row\" style=\"background-color: #8A2BE2;\">\n");
      out.write("                    <div style=\"margin-left: 2%\">\n");
      out.write("                        <h5 class=\"text-uppercase\">Sobre</h5>\n");
      out.write("                        <h6>O Controlando é uma plataforma de controle de</h6>\n");
      out.write("                        <h6>finanças para sua empresa ou startup.</h6>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div style=\"margin-left:20%; margin-top: 1% \">\n");
      out.write("                        <img src=\"img/bank.png\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div style=\"margin-left: 25%\">\n");
      out.write("\n");
      out.write("                        <h6 class=\"text-uppercase\" >Confira nossas redes sociais</h6>\n");
      out.write("                        <ul class=\"list-unstyled\">\n");
      out.write("                            <li ><a href=\"https://www.instagram.com/?hl=pt-br\"><img src=\"img/instagram.png\"> <b>Instagram.com/Controlando</b> </a> </li>\n");
      out.write("                            <li><a href=\"https://pt-br.facebook.com/\"><img src=\"img/facebook.png\"><b> Facebook.cm/Controlando </b> </a> </li>\n");
      out.write("                            <li><a href=\"https://twitter.com/?lang=pt-br\"><img src=\"img/twitter.png\"> <b> Twitter.com/Controlando </b> </a> </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-copyright py-3 text-center\" style=\"background-color:#4B0082 \">\n");
      out.write("                © 2018 Copyright: Controlando\n");
      out.write("            </div>    \n");
      out.write("        </footer>\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("        <script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("        window.onload = function () {\n");
      out.write("            var chart1 = document.getElementById(\"line-chart\").getContext(\"2d\");\n");
      out.write("            window.myLine = new Chart(chart1).Line(lineChartData, {\n");
      out.write("            responsive: true,\n");
      out.write("                    scaleLineColor: \"rgba(0,0,0,.2)\",\n");
      out.write("                    scaleGridLineColor: \"rgba(0,0,0,.05)\",\n");
      out.write("                    scaleFontColor: \"#c5c7cc\"\n");
      out.write("        });\n");
      out.write("        \n");
      out.write("        var chart11 = document.getElementById(\"line-chart1\").getContext(\"2d\");\n");
      out.write("        window.myLine = new Chart(chart11).Line(secondLineChartData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    scaleLineColor: \"rgba(0,0,0,.2)\",\n");
      out.write("                    scaleGridLineColor: \"rgba(0,0,0,.05)\",\n");
      out.write("                    scaleFontColor: \"#c5c7cc\"\n");
      out.write("        });\n");
      out.write("        var chart2 = document.getElementById(\"bar-chart\").getContext(\"2d\");\n");
      out.write("        window.myBar = new Chart(chart2).Bar(barChartData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    scaleLineColor: \"rgba(0,0,0,.2)\",\n");
      out.write("                    scaleGridLineColor: \"rgba(0,0,0,.05)\",\n");
      out.write("                    scaleFontColor: \"#c5c7cc\"\n");
      out.write("            });\n");
      out.write("            var chart3 = document.getElementById(\"doughnut-chart\").getContext(\"2d\");\n");
      out.write("                window.myDoughnut = new Chart(chart3).Doughnut(doughnutData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    segmentShowStroke: false\n");
      out.write("            });\n");
      out.write("            var chart4 = document.getElementById(\"pie-chart\").getContext(\"2d\");\n");
      out.write("                window.myPie = new Chart(chart4).Pie(pieData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    segmentShowStroke: false\n");
      out.write("                });\n");
      out.write("                var chart5 = document.getElementById(\"radar-chart\").getContext(\"2d\");\n");
      out.write("                window.myRadarChart = new Chart(chart5).Radar(radarData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    scaleLineColor: \"rgba(0,0,0,.05)\",\n");
      out.write("                    angleLineColor: \"rgba(0,0,0,.2)\"\n");
      out.write("                        });\n");
      out.write("                        var chart6 = document.getElementById(\"polar-area-chart\").getContext(\"2d\");\n");
      out.write("                            window.myPolarAreaChart = new Chart(chart6).PolarArea(polarData, {\n");
      out.write("                    responsive: true,\n");
      out.write("                    scaleLineColor: \"rgba(0,0,0,.2)\",\n");
      out.write("                    segmentShowStroke: false\n");
      out.write("                    });\n");
      out.write("                            };\n");
      out.write("        </script>\t\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
