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
public class InserirAdm extends HttpServlet {

    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String strNomeEmp, strEmailEmp, strEmailAdm, strSenha, strNome;
        PrintWriter out;

        strNomeEmp = request.getParameter("txtNomeEmp");
        strEmailEmp = request.getParameter("txtEmailEmp");
        strEmailAdm = request.getParameter("txtEmailAdm");
        strSenha = request.getParameter("txtSenha");
        strNome = request.getParameter("txtNomeAdm");
        
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        
        System.out.println("teste");
        System.out.println("teste"+strNomeEmp);
        System.out.println("teste"+strEmailEmp);
        System.out.println("teste"+strEmailAdm);
        System.out.println("teste"+strSenha);
        System.out.println("teste"+strNome);
        
        
        
        
        try {
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Contador cont = new Contador();
            
            C_Contador Cont =  new C_Contador(strNome,strSenha, strEmailAdm, 0, 1, 0,1);
            
            if (conexao.abrirConexao()) {
                int status;
                cont.configurarConexao(conexao.obterConexao());
                
                status = cont.inserirEmpresa(strNomeEmp, strEmailEmp);
                
                if (status>0) {
                    Cont.setCodigoEmp(status);
                    boolean registro = cont.inserirContador(Cont);
                    if (registro == true) {
                        response.sendRedirect("telaInicial.html");
                    } else {
                        out.println("<h2>Não foi possível cadastrar o usuario!</h2>"); 
                    }
                } else {
                    out.println("<h2>Não foi possível cadastrar a empresa!</h2>");
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
