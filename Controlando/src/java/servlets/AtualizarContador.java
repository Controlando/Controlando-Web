package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Contador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.C_Contador;

/**
 *
 * @author Emmerson
 */
public class AtualizarContador extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String strNome, strEmail, strSenha;
        
        int intCodigoCont;
        PrintWriter out;

        strNome = request.getParameter("txtNomeCont");
        strEmail = request.getParameter("txtEmailCont");
        strSenha = request.getParameter("txtSenhaCont");
       

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();

            C_Contador Cont = new C_Contador(0,strNome,strSenha,strEmail,"");

            if (conexao.abrirConexao()) {
                cont.configurarConexao(conexao.obterConexao());
                if (cont.alterarContador(Cont)) {
                   response.sendRedirect("contador.jsp");
                } else {
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível atualizar os dados do contador!</h2>");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de alterar contador!</h2>");
            out.println("</fieldset");
        }
        out.println("<p class='RodapePagina'> Copyright(c) 2018 - Controlando</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
