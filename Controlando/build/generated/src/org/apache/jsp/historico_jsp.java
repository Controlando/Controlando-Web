package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class historico_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      bancoDados.ConexaoBancoDados conexao = null;
      synchronized (_jspx_page_context) {
        conexao = (bancoDados.ConexaoBancoDados) _jspx_page_context.getAttribute("conexao", PageContext.PAGE_SCOPE);
        if (conexao == null){
          conexao = new bancoDados.ConexaoBancoDados();
          _jspx_page_context.setAttribute("conexao", conexao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      bancoDados.Historico historico = null;
      synchronized (_jspx_page_context) {
        historico = (bancoDados.Historico) _jspx_page_context.getAttribute("historico", PageContext.PAGE_SCOPE);
        if (historico == null){
          historico = new bancoDados.Historico();
          _jspx_page_context.setAttribute("historico", historico, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\"> \n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" >\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" ></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"interface.css\"/> \n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"dropdown.css\"/> \n");
      out.write("        <link rel = \"stylesheet\" type = \"text/css\" href = \"interface.css\"/>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <title>Controlando - Histórico</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <header id=cabecalho>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar\" style=\"background-color: #8A2BE2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"telaPrincipal.jsp\"><h3>Controlando</h3></a>\n");
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
      out.write("                        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                            <li> \n");
      out.write("                                <form class=\"form-inline\">\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                        <button type=\"button\" class=\"dropbtn btn btn-primary btn-default btn-md my-sm-0 mr-5 ml-5 mt-3 dropdown-toggle\" style=\"background-color:#311b92; color: white;\" data-toggle=\"dropdown\" ><img src=\"img/user.png\" class=\"rounded-circle\"></button>\n");
      out.write("                                        <div class=\"dropdown-content\">\n");
      out.write("\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"configura%C3%A7ao.jsp\"><img src=\"img/settings.png\"> Configurações</a>\n");
      out.write("\n");
      out.write("                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"telaInicial.jsp\"><img src=\"img/out2.png\"> Sair</a>\n");
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
      out.write("        <br><br><br><br>\n");
      out.write("\n");
      out.write("        <article id = \"corpoPrincipal\" >\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1 style=\"text-align: center; border-width: 1px; border-style: solid; border-color:#DDA0DD;\">Histórico</h1>\n");
      out.write("                <table class=\"table\" style=\"margin-top: 5% \">\n");
      out.write("                    ");

                        ResultSet rsRegistros;

                        if (conexao.abrirConexao()) {
                            historico.configurarConexao(conexao.obterConexao());

                            rsRegistros = historico.lerHistorico();

                            if (rsRegistros != null) {
                                out.println("<tr><th>Nome do Contador</th><th>Código do contador</th><th>Data</th><th>Hora</th><th>Descrição</th></tr>");

                                while (rsRegistros.next()) {
                                    out.print("<tr>");
                                    out.print("<td scope='col'>" + rsRegistros.getString(06) + "</td>");
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

                    
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </article>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script> src = \"/jquery/dist/jquery.min.js\"</script>\n");
      out.write("        <script> src = \"/popper.js/dist/umd/popper.min.js\"</script>\n");
      out.write("        <script> src = \"/bootstrap/dist/js/bootstrap.min.js\"</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body> \n");
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
