package bancoDados;

import model.C_Historico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author e100397
 */

public class Historico {
    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;
    
    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }
    
    public boolean inserirHistorico(C_Historico historico) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO historico(hora,data,descricao, codContador) VALUES('" + historico.getCodigo() + historico.getNome() + contador.getSenha() + contador.getEmail() + contador.getEmailAdm();
             
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public int localizarHistorico(String codigo) {
        int intCodigoContador = 0;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT codigo FROM contador WHERE codigo='" + intCodigoContador + "'"; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros.next();

            intCodigoContador = rsRegistros.getInt("codigo");
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return intCodigoContador;
    }
    
    public ResultSet lerHistorico() {
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM contador";
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();

            return rsRegistros;
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }
    
    public boolean alterarContador(C_Historico historico) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE historico SET codContador='"    /// Histórico não tem chave primária, o q fazer
                + historico.getHora() + "'," 
                + historico.getData() + "'," 
                + historico.getDescricao() + "',"
                + historico.getCodContador() + "',"           
                + "WHERE codigo = " + historico.getCodigo();        // Histórico não tem chave primária, o q fazer 
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public boolean excluirContador(C_Historico historico) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM contador WHERE codigo = " + contador.getCodigo();   //Histórico n tem chave primária, h e l p
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
}
