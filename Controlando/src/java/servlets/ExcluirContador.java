package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Contador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emmerson
 */
public class ExcluirContador extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int strCod;
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        strCod = Integer.parseInt(request.getParameter("txtCodCont"));
 
        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();

            if (conexao.abrirConexao()) {
                cont.configurarConexao(conexao.obterConexao());

                if (cont.excluirContador(strCod)) {
                    response.sendRedirect("contador.jsp");
                } else {
                   out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível excluir o registro do Contador!</h2>");
                    out.println("</fieldset");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: Processo de exclusão do Contador!</h2>");
            out.println("</fieldset");
        }
        
        out.println("<p class='RodapePagina'>Copyright(c) 2018 - Controlando</p>");
        out.println("</body>");
        out.println("</html>");
        
    }
}
