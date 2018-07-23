package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Adm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.C_Adm;

/**
 *
 * @author Emmerson
 */
public class InserirAdm extends HttpServlet {

    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strNomeEmp, strEmailEmp, strEmailAdm, strSenha;
        PrintWriter out;

        strNomeEmp = request.getParameter("txtNomeEmp");
        strEmailEmp = request.getParameter("txtEmailEmp");
        strEmailAdm = request.getParameter("txtEmailAdm");
        strSenha = request.getParameter("txtSenha");
        

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Adm adm = new Adm();
    
            C_Adm Adm = new C_Adm(strEmailAdm.toUpperCase(),strSenha.toUpperCase(),strEmailEmp.toUpperCase(), strNomeEmp.toUpperCase());
            if (conexao.abrirConexao()) {
                adm.configurarConexao(conexao.obterConexao());
                out.println(Adm.getEmail());

                if (adm.inserirRegistro(Adm)) {
                   
                    response.sendRedirect("telaInicial.html");
  
                    
                    //JOptionPane.showMessageDialog(null, "Cadastramento feito com sucesso!");
                } else {
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível cadastrar o usuário!</h2>");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de cadastro de usuário!</h2>");
            out.println("</fieldset");
        }

        out.println("<p class='RodapePagina'> Copyright(c) 2018 - Controlando </p>");

        out.println("</body>");
        out.println("</html>");
    }
}
