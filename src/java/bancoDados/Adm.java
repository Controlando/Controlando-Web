package bancoDados;

import model.C_Adm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Emmerson
 */
public class Adm {

    private Connection conBanco;
    private PreparedStatement psComando;
    private ResultSet rsRegistros;

    public void configurarConexao(Connection conBanco) {
        this.conBanco = conBanco;
    }

    public boolean inserirRegistro(C_Adm adm) {
        String strComandoSQL;

        try {
            strComandoSQL = "INSERT INTO administrador(email,senha, emailEmp, nomeEmp) VALUES('" + adm.getEmail() + adm.getSenha() + adm.getEmailEmp() + adm.getNomeEmp();
             
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    /*
    public int localizarRegistro(String strUsuario) {
        int intCodigoUsuario = 0;
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT Registro_Usuario FROM usuarios WHERE Identificacao_Usuario='" + strUsuario + "'";
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros.next();

            intCodigoUsuario = rsRegistros.getInt("Registro_Usuario");
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        return intCodigoUsuario;
    }

    public ResultSet lerRegistro(int intCodigoUsuario) {
        String strComandoSQL;

        try {
            strComandoSQL = "SELECT * FROM usuarios WHERE Registro_Usuario = " + intCodigoUsuario;
            psComando = conBanco.prepareStatement(strComandoSQL);
            rsRegistros = psComando.executeQuery();
            rsRegistros.next();

            return rsRegistros;
        } catch (Exception erro) {
            erro.printStackTrace();
            return null;
        }
    }

    public boolean alterarRegistro(C_Usuarios usuario) {
        String strComandoSQL;

        try {
            strComandoSQL = "UPDATE usuarios SET Identificacao_Usuario='" + usuario.getIdUsuario() + "'," + usuario.getIdUsuario() + "',"
                    + "Senha_Acesso = '" + usuario.getSenhaAcesso() + "',"
                    + "Cadastro_Funcionario = '" + usuario.getCadastroFuncionario() + "',"
                    + "Cadastro_Usuario = '" + usuario.getCadastroUsuario() + "',"
                    + "Cadastro_Paciente = '" + usuario.getCadastroPaciente() + "',"
                    + "Cadastro_Especialidade = '" + usuario.getCadastroEspecialidade() + "',"
                    + "Cadastro_Medico = '" + usuario.getCadastroMedico() + "',"
                    + "Cadastro_Convenio = '" + usuario.getCadastroConvenio() + "',"
                    + "Agendamento_Consulta = '" + usuario.getAgendamentoConsulta() + "',"
                    + "Cancelamento_Consulta = '" + usuario.getCancelamentoConsulta() + "',"
                    + "Modulo_Administrativo = '" + usuario.getModuloAdministrativo() + "',"
                    + "Modulo_Agendamento = '" + usuario.getModuloAgendamento() + "',"
                    + "Modulo_Atendimento = '" + usuario.getModuloAtendimento() + "',"
                    + "WHERE Registro_Usuario = " + usuario.getCodigoUsuario();
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }

    public boolean excluirRegistro(int intCodigoUsuario) {
        String strComandoSQL;

        try {
            strComandoSQL = "DELETE FROM usuarios WHERE Registro_Usuario = " + intCodigoUsuario;
            psComando = conBanco.prepareStatement(strComandoSQL);
            psComando.executeUpdate();

            return true;
        } catch (Exception erro) {
            erro.printStackTrace();
            return false;
        }
    }
    */
}
