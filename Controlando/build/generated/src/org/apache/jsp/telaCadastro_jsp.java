package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class telaCadastro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"interface.css\"/> \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <title>Controlando - Cadastro</title>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body style=\"background-repeat:no-repeat; overflow-x: hidden; background-color: #F0F8FF;\">\n");
      out.write("        <header id=cabecalho>\n");
      out.write("            <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark scrolling-navbar\" style=\"background-color: #8A2BE2\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"telaInicial.jsp\"><h3>Controlando</h3></a>\n");
      out.write("                <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#form\" style=\"color: white;\">Início</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#rodape\" style=\"color: white;\">Sobre</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"#rodape\" style=\"color: white;\">Contato</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("        <br><br><br> \n");
      out.write("        <section  style=\"height: 700px;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"corpo\" style=\"padding-left: 35%; padding-right: 35%; height: 75%; \">\n");
      out.write("\n");
      out.write("                <form name=\"formInsereAdm\" method=\"post\" action=\"InserirAdm\" target=\"_parent\">\n");
      out.write("                    <fieldset class=\"fieldset\" id=\"fieldsetEmpresa\">\n");
      out.write("\n");
      out.write("                        <legend style=\"text-align: center\"> <b>Cadastro</b></legend>\n");
      out.write("                        <legend><b>Empresa</b></legend>\n");
      out.write("\n");
      out.write("                        <!-- Default input email -->\n");
      out.write("                        <label class=\"grey-text\" id=\"labelEmail\">Nome:</label>\n");
      out.write("                        <input name=\"txtNomeEmp\" type=\"text\" class=\"form-control\" maxlength=\"50\">\n");
      out.write("\n");
      out.write("                        <label for=\"defaultFormLoginEmailEx\" class=\"grey-text\" id=\"labelEmail\">Email:</label>\n");
      out.write("                        <input name=\"txtEmailEmp\" type=\"email\" class=\"form-control\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </fieldset>\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("\n");
      out.write("                    <fieldset class=\"fieldset\" id=\"fieldsetAdm\">\n");
      out.write("                        <legend> <b>Administrador</b></legend>\n");
      out.write("\n");
      out.write("                        <label class=\"grey-text\" id=\"labelEmail\">Nome:</label>\n");
      out.write("                        <input name=\"txtNomeAdm\" type=\"text\" class=\"form-control\" maxlength=\"50\">\n");
      out.write("                           \n");
      out.write("                        <label for=\"defaultFormLoginEmailEx\" class=\"grey-text\" id=\"labelEmail\">Email:</label>\n");
      out.write("                        <input name=\"txtEmailAdm\" type=\"email\" id=\"inputEmail\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                        <label for=\"defaultFormLoginPasswordEx\" class=\"grey-text\" id=\"labelSenha\">Senha:</label>\n");
      out.write("                        <input name=\"txtSenha\" type=\"password\" class=\"form-control\">\n");
      out.write("\n");
      out.write("                        <div class=\"text-center mt-4\">\n");
      out.write("                            <button class=\"btn btn-light-blue btn-md\" style=\"background-color: #8A2BE2; color: white\" id=\"btnCancel\" type=\"reset\" ><a style=\"color:white\">Cancelar</a></button>\n");
      out.write("                            <button class=\"btn btn-light-blue btn-md\" style=\"background-color: #8A2BE2; color: white \" id=\"btnConfirm\" type=\"submit\" > <a style=\"color:white\">Confirmar</a></button>\n");
      out.write("                        </div>                                                                                              \n");
      out.write("                    </fieldset>\n");
      out.write("                </form>\n");
      out.write("                <!-- Default form login -->\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("        </section>  \n");
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
      out.write("                        <img src=\"img/bank%20(1).png\">\n");
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
      out.write("        <script> src = \"/jquery/dist/jquery.min.js\"</script>\n");
      out.write("        <script> src = \"/popper.js/dist/umd/popper.min.js\"</script>\n");
      out.write("        <script> src = \"/bootstrap/dist/js/bootstrap.min.js\"</script>\n");
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
