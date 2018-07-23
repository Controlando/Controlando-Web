package servlets;

import bancoDados.Despesa;
import bancoDados.ConexaoBancoDados;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author e100397
 */
public class ExcluirDespesa extends HttpServlet {
    
    int intCodigo;
    
    @Override
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<body style='background-color: #E6E6FA'>");
        
        try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Despesa despesa = new Despesa();
            
            if(conexao.abrirConexao()){
                despesa.configurarConexao(conexao.obterConexao());
                
                if(despesa.excluirDespesa(Integer.parseInt(request.getParameter("intCodigo")))){
                   out.println("<h2>Despesa excluída com sucesso!</h2>");
                    out.println("<br><br><br><br>");
                    out.println("<a href='telaPrincipal.jsp'> Ir para a página principal </a>");                    
            
                }else
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível excluir o registro de Despesa!</h2>");
                    out.println("</fieldset");  
                conexao.fecharConexao();
            }else
               out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                out.println("<h2 style='color: #8A2BE2'>Não foi possível estabelecer conexão com o banco de dados!</h2>");
                out.println("</fieldset");             
               
        }catch(Exception erro){
            erro.printStackTrace();
            out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
            out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: Processo de exclusão do Despesa!</h2>");
            out.println("</fieldset");
        }
        out.println("<p class='RodapePagina'>Copyright(c) 2018 - Controlando</p>");
        out.println("</body>");
        out.println("</html>");
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
