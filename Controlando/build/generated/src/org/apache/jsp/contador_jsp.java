package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import model.C_Contador;

public final class contador_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      bancoDados.ConexaoBancoDados conexao = null;
      synchronized (_jspx_page_context) {
        conexao = (bancoDados.ConexaoBancoDados) _jspx_page_context.getAttribute("conexao", PageContext.PAGE_SCOPE);
        if (conexao == null){
          conexao = new bancoDados.ConexaoBancoDados();
          _jspx_page_context.setAttribute("conexao", conexao, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      bancoDados.Contador contador = null;
      synchronized (_jspx_page_context) {
        contador = (bancoDados.Contador) _jspx_page_context.getAttribute("contador", PageContext.PAGE_SCOPE);
        if (contador == null){
          contador = new bancoDados.Contador();
          _jspx_page_context.setAttribute("contador", contador, PageContext.PAGE_SCOPE);
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
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <!-- <link rel=\"style\" type=\"text/css\" href=\"interf.css\"> -->\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" integrity=\"sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4\" crossorigin=\"anonymous\">\n");
      out.write("        -->\n");
      out.write("        <title>Controlando - Contador</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("        <!--Main Navigation-->\n");
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
      out.write("                            <button id = \"botao\" type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" style=\"background-color: #8A2BE2; border-color: #8A2BE2;\"> <a href=\"lancamentos.jsp\" style=\"color: white\">Lançamentos</a></button>\n");
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
      out.write("                                            <a class=\"dropdown-item\" href=\"configura%C3%A7ao.jsp\"><img src=\"img/settings.png\"> Configurações</a>\n");
      out.write("\n");
      out.write("                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                            <a class=\"dropdown-item\"href=\"telaInicial.jsp\"><img src=\"img/out2.png\"> Sair</a>\n");
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
      out.write("        <!-- Modal -->\n");
      out.write("        <div class=\"modal fade\" id=\"modal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" style=\"width:400px;\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h3 class=\"modal-title\" id=\"exampleModalLongTitle\">Cadastro Contador</h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" style=\"width: 400px;\">\n");
      out.write("                        <form name=\"formInsereAdm\" method=\"post\" action=\"InserirContador\" target=\"_parent\">\n");
      out.write("                            <div>\n");
      out.write("                                <p>Nome:</p>\n");
      out.write("                                <input type=\"text\"  name=\"txtNomeCont\"  class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("\n");
      out.write("                                <p>Email:</p>\n");
      out.write("                                <input type=\"email\" name=\"txtEmailCont\" class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("\n");
      out.write("                                <p> Senha:</p>\n");
      out.write("                                <input type=\"password\" name=\"txtSenhaCont\" class=\"form-control\" style=\"margin-bottom: 3%\">   \n");
      out.write("\n");
      out.write("                                 \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">\n");
      out.write("                        <button type=\"reset\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\" style=\"background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;\" > Cancelar</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter2\" style=\"background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;\" > Cadastrar</button>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"modal fade\" id=\"modal2\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" style=\"width:400px;\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h3 class=\"modal-title\" id=\"exampleModalLongTitle\">Alteração do Contador</h3>\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                            <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\" style=\"width: 400px;\">\n");
      out.write("                        ");
C_Contador Cont = new C_Contador();
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <p>Código:</p>\n");
      out.write("                            <input type=\"text\"  name=\"txtCodCont\"  class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("                            <button type=\"submit\"  class=\"btn btn-primary\" name=\"btnPesquisar\" data-target=\"#exampleModalCenter2\">Pesquisar</button>\n");
      out.write("\n");
      out.write("                            ");
 if (request.getParameter("btnPesquisar") != null) {
                                    Cont = contador.getContadorByCodigo(request.getParameter("txtCodCont").toString());
                                }
                            
      out.write("\n");
      out.write("                            <form name=\"formInsereAdm\" method=\"post\" action=\"AtualizarContador\" target=\"_parent\">\n");
      out.write("\n");
      out.write("                                <p>Nome:</p>\n");
      out.write("                                <input type=\"text\" value=\"");
      out.print(Cont.getNome());
      out.write("\" name=\"txtNomeCont\"  class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("\n");
      out.write("                                <p>Email:</p>\n");
      out.write("                                <input type=\"email\" value=\"");
      out.print(Cont.getEmailAdm());
      out.write("\"name=\"txtEmailCont\" class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("\n");
      out.write("                                <p> Senha:</p>\n");
      out.write("                                <input type=\"password\" value=\"");
      out.print(Cont.getSenha());
      out.write("\" name=\"txtSenhaCont\" class=\"form-control\" style=\"margin-bottom: 3%\">   \n");
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                <input type=\"text\" name=\"txtEmailAdm\" class=\"form-control\" style=\"margin-bottom: 3%\">  \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"modal-footer\">\n");
      out.write("                                    <button type=\"reset\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter\" style=\"background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;\" > Cancelar</button>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter2\" style=\"background-color: #8A2BE2; border-color: #8A2BE2; top: 20px;\" > Cadastrar</button>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"modal fade\" id=\"modal3\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog modal-dialog-centered\" role=\"document\" style=\"width:400px;\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header\">\n");
      out.write("                            <h3 class=\"modal-title\" id=\"exampleModalLongTitle\">Confirmação de Exclusão</h3>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body\" style=\"width: 400px;\">\n");
      out.write("                            <div>\n");
      out.write("                                <form name=\"formExcluirCont\" method=\"post\" action=\"ExcluirContador\" target=\"_parent\">\n");
      out.write("                                    <p>Código:</p>\n");
      out.write("                                    <input type=\"text\"  name=\"txtCodCont\"  class=\"form-control\" style=\"margin-bottom: 3%\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"modal-footer\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#exampleModalCenter2\"> Excluir</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <br><br><br><br>\n");
      out.write("\n");
      out.write("                    <section id = \"corpoPrincipal\" >\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 style=\"text-align: center\">Contador</h1> \n");
      out.write("                            <table class=\"table\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td scope=\"col\"> <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal1\" style=\"background-color: white; border-color: white; color: black\"><img src=\"img/plus.png\">  Adicionar contador </button></td>\n");
      out.write("\n");
      out.write("                                    <td scope=\"col\"> <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal2\" style=\"background-color: white; border-color: white; color: black\"><img src=\"img/edit.png\">  Alterar contador </button></td>\n");
      out.write("\n");
      out.write("                                    <td scope=\"col\"> <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#modal3\" style=\"background-color: white; border-color: white; color: black\"><img src=\"img/trash.png\">  Excluir contador </button></td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            <br>\n");
      out.write("\n");
      out.write("                            <table class=\"table\" style=\"margin-top: 2%\">\n");
      out.write("                                ");

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

                                
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </section>\n");
      out.write("\n");
      out.write("                    <footer class=\"page-footer font-small blue pt-4 mt-4\" style=\"color: white;\" id=\"rodape\">\n");
      out.write("                        <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("                            <div class=\"row\" style=\"background-color: #8A2BE2;\">\n");
      out.write("                                <div style=\"margin-left: 2%\">\n");
      out.write("                                    <h5 class=\"text-uppercase\">Sobre</h5>\n");
      out.write("                                    <h6>O Controlando é uma plataforma de controle de</h6>\n");
      out.write("                                    <h6>finanças para sua empresa ou startup.</h6>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-left:20%; margin-top: 1% \">\n");
      out.write("                                    <img src=\"img/bank%20(1).png>\n");
      out.write("                                         </div>\n");
      out.write("\n");
      out.write("                                         <div style=\"margin-left: 25%\">\n");
      out.write("\n");
      out.write("                                         <h6 class=\"text-uppercase\" >Confira nossas redes sociais</h6>\n");
      out.write("                                    <ul class=\"list-unstyled\">\n");
      out.write("                                        <li ><a href=\"https://www.instagram.com/?hl=pt-br\"><img src=\"img/instagram.png\"> <b>Instagram.com/Controlando</b> </a> </li>\n");
      out.write("                                        <li><a href=\"https://pt-br.facebook.com/\"><img src=\"img/facebook.png\"><b> Facebook.cm/Controlando </b> </a> </li>\n");
      out.write("                                        <li><a href=\"https://twitter.com/?lang=pt-br\"><img src=\"img/twitter.png\"> <b> Twitter.com/Controlando </b> </a> </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"footer-copyright py-3 text-center\" style=\"background-color:#4B0082 \">\n");
      out.write("                            © 2018 Copyright: Controlando\n");
      out.write("                        </div>    \n");
      out.write("                    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- \n");
      out.write("                    <script> src=\"/jquery/dist/jquery.min.js\"</script>\n");
      out.write("                    <script> src=\"/popper.js/dist/umd/popper.min.js\"</script>\n");
      out.write("                    <script> src=\"/bootstrap/dist/js/bootstrap.min.js\"</script>\n");
      out.write("                    -->\n");
      out.write("                    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" ></script>\n");
      out.write("                    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" ></script>\n");
      out.write("                    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </body> \n");
      out.write("                    </html>");
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
