package servlets;

import bancoDados.ConexaoBancoDados;
import bancoDados.Receita;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.C_Receita;

/**
 *
 * @author Emmerson
 */
public class InserirReceita extends HttpServlet {
    
    @Override
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String strNomeRec, strPeriodoRec, strDataRec;
        int intCodCont;
        float strValorRec;
        
        PrintWriter out;
        
        strNomeRec = request.getParameter("txtNomeRec");
        strValorRec = Integer.parseInt(request.getParameter("txtValorRec"));
        strPeriodoRec = request.getParameter("txtPeriodoRec");
        strDataRec = request.getParameter("txtDataRec");
        
        HttpSession session = request.getSession(); 
        int id = (int) session.getAttribute("id");
        
        
        out = response.getWriter();
                                                                                               
        try {
            out.println("<!doctype html>");
            out.println("<html>");
            out.println("<body style='background-color: #E6E6FA'>");
            ConexaoBancoDados conexao = new ConexaoBancoDados();
            Receita rec= new Receita();
                                                                //codigo, nome, valor, periodo, data, CodCont
            C_Receita Rec = new C_Receita(strNomeRec,strValorRec, strPeriodoRec,strDataRec,id,0);
           // C_Despesa Desp = new C_Despesa(strNomeDesp.toUpperCase(),strValorDesp, strNivelDesp , strPeriodoDesp.toUpperCase(),strDataDesp.toUpperCase(),intCodCont,0);
            if (conexao.abrirConexao()) {
               
                rec.configurarConexao(conexao.obterConexao());
                
                out.println(Rec.getCodigo());
                out.println(Rec.getNome());
                out.println(Rec.getValor());
                out.println(Rec.getPeriodo());
                out.println(Rec.getData());
                out.println(Rec.getCodCont());
                
                if (rec.inserirReceita(Rec)) {
                    out.print("entro3");
                    response.sendRedirect("lancamentos.html");
                } else {
                    out.println("<fieldset style='border: 1px solid #000000; background-color: white; ' >");
                    out.println("<legend style='color: #8A2BE2'> <b>Aviso</b></legend>");
                    out.println("<h2 style='color: #8A2BE2'>Não foi possível cadastrar a receita!</h2>");
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
            out.println("<h2 style='color: #8A2BE2'>Erro do sistema: processo de cadastro de receita!</h2>");
            out.println("</fieldset");
        }

        out.println("</body>");
        out.println("</html>");
    }
}
