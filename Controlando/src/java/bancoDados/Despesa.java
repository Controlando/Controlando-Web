package bancoDados;

import model.C_Despesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Controlando
 */
public class Despesa {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirDespesa(C_Despesa despesa) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO despesa (nome,valor, nivel, periodo,data,codCont) VALUES('" + despesa.getNome() + "','" + despesa.getValor() + "','" + despesa.getNivel() + "','" + despesa.getPeriodo() + "','" + despesa.getData() + "','" + despesa.getCodCont() + "')";
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean alterarDespesa(String strData, int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE despesa SET data = '" + strData + "'WHERE codigo =" + intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeQuery();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean excluirDespesa(int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM despesa WHERE codigo = " + intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public ResultSet lerDespesas(int codigo) {
        String strComandoSQL;

        try {

            strComandoSQL = "SELECT D.codigo, D.nome, D.valor, D.nivel, D.periodo, D.data FROM despesa D"
                    + " INNER JOIN contador C ON (D.codCont = C.codigo)"
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
