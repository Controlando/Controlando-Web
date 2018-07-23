package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Meta;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.C_Meta;

/**
 *
 * @author Emmerson
 */
public class InserirMeta extends HttpServlet {

    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strNome, strData, strDescricao;
       
        float strValorMeta;
        PrintWriter out;

        strNome = request.getParameter("txtNomeMeta");
        strData = request.getParameter("txtDataMeta");
        strValorMeta = Integer.parseInt(request.getParameter("txtValorMeta"));
        strDescricao = request.getParameter("txtDescricaoMeta");
        
        HttpSession session = request.getSession(); 
        int id = (int) session.getAttribute("id");
        out = response.getWriter();

        
        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Meta meta= new Meta();
            
            C_Meta Meta = new C_Meta(strNome,strData,strValorMeta,strDescricao,id,0);
            
            if (conexao.abrirConexao()) {
                meta.configurarConexao(conexao.obterConexao());
                
                
                if (meta.inserirMeta(Meta)) {
                    response.sendRedirect("lancamentos.html");
                } else {
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível cadastrar a meta!</h2>");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de cadastro de metas!</h2>");
            out.println("</fieldset");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
