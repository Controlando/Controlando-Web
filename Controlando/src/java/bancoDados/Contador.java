package bancoDados;

import model.C_Contador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author e100397
 */
public class Contador {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirContador(C_Contador cont) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO contador(nome, senha, email ,adm, codigoEmpresa, status) VALUES('"+ cont.getNome()+"','"+cont.getSenha()+"','"+cont.getEmailAdm()+"'," +cont.getAdm()+","+ cont.getCodigoEmp()+","+cont.getStatus()+")";             

            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public int localizarContador(String codigo) {
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
public String localizarContadorNome(int codigo) {
        String nome = null;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT nome FROM contador WHERE codigo=" + codigo + ""; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();
            nome = rsRegistros.getString("nome");
            System.err.println("noneeee "+nome);
            return nome;
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return nome;
    }
    public boolean localizarContador(String email, String senha) {
        int intCodigoContador = 0;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT codigo FROM contador WHERE email='" + email + "' AND senha ='" + senha + "'"; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            System.out.println("contador: " + senha);

            rsRegistros.next();
            intCodigoContador = rsRegistros.getInt("codigo");
            System.out.println("contador: " + intCodigoContador);
            if (intCodigoContador > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }

    }
    public int localizarAdmin(String email, String senha, String emailEmp) {
        int intCodigoContador = 0;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT adm FROM contador C INNER JOIN empresa Emp ON (C.codigoEmpresa = Emp.codigo) WHERE C.email='" + email + "' AND C.senha ='" + senha + "' AND Emp.emailEmp = '" + emailEmp + "'"; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();

            rsRegistros.next();
            intCodigoContador = rsRegistros.getInt("adm");
            System.out.println("contador: " + intCodigoContador);
            if (intCodigoContador > 0) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception erro) {
            erro.printStackTrace();
            //return null;
        }
        return 0;
    }
public String getNomeEmpresa (int codigo) {
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
    public ResultSet lerContadorGeral() {
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

    public C_Contador getContadorByCodigo(String codigo) {
        C_Contador cont = new C_Contador();
        String strComandoSQL = "select * from contador where contador.codigo= '" + codigo + "';";

        try {
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            while (rsRegistros.next()) {
                cont.setNome(rsRegistros.getString("nome"));
                cont.setEmail(rsRegistros.getString("email"));
                cont.setSenha(rsRegistros.getString("senha"));
                
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        return cont;
    }

    public ResultSet lerContador(int intCodigoCont) {
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM contador where codigo = " + intCodigoCont;
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();

            return rsRegistros;
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public boolean alterarContador(C_Contador cont) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE contador SET nome ='" + cont.getNome() + "','"
                    + "senha = '" + cont.getSenha() + "','"
                    + "email = '" + cont.getEmail() + "','"
                    + "WHERE codigo = " + cont.getCodigo();
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean excluirContador(int intCodigo) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM contador WHERE codigo = " + intCodigo;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    
    public int localizarContadorId(String email, String senha){
        int intCodigoContador = 0;                                                              /// Peguei doo exemplo do emmerson   
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT codigo FROM contador WHERE email='" + email + "' AND senha ='" + senha +"'"; //// AJEITAR
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros= psComando.executeQuery();            
            rsRegistros.next();
            intCodigoContador = rsRegistros.getInt("codigo");
            System.out.println("contador: " + intCodigoContador);
            if (intCodigoContador > 0) {
                return intCodigoContador;
            } else {
                return intCodigoContador;
            }
        } catch (Exception erro) {
            erro.printStackTrace();
            return intCodigoContador;
        }
        
    }
    public int inserirEmpresa(String nome, String emailEmpresa) {
        String strComandoSQL;
        int idEmpresa = 0;
        try {
            strComandoSQL = "INSERT INTO empresa(nome, emailEmp) values('"+nome+"','" + emailEmpresa +"')";
            psComando = conBanco.prepareStatement(strComandoSQL, Statement.RETURN_GENERATED_KEYS);
            psComando.executeUpdate();
            rsRegistros = psComando.getGeneratedKeys();
            if(rsRegistros.next()){
                idEmpresa=(int)rsRegistros.getInt(1);
            }
            return idEmpresa;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return idEmpresa;
        
    }
}
