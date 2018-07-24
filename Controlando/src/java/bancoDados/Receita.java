package bancoDados;

import model.C_Receita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Controlando
 */
public class Receita {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirReceita(C_Receita receita) {
        String strComandoSQL;
                                            
        try {
            strComandoSQL = "INSERT INTO receita (nome,valor,periodo,data,CodCont) VALUES('" + receita.getNome()+ "','"+receita.getValor()+"','"+receita.getPeriodo()+ "','" + receita.getData()+ "','"+ receita.getCodCont()+"')";
            psComando = conBanco.prepareStatement(strComandoSQL);
            
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarReceita (String strData, int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE receita SET data = '" + strData + "'WHERE codigo =" + intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeQuery();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public boolean excluirReceita(int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM receita WHERE codigo = "+intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
        
    public ResultSet lerReceitas(int codigo) {
        String strComandoSQL;
        try {
           
           strComandoSQL = "SELECT R.codigo, R.nome, R.valor, R.periodo, R.periodo, R.data FROM receita R"
                    + " INNER JOIN contador C ON (R.codCont = C.codigo)"
                    + " INNER JOIN empresa E ON (C.codigoEmpresa = E.codigo)"
                    + " WHERE C.codigo = "+codigo;
                        
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