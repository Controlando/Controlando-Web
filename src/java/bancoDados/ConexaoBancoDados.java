/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDados;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aluno
 */
public class ConexaoBancoDados {
    Connection conBanco;
    
    public boolean abrirConexao(){
        String url = "jdbc:mysql://localhost/controlando?user=root&password=root";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conBanco = DriverManager.getConnection(url);
            return true;
        }
        catch(Exception erro){
            erro.printStackTrace();
            return false;
        }
    }

    public Connection obterConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void fecharConexao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
