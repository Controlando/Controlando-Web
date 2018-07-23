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
public class InserirContador extends HttpServlet {

    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strNomeCont, strEmailCont, strEmailAdm, strSenha;
        PrintWriter out;

        strNomeCont = request.getParameter("txtNomeCont");
        strEmailCont = request.getParameter("txtEmailCont");
        strEmailAdm = request.getParameter("txtEmailAdm");
        strSenha = request.getParameter("txtSenhaCont");

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();

        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");

            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();

            C_Contador Cont = new C_Contador(0, strNomeCont, strSenha, strEmailCont, strEmailAdm);
            if (conexao.abrirConexao()) {
                cont.configurarConexao(conexao.obterConexao());
                out.println(Cont.getEmail());

                if (cont.inserirContador(Cont)) {

                    response.sendRedirect("contador.jsp");

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
