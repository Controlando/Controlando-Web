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

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=utf-8' />");
        out.println("<title>SGC - Versão 1.0</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p class='TituloAplicacao'>SGC - Sistema de Gestão de Clínicas 1.0 </p>");
        out.println("<p class='TituloPagina'>Cadastro de Usuários </p>");

        try {
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Adm adm = new Adm();

            C_Adm Adm = new C_Adm(strNomeEmp.toUpperCase(), strEmailEmp.toUpperCase(), strEmailAdm.toUpperCase(), strSenha.toUpperCase());

            if (conexao.abrirConexao()) {
                adm.configurarConexao(conexao.obterConexao());

                if (adm.inserirRegistro(Adm)) {
                    out.println("<h2>Administrador cadastrado com sucesso!</h2>");
                    out.println("<br><br><br><br>");
                    out.println("<a href='telaInicial.html'>Voltar</a>");
                } else {
                    out.println("<h2>Não foi possível cadastrar o usuário!</h2>");
                }

                conexao.fecharConexao();
            } else {
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");
            }

        } catch (Exception erro) {
            erro.printStackTrace();
            out.println("<h2>Erro do sistema: processo de cadastro de usuário!</h2>");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
