package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Contador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
        strSenha = request.getParameter("txtSenhaCont");
        
        HttpSession session = request.getSession(); 
        
        String senha = (String) session.getAttribute("password");
        String emailIndividual = (String) session.getAttribute("emailIndividual");
        String emailEmp = (String) session.getAttribute("emailEmpresa");
        int id = (int) session.getAttribute("idPessoa");

        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        System.err.println("pao email empresa: "+emailEmp);
        Contador c = new Contador();
        ConexaoBancoDados con = new ConexaoBancoDados();
        boolean teste = con.abrirConexao();
        c.configurarConexao(con.obterConexao());
        int codigoEmp = c.getCodEmp(emailEmp);
        System.err.println("pao numero: "+codigoEmp);
        
        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");

            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();
            
       //String nome, String senha, String emailAdm, int codigoEmp, int adm, int codigoAdm, int status) - como ta no C_Contador
            
            C_Contador Cont = new C_Contador(strNomeCont, strSenha, strEmailCont,codigoEmp,0,id,1);
            if (conexao.abrirConexao()) {
                cont.configurarConexao(conexao.obterConexao());
                 System.out.println(strNomeCont);
                 System.out.println(strSenha);
                 System.out.println(emailIndividual);
                 System.out.println(codigoEmp);
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
