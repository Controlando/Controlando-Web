
package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Meta;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author e100397
 */
public class AtualizarMeta extends HttpServlet {
    
    int intCodigo;
    String strDescricao;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        

        try{
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Meta meta = new Meta();
            if(conexao.abrirConexao()){
                meta.configurarConexao(conexao.obterConexao());

                if(!meta.alterarMeta(intCodigo, strDescricao)){
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível atualizar os dados da Meta!</h2>");
                    out.println("</fieldset");
                }else{
                    out.println("<h2> Meta alterado com sucesso</h2>");
                    out.println("<br><br><br><br>");
                    out.println("<a href='telaPrincipal.jsp'> Ir para a página principal </a>");
                }
            }
        } catch(Exception error){
            error.printStackTrace();
            out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
            out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de atualizar Meta!</h2>");
            out.println("</fieldset");
        }
        
        out.println("<p class='RodapePagina'> Copyright(c) 2018 - Controlando");
        out.println("</body>");
        out.println("/html");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
