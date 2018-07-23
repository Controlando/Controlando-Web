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
        
        
        HttpSession session = request.getSession(); 
        int id = (int) session.getAttribute("id");

        out = response.getWriter();

        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Despesa desp = new Despesa();

            C_Despesa Desp = new C_Despesa(strNomeDesp, strValorDesp, strNivelDesp, strPeriodoDesp, strDataDesp, id, 0);

            if (conexao.abrirConexao()) {
                desp.configurarConexao(conexao.obterConexao());

                if (desp.inserirDespesa(Desp)) {
                    //response.sendRedirect("lancamentos.html");
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
        try {
            // data/hora atual
            LocalDateTime agora = LocalDateTime.now();

            // formatar a data
            DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String dataFormatada = formatterData.format(agora);

            // formatar a hora
            DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
            String horaFormatada = formatterHora.format(agora);

            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Historico hist = new Historico();

            C_Historico Hist = new C_Historico(horaFormatada, dataFormatada, "Usuario xxx inseriu a despesa:"+strNomeDesp+"de seguinte valor R$"+strValorDesp,6);

            if (conexao.abrirConexao()) {
                hist.configurarConexao(conexao.obterConexao());

                if (hist.inserirHistorico(Hist)) {
                    response.sendRedirect("lancamentos.html");
                } else {
                    out.println("<h2>Não foi possível cadastrar o usuário!</h2>");
                }

                conexao.fecharConexao();
            } else {
                out.println("<h2>Não foi possível estabelecer conexão com o banco de dados!</h2>");
            }

        } catch (Exception erro) {
            erro.printStackTrace();
            out.println("<h2>Erro do sistema: processo de cadastro de metas!</h2>");
        }
        out.println("<p class='RodapePagina'> Copyright(c) 2018 - Controlando </p>");
        out.println("</body>");
        out.println("</html>");
    }
}
