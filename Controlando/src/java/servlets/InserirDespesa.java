package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Despesa;
import bancoDados.Historico;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.C_Despesa;
import model.C_Historico;

/**
 *
 * @author Emmerson
 */
public class InserirDespesa extends HttpServlet {

    //nome,valor,periodo,data,codCont
    @Override

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strNomeDesp, strPeriodoDesp, strDataDesp, strNivelDesp;
        int intCodCont;
        float strValorDesp;
        PrintWriter out;

        strNomeDesp = request.getParameter("txtNomeDesp");
        strValorDesp = Integer.parseInt(request.getParameter("txtValorDesp"));
        strNivelDesp = request.getParameter("txtNivelDesp");
        strPeriodoDesp = request.getParameter("txtPeriodoDesp");
        strDataDesp = request.getParameter("txtDataDesp");
        System.out.println("socroo0");
        
        HttpSession session = request.getSession(); 
        int id = (int) session.getAttribute("idPessoa");

        out = response.getWriter();
System.out.println("socorro1");
        try {
            System.out.println(id);
            System.out.println("socorro2");
            
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Despesa desp = new Despesa();

            C_Despesa Desp = new C_Despesa(strNomeDesp, strValorDesp, strNivelDesp, strPeriodoDesp, strDataDesp, id, 0);

            if (conexao.abrirConexao()) {
                desp.configurarConexao(conexao.obterConexao());

                if (desp.inserirDespesa(Desp)) {
                    response.sendRedirect("lancamentos.jsp");
                } else {
                   out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível cadastrar a despesa!</h2>");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de cadastro de despesas!</h2>");
            out.println("</fieldset");
        }
        
        out.println("<p class='RodapePagina'> Copyright(c) 2018 - Controlando </p>");
        out.println("</body>");
        out.println("</html>");
    }
}
