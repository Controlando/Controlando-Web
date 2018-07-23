
//     *** PRECISA AJEITAR O ADM DO PACOTE BANCODADOS ***

package servlets;

import bancoDados.Adm;
import bancoDados.ConexaoBancoDados;
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
public class AtualizarAdm extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String strDescricao = null;
            int intCodigoEspecialidade = 0;
            processRequest(request, response);
            strDescricao = request.getParameter("txtDescricao");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AtualizarAdm</title>");
            out.println("<link href='interface.css' rel='stylesheet' type='text/css'>");           
            out.println("</head>");
            out.println("<body style='background-color: #E6E6FA'");
            out.println("<p class='TitiloPagina'> Atualizar dados do Administrador");


        /*try{
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Adm adm = new Adm();
            if(conexao.abrirConexao()){
                adm.configurarConexao(conexao.obterConexao());

                if(adm.alterarAdm(intCodigoEspecialidade, strDescricao)){
                    out.println("<h2> Dados de Especialidade alterados com sucesso</h2>");
                    out.println("<br><br><br><br>");
                    out.println("<a href='menu_especialidades.html'> Voltar </a>");
                }else{
                    out.println("<h2>Não foi possível atualizar os dados da Especialidade</h2>");
               }
            }
        } catch(Exception error){
            error.printStackTrace();
               out.println("<h2> Erro do sistema </h2>");
        }*/
        
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
