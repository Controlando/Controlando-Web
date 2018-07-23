package bancoDados;

import model.C_Meta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Controlando
 */
public class Meta {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirMeta(C_Meta meta) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO meta (nome, data,valor, descricao, codCont) VALUES('" + meta.getNome()+ "','" + meta.getData()+ "','" + meta.getValor()+ "','" + meta.getDescricao()+ "','" + meta.getCodFunc()+"')'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarMeta (int intCodigo, String strDescricao) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE meta SET descricao = '" + strDescricao + "'WHERE codigo =" + intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeQuery();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public boolean excluirMeta(int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM meta WHERE codigo = "+intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
        
     public ResultSet lerMetas() {
        String strComandoSQL;
        try {
           
            strComandoSQL = "select * from meta";
                        
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();
            
            return rsRegistros;
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }
}
   