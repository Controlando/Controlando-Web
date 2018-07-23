/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author FerreiraDaniel
 */
public class ConsultasAleatorias {
    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;
    
    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }
    public String geNomeEmpresa (int codigo) {
        String nome = null;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT E.nome from empresa E INNER JOIN contador C ON (E.codigo = C.codigoEmpresa) WHERE C.codigo = " + codigo; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros= psComando.executeQuery();
            System.out.println("contador: " + codigo);
            
            rsRegistros.next();
            nome = rsRegistros.getString("E.nome");
            System.out.println("contador: " + nome);
            if (nome != null) {
                return nome;
            } else {
                return nome;
            }
        } catch (Exception erro) {
            erro.printStackTrace();
            return nome;
        }
    }
    

}
