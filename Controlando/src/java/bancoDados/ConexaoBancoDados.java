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
 * @author Lucas Mozão
 */
public class ConexaoBancoDados {

    Connection conBanco;

    public boolean abrirConexao() {
        String url = "jdbc:mysql://localhost/controlando", user = "root", password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            //conBanco = DriverManager.getConnection(url, user, password);
            conBanco = DriverManager.getConnection("jdbc:mysql://127.0.0.1/controlando?useSSL=false","root","root");
            System.out.println("FUNCIONA CARALHO");
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }

    }

    public boolean fecharConexao() {
        try {
            conBanco.close();
            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public Connection obterConexao() {
        return conBanco;
    }

}
