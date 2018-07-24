package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class telaPrincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\"> \n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" >\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" ></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" ></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" ></script>\n");
      out.write("      \n");
      out.write("    <link rel = \"stylesheet\" type = \"text/css\" href = \"interface.css\"/> \n");
      out.write("    <link rel = \"stylesheet\" type = \"text/css\" href = \"dropdown.css\"/> \n");
      out.write("      \n");
      out.write("  \n");
      out.write("    <title>Controlando - Bem-vindo!</title>\n");
      out.write("         \n");
      out.write("  </head>\n");
      out.write("    \n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");

        String senha = (String) session.getAttribute("password");
        String emailIndividual = (String) session.getAttribute("emailIndividual");
        String emailEmp = (String) session.getAttribute("emailEmpresa");
        int id = (int) session.getAttribute("id");
        if (senha == null) {
            response.sendRedirect("telaInicial.html");
        } 
    
      out.write("\n");
      out.write("<!--Main Navigation-->\n");
      out.write("        <header id=cabecalho>\n");
      out.write("\n");
      out.write("            <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar\" style=\"background-color: #8A2BE2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"telaPrincipal.jsp\"><h3>Controlando</h3></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        \n");
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
      out.write("                        ");

                            boolean admin = (boolean) session.getAttribute("administrador");
        
                            if (admin) {
                                out.println("<li class='nav-item'>");
                                out.println("<button id = 'contador' type='button' class='btn btn-primary' data-toggle='modal' style='background-color: #8A2BE2; border-color: #8A2BE2;'> <a href='contador.jsp' style='color: white'>Contador</a></button>");
                                out.println("</li>");    
                            }
                        
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"md-form left ml-auto\">\n");
      out.write("                       <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                            <li> \n");
      out.write("                                <form class=\"form-inline\">\n");
      out.write("                                    <div class=\"dropdown\">\n");
      out.write("                                       <button type=\"button\" class=\"dropbtn btn btn-primary btn-default btn-md my-sm-0 mr-5 ml-5 mt-3 dropdown-toggle\" style=\"background-color:#311b92; color: white;\" data-toggle=\"dropdown\" ><img src=\"img/user.png\" class=\"rounded-circle\"></button>\n");
      out.write("                                      <div class=\"dropdown-content\">\n");
      out.write("                            \n");
      out.write("                                            <a class=\"dropdown-item\" href=\"configuracao.jsp\"><img src=\"img/settings.png\"> Configurações</a>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"dropdown-divider\"></div>\n");
      out.write("                                            <a class=\"dropdown-item\" href=\"Deslogar.jsp\"><img src=\"img/out2.png\"> Sair</a>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                        </li>\n");
      out.write("                        </ul>  \n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>    \n");
      out.write("    \n");
      out.write("    </header>\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <article id = \"corpoPrincipal\" >\n");
      out.write("        \n");
      out.write("        <section id=\"coluna_esquerda\"  >\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"card card-body\" style=\"width: 100%; height: 80%; background:#4B088A;width: 120%; height: 80%;\">\n");
      out.write("            <p class=\"card-title\" style=\"color:white; font-size:120%\">Boa tarde, @NomeUsuário! </p>\n");
      out.write("            <p class=\"card-text\" style=\"text-align:center; color:white; font-size:200%; margin-top:10%\">R$ 0,00 <br> Saldo Geral</p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("        <div class=\"card card-body\" style=\"width: 120%; height: 80%;\">\n");
      out.write("            \n");
      out.write("            <h4 class=\"card-title\" style=\"font-size: 130%; font-family:Calibri Light;\"> \n");
      out.write("                <b>Contas a pagar <input type=\"image\" src=\"img/plus2.png\" alt=\"Submit\" style=\"margin-left:40%\"> <input type=\"image\" src=\"img/trash.png\" alt=\"Submit\"></b>\n");
      out.write("            </h4>\n");
      out.write("            <p class=\"card-text\"><br>Não há despesas inseridas.</p>\n");
      out.write("            <p class=\"card-text\"><a href=\"lancamentos.jsp\">Adicione suas despesas aqui!</a></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("        <div class=\"card card-body\"  style=\"width: 120%; height: 80%;\" >\n");
      out.write("    \n");
      out.write("            <h4 class=\"card-title\" style=\"font-size: 130%; font-family:Calibri Light;\"> \n");
      out.write("                <b>Contas a receber<input type=\"image\" src=\"plus2.png\" alt=\"Submit\" style=\"margin-left:40%\"> <input type=\"image\" src=\"img/trash.png\" alt=\"Submit\"></b>\n");
      out.write("            </h4>    \n");
      out.write("            <p class=\"card-text\"><br>Não há contas a receber.</p>\n");
      out.write("             <p class=\"card-text\"><a href=\"lancamentos.jsp\">Adicione suas receitas aqui!</a></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <br>    \n");
      out.write("        <div class=\"card card-body\" style=\"width: 120%; height: 65%;\" >\n");
      out.write("            <h4 class=\"card-title\" style=\"font-size: 130%; font-family:Calibri Light;\"><b>Dúvidas</b></h4>\n");
      out.write("            <p class=\"card-text\"><a href=\"Link Aqui\">Pergunta 1</a></p>\n");
      out.write("            <p class=\"card-text\"><a href=\"Link Aqui\">Pergunta 1</a></p>\n");
      out.write("            <p class=\"card-text\"><a href=\"Link Aqui\">Pergunta 1</a></p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section id=\"coluna_direita\">\n");
      out.write("        <br><br>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"card card-body\" id = \"botoes\" style=\"width: 120%; height: 60%;\" >\n");
      out.write("            <h4 class=\"card-title\" style=\"font-size: 130%; font-family:Calibri Light;\"><b>Acesso rápido</b></h4>\n");
      out.write("            <br>\n");
      out.write("          \n");
      out.write("            <div style=\"display: inline;\">\n");
      out.write("                \n");
      out.write("            <div class=\"botao\" style=\"float: left; margin-right: 2%\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-success\"><a href=\"lancamentos.jsp\"> Despesas </a></button>\n");
      out.write("                                                                       \n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"botao\" style=\"float: left;\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-primary\"><a href=\"lancamentos.jsp\">Receitas </a></button>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            <div class=\"botao\" style=\"float: left; margin-left: 2%\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-outline-secondary\"><a href=\"relatorioView.jsp\">Relatórios</a></button>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("        <div class=\"card card-body\" style=\"width: 120%; height: 80%;\" >\n");
      out.write("            <h4 class=\"card-title\" style=\"font-size: 130%; font-family:Calibri Light;\"><b>Urgências</b></h4>\n");
      out.write("            <p class=\"card-text\">Aqui serão listadas as contas a serem pagas com um nível de urgência mais alto.</p>\n");
      out.write("            \n");
      out.write("            <div class=\"flex-row\">\n");
      out.write("                <p class=\"card-text\"><a href=\"lancamentos.jsp\">Adicione despesas aqui!</a></p>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("        <br>\n");
      out.write("            \n");
      out.write("        <div class=\"card card-body\" style=\"width: 120%; height: 80%;\">\n");
      out.write("            <h4 class=\"card-title\" style=\"font-family:Calibri Light;\"><b>Metas do mês</b></h4>\n");
      out.write("            <p class=\"card-text\">Nenhuma meta adicionada ainda.</p>\n");
      out.write("            <p class=\"card-text\"><a href=\"lancamentos.jsp\">Adicione suas metas aqui!</a></p>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>    \n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("    </article>\n");
      out.write("    \n");
      out.write("    <footer class=\"page-footer font-small blue pt-4 mt-4\" style=\"color: white;\" id=\"rodape\">\n");
      out.write("        <div class=\"container-fluid text-center text-md-left\">\n");
      out.write("            <div class=\"row\" style=\"background-color: #8A2BE2;\">\n");
      out.write("                <div style=\"margin-left: 2%\">\n");
      out.write("                    <h5 class=\"text-uppercase\">Sobre</h5>\n");
      out.write("                    <h6>O Controlando é uma plataforma de controle de</h6>\n");
      out.write("                    <h6>finanças para sua empresa ou startup.</h6>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div style=\"margin-left:20%; margin-top: 1% \">\n");
      out.write("                    <img src=\"img/bank.png\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div style=\"margin-left: 25%\">\n");
      out.write("                   \n");
      out.write("                    <h6 class=\"text-uppercase\" >Confira nossas redes sociais</h6>\n");
      out.write("                    <ul class=\"list-unstyled\">\n");
      out.write("                        <li ><a href=\"https://www.instagram.com/?hl=pt-br\"><img src=\"img/instagram.png\"> <b>Instagram.com/Controlando</b> </a> </li>\n");
      out.write("                        <li><a href=\"https://pt-br.facebook.com/\"><img src=\"img/facebook.png\"><b> Facebook.cm/Controlando </b> </a> </li>\n");
      out.write("                        <li><a href=\"https://twitter.com/?lang=pt-br\"><img src=\"img/twitter.png\"> <b> Twitter.com/Controlando </b> </a> </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"footer-copyright py-3 text-center\" style=\"background-color:#4B0082 \">\n");
      out.write("            © 2018 Copyright: Controlando\n");
      out.write("        </div>    \n");
      out.write("    </footer>\n");
      out.write("    \n");
      out.write("    <script> src=\"/jquery/dist/jquery.min.js\"</script>\n");
      out.write("    <script> src=\"/popper.js/dist/umd/popper.min.js\"</script>\n");
      out.write("    <script> src=\"/bootstrap/dist/js/bootstrap.min.js\"</script>\n");
      out.write("    \n");
      out.write("</body> \n");
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
