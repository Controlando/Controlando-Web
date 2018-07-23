package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Contador;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emmerson
 */
public class PesquisarCont extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ResultSet rsRegistro;

        PrintWriter out;

        int intCodigoCont;

        intCodigoCont = Integer.parseInt(request.getParameter("txtCodCont"));

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");

            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();

            if (conexao.abrirConexao()) {
                cont.configurarConexao(conexao.obterConexao());

                if (intCodigoCont != 0) {
                    rsRegistro = cont.lerContador(intCodigoCont);
                    response.sendRedirect("contador.jsp?codigo=" + intCodigoCont);
                } else {
                    out.println("<h2>Usuário não encontrando!</h2>");
                    out.println("<br><br><br>");
                    out.println("<p class='LinkVoltar'><a href='javascript:history.back()'>[Voltar]</a></p>");
                }
                conexao.fecharConexao();
            } else {
                out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                out.println("<h2 style='color: #8A2BE2'>Não foi possível estabelecer conexão com o banco de dados!</h2>");
                out.println("</fieldset");
            }

        } catch (Exception erro) {
            erro.printStackTrace();
            out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
            out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de pesquisa de contador!</h2>");
            out.println("</fieldset");
        }
        out.println("<p class='RodapePagina'>Copyright(c) 2018 - Controlando.</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
